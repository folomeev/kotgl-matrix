package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class Mat3TestJs {
    @Test
    fun mat3_toString() = assertEquals(
        "((1, 2, 3),\n (4, 5, 6),\n (7, 8, 9))",
        mat3(
            1f, 2f, 3f,
            4f, 5f, 6f,
            7f, 8f, 9f
        ).toString()
    )
}