package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class MinTest {
    @Test
    fun vec2_min_newVec() = assertEquals(1f, 3f, vec2(1f, 4f).min(vec2(2f, 3f)))

    @Test
    fun vec3_min_newVec() = assertEquals(1f, 3f, 5f, vec3(1f, 4f, 5f).min(vec3(2f, 3f, 6f)))

    @Test
    fun vec4_min_newVec() = assertEquals(1f, 3f, 5f, 7f, vec4(1f, 4f, 5f, 8f).min(vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_minTo() = assertEquals(1f, 3f, vec2(1f, 4f).minTo(vec2(2f, 3f), mutableVec2()))

    @Test
    fun vec3_minTo() = assertEquals(1f, 3f, 5f, vec3(1f, 4f, 5f).minTo(vec3(2f, 3f, 6f), mutableVec3()))

    @Test
    fun vec4_minTo() = assertEquals(1f, 3f, 5f, 7f, vec4(1f, 4f, 5f, 8f).minTo(vec4(2f, 3f, 6f, 7f), mutableVec4()))

    @Test
    fun mutableVec2_minSelf() = assertEquals(1f, 3f, mutableVec2(1f, 4f).minSelf(vec2(2f, 3f)))

    @Test
    fun mutableVec3_minSelf() = assertEquals(1f, 3f, 5f, mutableVec3(1f, 4f, 5f).minSelf(vec3(2f, 3f, 6f)))

    @Test
    fun mutableVec4_minSelf() = assertEquals(1f, 3f, 5f, 7f, mutableVec4(1f, 4f, 5f, 8f).minSelf(vec4(2f, 3f, 6f, 7f)))
}