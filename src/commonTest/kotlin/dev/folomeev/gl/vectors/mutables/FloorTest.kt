package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class FloorTest {
    @Test
    fun vec2_floor_newVec() = assertEquals(1f, 2f, vec2(1.9f, 2.9f).floor())

    @Test
    fun vec3_floor_newVec() = assertEquals(1f, 2f, 3f, vec3(1.9f, 2.9f, 3.7f).floor())

    @Test
    fun vec4_floor_newVec() =
        assertEquals(1f, 2f, 3f, 4f, vec4(1.9f, 2.9f, 3.7f, 4.6f).floor())

    @Test
    fun vec2_floorTo() = assertEquals(1f, 2f, vec2(1.9f, 2.9f).floorTo(mutableVec2()))

    @Test
    fun vec3_floorTo() = assertEquals(1f, 2f, 3f, vec3(1.9f, 2.9f, 3.7f).floorTo(mutableVec3()))

    @Test
    fun vec4_floorTo() =
        assertEquals(1f, 2f, 3f, 4f, vec4(1.9f, 2.9f, 3.7f, 4.6f).floorTo(mutableVec4()))

    @Test
    fun mutableVec2_floorSelf() = assertEquals(1f, 2f, mutableVec2(1.9f, 2.9f).floorSelf())

    @Test
    fun mutableVec3_floorSelf() = assertEquals(1f, 2f, 3f, mutableVec3(1.9f, 2.9f, 3.7f).floorSelf())

    @Test
    fun mutableVec4_floorSelf() = assertEquals(1f, 2f, 3f, 4f, mutableVec4(1.9f, 2.9f, 3.7f, 4.6f).floorSelf())
}