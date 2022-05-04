package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class Mat3Test {

    private fun indexesToInt(i: Int, j: Int) = i * 3 + j

    private fun indexesToFloat(i: Int, j: Int) = indexesToInt(i, j).toFloat()

    @Test
    fun equalsAll() =
        assertEquals(
            mat3(::indexesToFloat),
            mat3(::indexesToFloat)
        )

    @Test
    fun hashCodeEquals() =
        assertEquals(
            mat3(::indexesToFloat).hashCode(),
            mat3(::indexesToFloat).hashCode()
        )

    @Test
    fun notEquals_singleElementDiffers() {
        val expected = mat3 { i, j -> indexesToInt(i, j).toFloat() }
        for (k in 0..8) {
            assertNotEquals(
                expected,
                mat3 { i, j -> indexesToInt(i, j).run { if (this == k) -1f else toFloat() } },
                "Values expected not equals for element #$k"
            )
        }
    }

    @Test
    fun hashNotEquals_singleElementDiffers() {
        val hashCode = mat3 { i, j -> indexesToInt(i, j).toFloat() }.hashCode()
        for (k in 0..8) {
            assertNotEquals(
                hashCode,
                mat3 { i, j -> indexesToInt(i, j).run { if (this == k) -1f else toFloat() } }.hashCode(),
                "Values expected not equals for element #$k"
            )
        }
    }
}