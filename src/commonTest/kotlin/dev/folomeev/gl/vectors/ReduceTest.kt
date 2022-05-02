package dev.folomeev.gl.vectors

import kotlin.test.Test
import kotlin.test.assertEquals

class ReduceTest {
    @Test
    fun vec2_reduce_success() = assertEquals(3f, vec2(1f, 2f).reduce { x, y -> x + y })

    @Test
    fun vec3_reduce_success() = assertEquals(6f, vec3(1f, 2f, 3f).reduce { x, y, z -> x + y + z })

    @Test
    fun vec4_reduce_success() = assertEquals(10f, vec4(1f, 2f, 3f, 4f).reduce { x, y, z, w -> x + y + z + w })
}