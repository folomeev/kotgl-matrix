package dev.folomeev.gl.vectors

import kotlin.test.Test
import kotlin.test.assertEquals

class Vec3TestJs {
    @Test
    fun vec3_toString() = assertEquals("(1, 2, 3)", vec3(1f, 2f, 3f).toString())
}