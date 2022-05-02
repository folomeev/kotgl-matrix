package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class LerpTest {
    @Test
    fun lerp_zero() = assertEquals(1f, 0f.lerp(1f, 2f))

    @Test
    fun lerp_one() = assertEquals(2f, 1f.lerp(1f, 2f))

    @Test
    fun lerp_quart() = assertEquals(1.5f, 0.25f.lerp(1f, 3f))

    @Test
    fun lerp_negative() = assertEquals(1f, (-0.5f).lerp(2f, 4f))

    @Test
    fun lerp_graterThanOne() = assertEquals(4f, 1.5f.lerp(1f, 3f))

    @Test
    fun vec2_lerp_newVec() = assertEquals(2f, 6f, vec2(1f, 4f).lerp(vec2(3f, 8f), 0.5f))

    @Test
    fun vec3_lerp_newVec() = assertEquals(2f, 6f, 7f, vec3(1f, 4f, 5f).lerp(vec3(3f, 8f, 9f), 0.5f))

    @Test
    fun vec4_lerp_newVec() =
        assertEquals(2f, 6f, 7f, 10f, vec4(1f, 4f, 5f, 8f).lerp(vec4(3f, 8f, 9f, 12f), 0.5f))

    @Test
    fun vec2_lerpTo() = assertEquals(2f, 6f, vec2(1f, 4f).lerpTo(vec2(3f, 8f), 0.5f, mutableVec2()))

    @Test
    fun vec3_lerpTo() =
        assertEquals(2f, 6f, 7f, vec3(1f, 4f, 5f).lerpTo(vec3(3f, 8f, 9f), 0.5f, mutableVec3()))

    @Test
    fun vec4_lerpTo() =
        assertEquals(2f, 6f, 7f, 10f, vec4(1f, 4f, 5f, 8f).lerpTo(vec4(3f, 8f, 9f, 12f), 0.5f, mutableVec4()))

    @Test
    fun mutableVec2_lerpSelf() = assertEquals(2f, 6f, mutableVec2(1f, 4f).lerpSelf(vec2(3f, 8f), 0.5f))

    @Test
    fun mutableVec3_lerpSelf() =
        assertEquals(2f, 6f, 7f, mutableVec3(1f, 4f, 5f).lerpSelf(vec3(3f, 8f, 9f), 0.5f))

    @Test
    fun mutableVec4_lerpSelf() =
        assertEquals(2f, 6f, 7f, 10f, mutableVec4(1f, 4f, 5f, 8f).lerpSelf(vec4(3f, 8f, 9f, 12f), 0.5f))
}