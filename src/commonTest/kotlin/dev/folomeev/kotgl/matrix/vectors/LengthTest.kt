package dev.folomeev.kotgl.matrix.vectors

import kotlin.math.sqrt
import kotlin.test.Test

class LengthTest {
    @Test
    fun vec2_length() = assertEquals(sqrt(13f), vec2(2f, 3f).length())

    @Test
    fun vec3_length() = assertEquals(sqrt(29f), vec3(2f, 3f, 4f).length())

    @Test
    fun vec4_length() = assertEquals(sqrt(54f), vec4(2f, 3f, 4f, 5f).length())

    @Test
    fun vec2_sqrLength() = assertEquals(13f, vec2(2f, 3f).sqrLength())

    @Test
    fun vec3_sqrLength() = assertEquals(29f, vec3(2f, 3f, 4f).sqrLength())

    @Test
    fun vec4_sqrLength() = assertEquals(54f, vec4(2f, 3f, 4f, 5f).sqrLength())
}