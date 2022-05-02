package dev.folomeev.gl.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class Mat3TestJvm {
    @Test
    fun mat3_toString() = assertEquals(
        "((1.0, 2.0, 3.0),\n (4.0, 5.0, 6.0),\n (7.0, 8.0, 9.0))",
        mat3(
            1f, 2f, 3f,
            4f, 5f, 6f,
            7f, 8f, 9f
        ).toString()
    )
}