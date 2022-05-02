package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class PlusScaledTest {

    @Test
    fun plusScaled_success() = kotlin.test.assertEquals(7f, 2f.plusScaled(1f, 3f))

    @Test
    fun vec2_plusScaled_newVec() = assertEquals(5f, 10f, vec2(1f, 4f).plusScaled(2f, vec2(2f, 3f)))

    @Test
    fun vec3_plusScaled_newVec() = assertEquals(5f, 10f, 17f, vec3(1f, 4f, 5f).plusScaled(2f, vec3(2f, 3f, 6f)))

    @Test
    fun vec4_plusScaled_newVec() =
        assertEquals(5f, 10f, 17f, 22f, vec4(1f, 4f, 5f, 8f).plusScaled(2f, vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_plusScaledTo() = assertEquals(5f, 10f, vec2(1f, 4f).plusScaledTo(2f, vec2(2f, 3f), mutableVec2()))

    @Test
    fun vec3_plusScaledTo() =
        assertEquals(5f, 10f, 17f, vec3(1f, 4f, 5f).plusScaledTo(2f, vec3(2f, 3f, 6f), mutableVec3()))

    @Test
    fun vec4_plusScaledTo() =
        assertEquals(5f, 10f, 17f, 22f, vec4(1f, 4f, 5f, 8f).plusScaledTo(2f, vec4(2f, 3f, 6f, 7f), mutableVec4()))

    @Test
    fun mutableVec2_plusScaledSelf() = assertEquals(5f, 10f, mutableVec2(1f, 4f).plusScaledSelf(2f, vec2(2f, 3f)))

    @Test
    fun mutableVec3_plusScaledSelf() =
        assertEquals(5f, 10f, 17f, mutableVec3(1f, 4f, 5f).plusScaledSelf(2f, vec3(2f, 3f, 6f)))

    @Test
    fun mutableVec4_plusScaledSelf() =
        assertEquals(5f, 10f, 17f, 22f, mutableVec4(1f, 4f, 5f, 8f).plusScaledSelf(2f, vec4(2f, 3f, 6f, 7f)))
}