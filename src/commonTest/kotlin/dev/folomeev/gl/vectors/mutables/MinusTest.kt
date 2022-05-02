package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class MinusTest {
    @Test
    fun vec2_minus_newVec() = assertEquals(-1f, 1f, vec2(1f, 4f).minus(vec2(2f, 3f)))

    @Test
    fun vec3_minus_newVec() = assertEquals(-1f, 1f, -1f, vec3(1f, 4f, 5f).minus(vec3(2f, 3f, 6f)))

    @Test
    fun vec4_minus_newVec() = assertEquals(-1f, 1f, -1f, 1f, vec4(1f, 4f, 5f, 8f).minus(vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_minusTo() = assertEquals(-1f, 1f, vec2(1f, 4f).minusTo(vec2(2f, 3f), mutableVec2()))

    @Test
    fun vec3_minusTo() = assertEquals(-1f, 1f, -1f, vec3(1f, 4f, 5f).minusTo(vec3(2f, 3f, 6f), mutableVec3()))

    @Test
    fun vec4_minusTo() = assertEquals(-1f, 1f, -1f, 1f, vec4(1f, 4f, 5f, 8f).minusTo(vec4(2f, 3f, 6f, 7f), mutableVec4()))

    @Test
    fun mutableVec2_minusSelf() = assertEquals(-1f, 1f, mutableVec2(1f, 4f).minusSelf(vec2(2f, 3f)))

    @Test
    fun mutableVec3_minusSelf() = assertEquals(-1f, 1f, -1f, mutableVec3(1f, 4f, 5f).minusSelf(vec3(2f, 3f, 6f)))

    @Test
    fun mutableVec4_minusSelf() = assertEquals(-1f, 1f, -1f, 1f, mutableVec4(1f, 4f, 5f, 8f).minusSelf(vec4(2f, 3f, 6f, 7f)))
}