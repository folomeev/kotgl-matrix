package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.assertEquals
import dev.folomeev.kotgl.matrix.vectors.vec2
import dev.folomeev.kotgl.matrix.vectors.vec3
import dev.folomeev.kotgl.matrix.vectors.vec4
import kotlin.test.Test

class NegateTest {
    @Test
    fun vec2_negate_newVec() = assertEquals(1f, 2f, vec2(-1f, -2f).negate())

    @Test
    fun vec3_negate_newVec() = assertEquals(1f, 2f, 3f, vec3(-1f, -2f, -3f).negate())

    @Test
    fun vec4_negate_newVec() = assertEquals(1f, 2f, 3f, 4f, vec4(-1f, -2f, -3f, -4f).negate())

    @Test
    fun vec2_negateTo() = assertEquals(1f, 2f, vec2(-1f, -2f).negateTo(mutableVec2()))

    @Test
    fun vec3_negateTo() = assertEquals(1f, 2f, 3f, vec3(-1f, -2f, -3f).negateTo(mutableVec3()))

    @Test
    fun vec4_negateTo() = assertEquals(1f, 2f, 3f, 4f, vec4(-1f, -2f, -3f, -4f).negateTo(mutableVec4()))

    @Test
    fun mutableVec2_negateSelf() = assertEquals(1f, 2f, mutableVec2(-1f, -2f).negateSelf())

    @Test
    fun mutableVec3_negateSelf() = assertEquals(1f, 2f, 3f, mutableVec3(-1f, -2f, -3f).negateSelf())

    @Test
    fun mutableVec4_setNegate() = assertEquals(1f, 2f, 3f, 4f, mutableVec4(-1f, -2f, -3f, -4f).negateSelf())
}