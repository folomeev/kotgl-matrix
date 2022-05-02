package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class TimesTest {
    @Test
    fun vec2_times_newVec() = assertEquals(2f, 12f, vec2(1f, 4f).times(vec2(2f, 3f)))

    @Test
    fun vec3_times_newVec() = assertEquals(2f, 12f, 30f, vec3(1f, 4f, 5f).times(vec3(2f, 3f, 6f)))

    @Test
    fun vec4_times_newVec() = assertEquals(2f, 12f, 30f, 56f, vec4(1f, 4f, 5f, 8f).times(vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_timesTo() = assertEquals(2f, 12f, vec2(1f, 4f).timesTo(vec2(2f, 3f), mutableVec2()))

    @Test
    fun vec3_timesTo() = assertEquals(2f, 12f, 30f, vec3(1f, 4f, 5f).timesTo(vec3(2f, 3f, 6f), mutableVec3()))

    @Test
    fun vec4_timesTo() =
        assertEquals(2f, 12f, 30f, 56f, vec4(1f, 4f, 5f, 8f).timesTo(vec4(2f, 3f, 6f, 7f), mutableVec4()))

    @Test
    fun mutableVec2_timesSelf() = assertEquals(2f, 12f, mutableVec2(1f, 4f).timesSelf(vec2(2f, 3f)))

    @Test
    fun mutableVec3_timesSelf() = assertEquals(2f, 12f, 30f, mutableVec3(1f, 4f, 5f).timesSelf(vec3(2f, 3f, 6f)))

    @Test
    fun mutableVec4_timesSelf() =
        assertEquals(2f, 12f, 30f, 56f, mutableVec4(1f, 4f, 5f, 8f).timesSelf(vec4(2f, 3f, 6f, 7f)))

    @Test
    fun vec2_times_float_newVec() = assertEquals(2f, 8f, vec2(1f, 4f).times(2f))

    @Test
    fun vec3_times_float_newVec() = assertEquals(2f, 8f, 10f, vec3(1f, 4f, 5f).times(2f))

    @Test
    fun vec4_times_float_newVec() = assertEquals(2f, 8f, 10f, 16f, vec4(1f, 4f, 5f, 8f).times(2f))

    @Test
    fun vec2_timesTo_float() = assertEquals(2f, 8f, vec2(1f, 4f).timesTo(2f, mutableVec2()))

    @Test
    fun vec3_timesTo_float() = assertEquals(2f, 8f, 10f, vec3(1f, 4f, 5f).timesTo(2f, mutableVec3()))

    @Test
    fun vec4_timesTo_float() = assertEquals(2f, 8f, 10f, 16f, vec4(1f, 4f, 5f, 8f).timesTo(2f, mutableVec4()))

    @Test
    fun mutableVec2_timesSelf_float() = assertEquals(2f, 8f, mutableVec2(1f, 4f).timesSelf(2f))

    @Test
    fun mutableVec3_timesSelf_float() = assertEquals(2f, 8f, 10f, mutableVec3(1f, 4f, 5f).timesSelf(2f))

    @Test
    fun mutableVec4_timesSelf_float() = assertEquals(2f, 8f, 10f, 16f, mutableVec4(1f, 4f, 5f, 8f).timesSelf(2f))
}