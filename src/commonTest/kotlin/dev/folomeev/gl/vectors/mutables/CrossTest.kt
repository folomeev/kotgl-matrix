package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class CrossTest {
    @Test
    fun vec2_cross() = assertEquals(0f, 0f, -2f, vec2(1f, 2f).cross(vec2(3f, 4f)))

    @Test
    fun vec3_cross() = assertEquals(-3f, 6f, -3f, vec3(1f, 2f, 3f).cross(vec3(4f, 5f, 6f)))

    @Test
    fun vec4_cross() = assertEquals(
        0f, 0f, 0f, 0f,
        vec4(1f, 2f, 3f, 4f).cross(vec4(5f, 6f, 7f, 8f), vec4(9f, 10f, 11f, 12f))
    )

    @Test
    fun vec2_crossTo() = assertEquals(0f, 0f, -2f, vec2(1f, 2f).crossTo(vec2(3f, 4f), mutableVec3()))

    @Test
    fun vec3_crossTo() = assertEquals(-3f, 6f, -3f, vec3(1f, 2f, 3f).crossTo(vec3(4f, 5f, 6f), mutableVec3()))

    @Test
    fun vec4_crossTo() = assertEquals(
        0f, 0f, 0f, 0f,
        vec4(1f, 2f, 3f, 4f).crossTo(vec4(5f, 6f, 7f, 8f), vec4(9f, 10f, 11f, 12f), mutableVec4())
    )

    @Test
    fun mutableVec3_selfCross() = assertEquals(-3f, 6f, -3f, mutableVec3(1f, 2f, 3f).crossSelf(vec3(4f, 5f, 6f)))

    @Test
    fun vec4_crossSelf() = assertEquals(
        0f, 0f, 0f, 0f,
        mutableVec4(1f, 2f, 3f, 4f).crossSelf(vec4(5f, 6f, 7f, 8f), vec4(9f, 10f, 11f, 12f))
    )

}