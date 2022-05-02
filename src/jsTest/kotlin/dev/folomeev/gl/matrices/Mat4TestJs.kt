package dev.folomeev.gl.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class Mat4TestJs {
    @Test
    fun mat4_toString() = assertEquals(
        "((1, 2, 3, 4),\n (5, 6, 7, 8),\n (9, 10, 11, 12),\n (13, 14, 15, 16))",
        mat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f,
        ).toString()
    )
}