package dev.folomeev.kotgl.matrix.vectors

import kotlin.test.Test
import kotlin.test.assertEquals

class Vec4TestJvm {
    @Test
    fun vec4_toString() = assertEquals("(1.0, 2.0, 3.0, 4.0)", vec4(1f, 2f, 3f, 4f).toString())
}