package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.assertEquals
import dev.folomeev.kotgl.matrix.vectors.vec2
import dev.folomeev.kotgl.matrix.vectors.vec3
import dev.folomeev.kotgl.matrix.vectors.vec4
import kotlin.test.Test

class CeilTest {
    @Test
    fun vec2_ceil_newVec() =
        assertEquals(1f, 2f, vec2(0.1f, 1.2f).ceil())

    @Test
    fun vec3_ceil_newVec() =
        assertEquals(1f, 2f, 3f, vec3(0.1f, 1.2f, 2.3f).ceil())

    @Test
    fun vec4_ceil_newVec() =
        assertEquals(1f, 2f, 3f, 4f, vec4(0.1f, 1.2f, 2.3f, 3.4f).ceil())

    @Test
    fun vec2_ceil() =
        assertEquals(1f, 2f, vec2(0.1f, 1.2f).ceilTo(mutableVec2()))

    @Test
    fun vec3_ceil() =
        assertEquals(1f, 2f, 3f, vec3(0.1f, 1.2f, 2.3f).ceilTo(mutableVec3()))

    @Test
    fun vec4_ceil() =
        assertEquals(1f, 2f, 3f, 4f, vec4(0.1f, 1.2f, 2.3f, 3.4f).ceilTo(mutableVec4()))

    @Test
    fun mutableVec2_setCeil() =
        assertEquals(1f, 2f, mutableVec2(0.1f, 1.2f).ceilSelf())

    @Test
    fun mutableVec3_setCeil() =
        assertEquals(1f, 2f, 3f, mutableVec3(0.1f, 1.2f, 2.3f).ceilSelf())

    @Test
    fun mutableVec4_setCeil() =
        assertEquals(1f, 2f, 3f, 4f, mutableVec4(0.1f, 1.2f, 2.3f, 3.4f).ceilSelf())
}