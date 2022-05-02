package dev.folomeev.gl.vectors

import kotlin.math.sqrt
import kotlin.test.Test

class DistanceTest {
    @Test
    fun vec2_distance() = assertEquals(sqrt(13f), vec2(2f, 3f).distance(vec2(4f, 6f)))

    @Test
    fun vec3_distance() = assertEquals(sqrt(29f), vec3(2f, 3f, 4f).distance(vec3(4f, 6f, 8f)))

    @Test
    fun vec4_distance() = assertEquals(
        sqrt(54f), vec4(2f, 3f, 4f, 5f)
            .distance(vec4(4f, 6f, 8f, 10f))
    )

    @Test
    fun vec2_sqrDistance() = assertEquals(
        13f, vec2(2f, 3f)
            .sqrDistance(vec2(4f, 6f))
    )

    @Test
    fun vec3_sqrDistance() = assertEquals(
        29f, vec3(2f, 3f, 4f)
            .sqrDistance(vec3(4f, 6f, 8f))
    )

    @Test
    fun vec4_sqrDistance() = assertEquals(
        54f, vec4(2f, 3f, 4f, 5f)
            .sqrDistance(vec4(4f, 6f, 8f, 10f))
    )
}