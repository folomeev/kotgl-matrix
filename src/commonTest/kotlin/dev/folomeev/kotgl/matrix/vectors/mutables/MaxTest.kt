package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.assertEquals
import dev.folomeev.kotgl.matrix.vectors.vec2
import dev.folomeev.kotgl.matrix.vectors.vec3
import dev.folomeev.kotgl.matrix.vectors.vec4
import kotlin.test.Test

class MaxTest {
    @Test
    fun vec2_max_newVec() = assertEquals(2f, 4f, vec2(1f, 4f).max(vec2(2f, 3f)))

    @Test
    fun vec3_max_newVec() = assertEquals(2f, 4f, 6f, vec3(1f, 4f, 5f).max(vec3(2f, 3f, 6f)))

    @Test
    fun vec4_max_newVec() = assertEquals(2f, 4f, 6f, 8f, vec4(1f, 4f, 5f, 8f).max(vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_maxTo() = assertEquals(2f, 4f, vec2(1f, 4f).maxTo(vec2(2f, 3f), mutableVec2()))

    @Test
    fun vec3_maxTo() = assertEquals(2f, 4f, 6f, vec3(1f, 4f, 5f).maxTo(vec3(2f, 3f, 6f), mutableVec3()))

    @Test
    fun vec4_maxTo() = assertEquals(2f, 4f, 6f, 8f, vec4(1f, 4f, 5f, 8f).maxTo(vec4(2f, 3f, 6f, 7f), mutableVec4()))

    @Test
    fun mutableVec2_maxSelf() = assertEquals(2f, 4f, mutableVec2(1f, 4f).maxSelf(vec2(2f, 3f)))

    @Test
    fun mutableVec3_maxSelf() = assertEquals(2f, 4f, 6f, mutableVec3(1f, 4f, 5f).maxSelf(vec3(2f, 3f, 6f)))

    @Test
    fun mutableVec4_maxSelf() = assertEquals(2f, 4f, 6f, 8f, mutableVec4(1f, 4f, 5f, 8f).maxSelf(vec4(2f, 3f, 6f, 7f)))
}