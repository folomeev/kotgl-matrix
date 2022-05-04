package dev.folomeev.kotgl.matrix.vectors

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class Vec3Test {
    @Test
    fun hashEquals() = assertEquals(vec3(1f, 2f, 3f).hashCode(), vec3(1f, 2f, 3f).hashCode())

    @Test
    fun equals_all() = assertEquals(vec3(1f, 2f, 3f), vec3(1f, 2f, 3f))

    @Test
    fun notEquals_x() = assertNotEquals(vec3(1f, 2f, 3f), vec3(0f, 2f, 3f))

    @Test
    fun notEquals_y() = assertNotEquals(vec3(1f, 2f, 3f), vec3(1f, 0f, 3f))

    @Test
    fun notEquals_z() = assertNotEquals(vec3(1f, 2f, 3f), vec3(1f, 2f, 0f))

    @Test
    fun copyOf() = assertEquals(1f, 2f, 3f, vec3(1f, 2f, 3f).copyOf())

    @Test
    fun decomposition() = vec3(1f, 2f, 3f).let { (x, y, z) ->
        assertEquals(1f, x)
        assertEquals(2f, y)
        assertEquals(3f, z)
    }
}