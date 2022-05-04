package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.*
import kotlin.test.Test

class NormalizeTest {
    @Test
    fun vec2_normalize_zero_newVec() = assertEquals(0f, vec2().normalize().length())

    @Test
    fun vec3_normalize_zero_newVec() = assertEquals(0f, vec3().normalize().length())

    @Test
    fun vec4_normalize_zero_newVec() = assertEquals(0f, vec4().normalize().length())

    @Test
    fun vec2_normalizeTo_zero() = assertEquals(0f, vec2().normalizeTo(mutableVec2()).length())

    @Test
    fun vec3_normalizeTo_zero() = assertEquals(0f, vec3().normalizeTo(mutableVec3()).length())

    @Test
    fun vec4_normalizeTo_zero() = assertEquals(0f, vec4().normalizeTo(mutableVec4()).length())

    @Test
    fun mutableVec2_normalizeSelf_zero() = assertEquals(0f, mutableVec2().normalizeSelf().length())

    @Test
    fun mutableVec3_normalizeSelf_zero() = assertEquals(0f, mutableVec3().normalizeSelf().length())

    @Test
    fun mutableVec4_normalizeSelf_zero() = assertEquals(0f, mutableVec4().normalizeSelf().length())

    @Test
    fun vec2_normalize_newVec() = assertEquals(1f, vec2(0.1f, 1.2f).normalize().length())

    @Test
    fun vec3_normalize_newVec() = assertEquals(1f, vec3(0.1f, 1.2f, 2.3f).normalize().length())

    @Test
    fun vec4_normalize_newVec() = assertEquals(1f, vec4(0.1f, 1.2f, 2.3f, 3.4f).normalize().length())

    @Test
    fun vec2_normalizeTo() = assertEquals(1f, vec2(0.1f, 1.2f).normalizeTo(mutableVec2()).length())

    @Test
    fun vec3_normalizeTo() = assertEquals(1f, vec3(0.1f, 1.2f, 2.3f).normalizeTo(mutableVec3()).length())

    @Test
    fun vec4_normalizeTo() = assertEquals(1f, vec4(0.1f, 1.2f, 2.3f, 3.4f).normalizeTo(mutableVec4()).length())

    @Test
    fun mutableVec2_normalizeSelf() = assertEquals(1f, mutableVec2(0.1f, 1.2f).normalizeSelf().length())

    @Test
    fun mutableVec3_normalizeSelf() = assertEquals(1f, mutableVec3(0.1f, 1.2f, 2.3f).normalizeSelf().length())

    @Test
    fun mutableVec4_normalizeSelf() = assertEquals(1f, mutableVec4(0.1f, 1.2f, 2.3f, 3.4f).normalizeSelf().length())
}