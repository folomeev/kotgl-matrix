package dev.folomeev.gl.vectors

import kotlin.test.Test

class VectorsTest {
    @Test
    fun test_vecZero() = assertEquals(0f, 0f, 0f, 0f, vecZero())

    @Test
    fun test_vecUnitX() = assertEquals(1f, 0f, 0f, 0f, vecUnitX())

    @Test
    fun test_vecUnitY() = assertEquals(0f, 1f, 0f, 0f, vecUnitY())

    @Test
    fun test_vecUnitZ() = assertEquals(0f, 0f, 1f, 0f, vecUnitZ())

    @Test
    fun test_vecUnitW() = assertEquals(0f, 0f, 0f, 1f, vecUnitW())

    @Test
    fun test_vec2_empty() = assertEquals(0f, 0f, vec2())

    @Test
    fun test_vec3_empty() = assertEquals(0f, 0f, 0f, vec3())

    @Test
    fun test_vec4_empty() = assertEquals(0f, 0f, 0f, 0f, vec4())

    @Test
    fun test_vec2_create() = assertEquals(1f, 2f, vec2(1f, 2f))

    @Test
    fun test_vec3_create() = assertEquals(1f, 2f, 3f, vec3(1f, 2f, 3f))

    @Test
    fun test_vec3_create_vec2() = assertEquals(1f, 2f, 3f, vec3(vec2(1f, 2f), 3f))

    @Test
    fun test_vec4_create() = assertEquals(1f, 2f, 3f, 4f, vec4(1f, 2f, 3f, 4f))

    @Test
    fun test_vec4_create_vec2() = assertEquals(1f, 2f, 3f, 4f, vec4(vec2(1f, 2f), 3f, 4f))

    @Test
    fun test_vec4_create_vec3() = assertEquals(1f, 2f, 3f, 4f, vec4(vec3(1f, 2f, 3f), 4f))
}