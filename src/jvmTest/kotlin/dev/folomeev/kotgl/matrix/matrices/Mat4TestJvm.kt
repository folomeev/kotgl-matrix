package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class Mat4TestJvm {
    @Test
    fun mat4_toString() = assertEquals(
        "((1.0, 2.0, 3.0, 4.0),\n (5.0, 6.0, 7.0, 8.0),\n (9.0, 10.0, 11.0, 12.0),\n (13.0, 14.0, 15.0, 16.0))",
        mat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f,
        ).toString()
    )
}