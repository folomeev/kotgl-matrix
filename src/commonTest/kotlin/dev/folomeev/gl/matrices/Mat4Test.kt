package dev.folomeev.gl.matrices

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class Mat4Test {

    private fun indexesToInt(i: Int, j: Int) = i * 4 + j

    private fun indexesToFloat(i: Int, j: Int) = indexesToInt(i, j).toFloat()

    @Test
    fun equalsAll() =
        assertEquals(
            mat4(::indexesToFloat),
            mat4(::indexesToFloat)
        )

    @Test
    fun hashCodeEquals() =
        assertEquals(
            mat4(::indexesToFloat).hashCode(),
            mat4(::indexesToFloat).hashCode()
        )

    @Test
    fun notEquals_singleElementDiffers() {
        val expected = mat4 { i, j -> indexesToInt(i, j).toFloat() }
        for (k in 0..15) {
            assertNotEquals(
                expected,
                mat4 { i, j -> indexesToInt(i, j).run { if (this == k) -1f else toFloat() } },
                "Values expected not equals for element #$k"
            )
        }
    }

    @Test
    fun hashNotEquals_singleElementDiffers() {
        val hashCode = mat4 { i, j -> indexesToInt(i, j).toFloat() }.hashCode()
        for (k in 0..15) {
            assertNotEquals(
                hashCode,
                mat4 { i, j -> indexesToInt(i, j).run { if (this == k) -1f else toFloat() } }.hashCode(),
                "Values expected not equals for element #$k"
            )
        }
    }
}