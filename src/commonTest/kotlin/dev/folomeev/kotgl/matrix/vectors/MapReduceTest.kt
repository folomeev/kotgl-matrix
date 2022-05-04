package dev.folomeev.kotgl.matrix.vectors

import kotlin.test.Test

class MapReduceTest {
    @Test
    fun vec2_mapReduce_vectorOnly() =
        assertEquals(-3f, vec2(1f, 2f).mapReduce(Float::unaryMinus, Float::plus))

    @Test
    fun vec3_mapReduce_vectorOnly() =
        assertEquals(-6f, vec3(1f, 2f, 3f).mapReduce(Float::unaryMinus) { x, y, z -> x + y + z })

    @Test
    fun vec4_mapReduce_vectorOnly() =
        assertEquals(-10f, vec4(1f, 2f, 3f, 4f)
            .mapReduce(Float::unaryMinus) { x, y, z, w -> x + y + z + w })

    @Test
    fun vec2_mapReduce_twoVectors() =
        assertEquals(8f, vec2(1f, 2f).mapReduce(vec2(2f, 3f), Float::times, Float::plus))

    @Test
    fun vec3_mapReduce_twoVectors() =
        assertEquals(20f, vec3(1f, 2f, 3f)
            .mapReduce(vec3(2f, 3f, 4f), Float::times) { x, y, z -> x + y + z })

    @Test
    fun vec4_mapReduce_twoVectors() =
        assertEquals(40f, vec4(1f, 2f, 3f, 4f)
            .mapReduce(vec4(2f, 3f, 4f, 5f), Float::times) { x, y, z, w -> x + y + z + w })
}