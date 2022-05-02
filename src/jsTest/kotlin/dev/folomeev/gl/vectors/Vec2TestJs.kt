package dev.folomeev.gl.vectors

import kotlin.test.Test
import kotlin.test.assertEquals

class Vec2TestJs {
    @Test
    fun vec2_toString() = assertEquals("(1, 2)", vec2(1f, 2f).toString())
}