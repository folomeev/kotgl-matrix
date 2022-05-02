package dev.folomeev.gl.vectors

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class Vec2Test {
    @Test
    fun hashEquals() = assertEquals(vec2(1f, 2f).hashCode(), vec2(1f, 2f).hashCode())

    @Test
    fun equals_all() = assertEquals(vec2(1f, 2f), vec2(1f, 2f))

    @Test
    fun notEquals_x() = assertNotEquals(vec2(1f, 2f), vec2(0f, 2f))

    @Test
    fun notEquals_y() = assertNotEquals(vec2(1f, 2f), vec2(1f, 0f))

    @Test
    fun copyOf() = assertEquals(1f, 2f, vec2(1f, 2f).copyOf())

    @Test
    fun decomposition() = vec2(1f, 2f).let { (x, y) ->
        assertEquals(1f, x)
        assertEquals(2f, y)
    }
}