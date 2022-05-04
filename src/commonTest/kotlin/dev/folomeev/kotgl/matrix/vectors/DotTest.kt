package dev.folomeev.kotgl.matrix.vectors

import kotlin.test.Test

class DotTest {
    @Test
    fun vec2_dot() = assertEquals(26f, vec2(2f, 3f).dot(vec2(4f, 6f)))

    @Test
    fun vec3_dot() = assertEquals(58f, vec3(2f, 3f, 4f).dot(vec3(4f, 6f, 8f)))

    @Test
    fun vec4_dot() = assertEquals(108f, vec4(2f, 3f, 4f, 5f).dot(vec4(4f, 6f, 8f, 10f)))
}