package dev.folomeev.gl.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class Mat2TestJs {
    @Test
    fun mat2_toString() = assertEquals(
        "((1, 2),\n (3, 4))",
        mat2(1f, 2f, 3f, 4f).toString())
}