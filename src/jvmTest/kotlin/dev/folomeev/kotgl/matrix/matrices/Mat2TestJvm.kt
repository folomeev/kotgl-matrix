package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class Mat2TestJvm {
    @Test
    fun mat2_toString() = assertEquals(
        "((1.0, 2.0),\n (3.0, 4.0))",
        mat2(1f, 2f, 3f, 4f).toString()
    )
}