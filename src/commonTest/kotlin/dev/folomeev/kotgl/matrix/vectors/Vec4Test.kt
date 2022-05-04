package dev.folomeev.kotgl.matrix.vectors

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class Vec4Test {
    @Test
    fun hashEquals() = assertEquals(vec4(1f, 2f, 3f, 4f).hashCode(), vec4(1f, 2f, 3f, 4f).hashCode())

    @Test
    fun equals_all() = assertEquals(vec4(1f, 2f, 3f, 4f), vec4(1f, 2f, 3f, 4f))

    @Test
    fun notEquals_x() = assertNotEquals(vec4(1f, 2f, 3f, 4f), vec4(0f, 2f, 3f, 4f))

    @Test
    fun notEquals_y() = assertNotEquals(vec4(1f, 2f, 3f, 4f), vec4(1f, 0f, 3f, 4f))

    @Test
    fun notEquals_z() = assertNotEquals(vec4(1f, 2f, 3f, 4f), vec4(1f, 2f, 0f, 4f))

    @Test
    fun notEquals_w() = assertNotEquals(vec4(1f, 2f, 3f, 4f), vec4(1f, 2f, 3f, 0f))

    @Test
    fun copyOf() = assertEquals(1f, 2f, 3f, 4f, vec4(1f, 2f, 3f, 4f).copyOf())

    @Test
    fun decomposition() = vec4(1f, 2f, 3f, 4f).let { (x, y, z, w) ->
        assertEquals(1f, x)
        assertEquals(2f, y)
        assertEquals(3f, z)
        assertEquals(4f, w)
    }
}