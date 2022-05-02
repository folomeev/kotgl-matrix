package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class RoundTest {
    @Test
    fun vec2_round_up_newVec() = assertEquals(1f, 2f, vec2(0.6f, 1.6f).round())

    @Test
    fun vec3_round_up_newVec() = assertEquals(1f, 2f, 3f, vec3(0.6f, 1.6f, 2.6f).round())

    @Test
    fun vec4_round_up_newVec() = assertEquals(1f, 2f, 3f, 4f, vec4(0.6f, 1.6f, 2.6f, 3.6f).round())

    @Test
    fun vec2_roundTo_up() = assertEquals(1f, 2f, vec2(0.6f, 1.6f).roundTo(mutableVec2()))

    @Test
    fun vec3_roundTo_up() = assertEquals(1f, 2f, 3f, vec3(0.6f, 1.6f, 2.6f).roundTo(mutableVec3()))

    @Test
    fun vec4_roundTo_up() = assertEquals(1f, 2f, 3f, 4f, vec4(0.6f, 1.6f, 2.6f, 3.6f).roundTo(mutableVec4()))

    @Test
    fun vec2_round_down_newVec() = assertEquals(1f, 2f, vec2(1.4f, 2.4f).round())

    @Test
    fun vec3_round_down_newVec() = assertEquals(1f, 2f, 3f, vec3(1.4f, 2.4f, 3.4f).round())

    @Test
    fun vec4_round_down_newVec() = assertEquals(1f, 2f, 3f, 4f, vec4(1.4f, 2.4f, 3.4f, 4.4f).round())

    @Test
    fun vec2_roundTo_down() = assertEquals(1f, 2f, vec2(1.4f, 2.4f).roundTo(mutableVec2()))

    @Test
    fun vec3_roundTo_down() = assertEquals(1f, 2f, 3f, vec3(1.4f, 2.4f, 3.4f).roundTo(mutableVec3()))

    @Test
    fun vec4_roundTo_down() = assertEquals(1f, 2f, 3f, 4f, vec4(1.4f, 2.4f, 3.4f, 4.4f).roundTo(mutableVec4()))

    @Test
    fun mutableVec2_roundSelf_up() = assertEquals(1f, 2f, mutableVec2(0.6f, 1.6f).roundSelf())

    @Test
    fun mutableVec3_roundSelf_up() = assertEquals(1f, 2f, 3f, mutableVec3(0.6f, 1.6f, 2.6f).roundSelf())

    @Test
    fun mutableVec4_roundSelf_up() = assertEquals(1f, 2f, 3f, 4f, mutableVec4(0.6f, 1.6f, 2.6f, 3.6f).roundSelf())

    @Test
    fun mutableVec2_roundSelf_down() = assertEquals(1f, 2f, mutableVec2(1.4f, 2.4f).roundSelf())

    @Test
    fun mutableVec3_roundSelf_down() = assertEquals(1f, 2f, 3f, mutableVec3(1.4f, 2.4f, 3.4f).roundSelf())

    @Test
    fun mutableVec4_roundSelf_down() = assertEquals(1f, 2f, 3f, 4f, mutableVec4(1.4f, 2.4f, 3.4f, 4.4f).roundSelf())
}