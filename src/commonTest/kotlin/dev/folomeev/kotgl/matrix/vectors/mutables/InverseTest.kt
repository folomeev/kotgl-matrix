package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.assertEquals
import dev.folomeev.kotgl.matrix.vectors.vec2
import dev.folomeev.kotgl.matrix.vectors.vec3
import dev.folomeev.kotgl.matrix.vectors.vec4
import kotlin.test.Test

class InverseTest {
    @Test
    fun vec2_inverse_newVec() = assertEquals(2f, 4f, vec2(0.5f, 0.25f).inverse())

    @Test
    fun vec3_inverse_newVec() = assertEquals(2f, 4f, 5f, vec3(0.5f, 0.25f, 0.2f).inverse())

    @Test
    fun vec4_inverse_newVec() = assertEquals(2f, 4f, 5f, 10f, vec4(0.5f, 0.25f, 0.2f, 0.1f).inverse())

    @Test
    fun vec2_inverseTo() = assertEquals(2f, 4f, vec2(0.5f, 0.25f).inverseTo(mutableVec2()))

    @Test
    fun vec3_inverseTo() = assertEquals(2f, 4f, 5f, vec3(0.5f, 0.25f, 0.2f).inverseTo(mutableVec3()))

    @Test
    fun vec4_inverseTo() = assertEquals(2f, 4f, 5f, 10f, vec4(0.5f, 0.25f, 0.2f, 0.1f).inverseTo(mutableVec4()))

    @Test
    fun mutableVec2_inverseSelf() = assertEquals(2f, 4f, mutableVec2(0.5f, 0.25f).inverseSelf())

    @Test
    fun mutableVec3_inverseSelf() = assertEquals(2f, 4f, 5f, mutableVec3(0.5f, 0.25f, 0.2f).inverseSelf())

    @Test
    fun mutableVec4_inverseSelf() = assertEquals(2f, 4f, 5f, 10f, mutableVec4(0.5f, 0.25f, 0.2f, 0.1f).inverseSelf())
}