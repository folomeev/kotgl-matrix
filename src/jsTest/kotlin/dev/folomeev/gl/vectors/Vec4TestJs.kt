package dev.folomeev.gl.vectors

import kotlin.test.Test
import kotlin.test.assertEquals

class Vec4TestJs {
    @Test
    fun vec4_toString() = assertEquals("(1, 2, 3, 4)", vec4(1f, 2f, 3f, 4f).toString())
}