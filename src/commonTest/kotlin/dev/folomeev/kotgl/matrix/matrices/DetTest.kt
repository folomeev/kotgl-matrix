package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class DetTest {
    @Test
    fun mat2_det() =
        assertEquals(-2f, mat2(1f, 2f, 3f, 4f).det())

    @Test
    fun mat3_det() =
        assertEquals(
            0f,
            mat3(
                1f, 2f, 3f,
                4f, 5f, 6f,
                7f, 8f, 9f
            ).det()
        )

    @Test
    fun mat4_det() =
        assertEquals(
            -376f,
            mat4(
                1f, 3f, 5f, 9f,
                1f, 3f, 1f, 7f,
                4f, 3f, 9f, 7f,
                5f, 2f, 0f, 9f
            ).det()
        )
}