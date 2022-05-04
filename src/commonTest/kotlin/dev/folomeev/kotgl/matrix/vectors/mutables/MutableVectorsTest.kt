package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.assertEquals
import dev.folomeev.kotgl.matrix.vectors.vec2
import dev.folomeev.kotgl.matrix.vectors.vec3
import dev.folomeev.kotgl.matrix.vectors.vec4
import kotlin.test.Test

class MutableVectorsTest {
    @Test
    fun mutableVec2_zero() = assertEquals(0f, 0f, mutableVec2())

    @Test
    fun mutableVec2_create() = assertEquals(2f, 3f, mutableVec2(2f, 3f))

    @Test
    fun mutableVec2_toImmutable() = assertEquals(2f, 3f, mutableVec2(2f, 3f).toImmutable())

    @Test
    fun mutableVec2_createFromVec2() =
        assertEquals(2f, 3f, mutableVec2(vec2(2f, 3f)))

    @Test
    fun vec2_toMutable() =
        assertEquals(2f, 3f, vec2(2f, 3f).toMutable())

    @Test
    fun mutableVec3_zero() = assertEquals(0f, 0f, 0f, mutableVec3())

    @Test
    fun mutableVec3_create() = assertEquals(2f, 3f, 4f, mutableVec3(2f, 3f, 4f))

    @Test
    fun mutableVec3_toImmutable() =
        assertEquals(2f, 3f, 4f, mutableVec3(2f, 3f, 4f).toImmutable())

    @Test
    fun mutableVec3_createFromVec2() =
        assertEquals(2f, 3f, 4f, mutableVec3(vec2(2f, 3f), 4f))

    @Test
    fun mutableVec3_createFromVec3() =
        assertEquals(2f, 3f, 4f, mutableVec3(vec3(2f, 3f, 4f)))

    @Test
    fun vec3_toMutable() =
        assertEquals(2f, 3f, 4f, vec3(2f, 3f, 4f).toMutable())

    @Test
    fun mutableVec4_zero() =
        assertEquals(0f, 0f, 0f, 0f, mutableVec4())

    @Test
    fun mutableVec4_create() =
        assertEquals(2f, 3f, 4f, 5f, mutableVec4(2f, 3f, 4f, 5f))

    @Test
    fun mutableVec4_toImmutable() =
        assertEquals(2f, 3f, 4f, 5f, mutableVec4(2f, 3f, 4f, 5f).toImmutable())

    @Test
    fun mutableVec4_createFromVec2() =
        assertEquals(2f, 3f, 4f, 5f, mutableVec4(vec2(2f, 3f), 4f, 5f))

    @Test
    fun mutableVec4_createFromVec3() =
        assertEquals(2f, 3f, 4f, 5f, mutableVec4(vec3(2f, 3f, 4f), 5f))

    @Test
    fun mutableVec4_createFromVec4() =
        assertEquals(2f, 3f, 4f, 5f, mutableVec4(vec4(2f, 3f, 4f, 5f)))

    @Test
    fun vec4_toMutable() =
        assertEquals(2f, 3f, 4f, 5f, vec4(2f, 3f, 4f, 5f).toMutable())
}