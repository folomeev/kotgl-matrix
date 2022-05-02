package dev.folomeev.gl.vectors

import kotlin.test.Test
import kotlin.test.assertEquals

class Vec2TestJvm {
    @Test
    fun vec2_toString() = assertEquals("(1.0, 2.0)", vec2(1f, 2f).toString())
}