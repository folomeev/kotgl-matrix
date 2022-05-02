package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class PlusTest {
    @Test
    fun vec2_plus_newVec() = assertEquals(3f, 7f, vec2(1f, 4f).plus(vec2(2f, 3f)))

    @Test
    fun vec3_plus_newVec() = assertEquals(3f, 7f, 11f, vec3(1f, 4f, 5f).plus(vec3(2f, 3f, 6f)))

    @Test
    fun vec4_plus_newVec() = assertEquals(3f, 7f, 11f, 15f, vec4(1f, 4f, 5f, 8f).plus(vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_plusTo() = assertEquals(3f, 7f, vec2(1f, 4f).plusTo(vec2(2f, 3f), mutableVec2()))

    @Test
    fun vec3_plusTo() = assertEquals(3f, 7f, 11f, vec3(1f, 4f, 5f).plusTo(vec3(2f, 3f, 6f), mutableVec3()))

    @Test
    fun vec4_plusTo() = assertEquals(3f, 7f, 11f, 15f, vec4(1f, 4f, 5f, 8f).plusTo(vec4(2f, 3f, 6f, 7f), mutableVec4()))

    @Test
    fun mutableVec2_plusSelf() = assertEquals(3f, 7f, mutableVec2(1f, 4f).plusSelf(vec2(2f, 3f)))

    @Test
    fun mutableVec3_plusSelf() = assertEquals(3f, 7f, 11f, mutableVec3(1f, 4f, 5f).plusSelf(vec3(2f, 3f, 6f)))

    @Test
    fun mutableVec4_plusSelf() = assertEquals(3f, 7f, 11f, 15f, mutableVec4(1f, 4f, 5f, 8f).plusSelf(vec4(2f, 3f, 6f, 7f)))
}