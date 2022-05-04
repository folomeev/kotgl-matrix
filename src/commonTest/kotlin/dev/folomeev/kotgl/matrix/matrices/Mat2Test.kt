package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class Mat2Test {

    private fun indexesToInt(i: Int, j: Int) = i * 2 + j

    private fun indexesToFloat(i: Int, j: Int) = indexesToInt(i, j).toFloat()

    @Test
    fun equalsAll() =
        assertEquals(
            mat2(::indexesToFloat),
            mat2(::indexesToFloat)
        )

    @Test
    fun hashCodeEquals() =
        assertEquals(
            mat2(::indexesToFloat).hashCode(),
            mat2(::indexesToFloat).hashCode()
        )

    @Test
    fun notEquals_singleElementDiffers() {
        val expected = mat2 { i, j -> indexesToInt(i, j).toFloat() }
        for (k in 0..3) {
            assertNotEquals(
                expected,
                mat2 { i, j -> indexesToInt(i, j).run { if (this == k) -1f else toFloat() } },
                "Values expected not equals for element #$k"
            )
        }
    }

    @Test
    fun hashNotEquals_singleElementDiffers() {
        val hashCode = mat2 { i, j -> indexesToInt(i, j).toFloat() }.hashCode()
        for (k in 0..3) {
            assertNotEquals(
                hashCode,
                mat2 { i, j -> indexesToInt(i, j).run { if (this == k) -1f else toFloat() } }.hashCode(),
                "Values expected not equals for element #$k"
            )
        }
    }
}