package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class DivTest {
    @Test
    fun vec2_div_newVec() = assertEquals(1f, 4f, vec2(2f, 12f).div(vec2(2f, 3f)))

    @Test
    fun vec3_div_newVec() = assertEquals(1f, 4f, 5f, vec3(2f, 12f, 30f).div(vec3(2f, 3f, 6f)))

    @Test
    fun vec4_div_newVec() = assertEquals(1f, 4f, 5f, 8f, vec4(2f, 12f, 30f, 56f).div(vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_divTo() = assertEquals(1f, 4f, vec2(2f, 12f).divTo(vec2(2f, 3f), mutableVec2()))

    @Test
    fun vec3_divTo() = assertEquals(1f, 4f, 5f, vec3(2f, 12f, 30f).divTo(vec3(2f, 3f, 6f), mutableVec3()))

    @Test
    fun vec4_divTo() = assertEquals(1f, 4f, 5f, 8f, vec4(2f, 12f, 30f, 56f).divTo(vec4(2f, 3f, 6f, 7f), mutableVec4()))

    @Test
    fun mutableVec2_divSelf() = assertEquals(1f, 4f, mutableVec2(2f, 12f).divSelf(vec2(2f, 3f)))

    @Test
    fun mutableVec3_divSelf() = assertEquals(1f, 4f, 5f, mutableVec3(2f, 12f, 30f).divSelf(vec3(2f, 3f, 6f)))

    @Test
    fun mutableVec4_divSelf() =
        assertEquals(1f, 4f, 5f, 8f, mutableVec4(2f, 12f, 30f, 56f).divSelf(vec4(2f, 3f, 6f, 7f)))
}