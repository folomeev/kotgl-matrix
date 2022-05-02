package dev.folomeev.gl.vectors

import kotlin.test.Test
import kotlin.test.assertEquals

class Vec3TestJvm {
    @Test
    fun vec3_toString() = assertEquals("(1.0, 2.0, 3.0)", vec3(1f, 2f, 3f).toString())
}