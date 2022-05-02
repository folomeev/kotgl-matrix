package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.test.Test

class SetTest {

    @Test
    fun mutableVec2_values_set() {
        MutableVec2.Implementation(1f, 2f).also { vec ->
            assertEquals(1f, 2f, vec)
            vec.set(3f, 4f)
            assertEquals(3f, 4f, vec)
        }
    }

    @Test
    fun mutableVec3_values_set() {
        MutableVec3.Implementation(1f, 2f, 3f).also { vec ->
            assertEquals(1f, 2f, 3f, vec)
            vec.set(4f, 5f, 6f)
            assertEquals(4f, 5f, 6f, vec)
        }
    }

    @Test
    fun mutableVec4_values_set() {
        MutableVec4.Implementation(1f, 2f, 3f, 4f).also { vec ->
            assertEquals(1f, 2f, 3f, 4f, vec)
            vec.set(5f, 6f, 7f, 8f)
            assertEquals(5f, 6f, 7f, 8f, vec)
        }
    }

    @Test
    fun mutableVec2_vec2_set() = assertEquals(1f, 2f, mutableVec2().set(vec2(1f, 2f)))

    @Test
    fun mutableVec3_vec3_set() = assertEquals(1f, 2f, 3f, mutableVec3().set(vec3(1f, 2f, 3f)))

    @Test
    fun mutableVec4_vec4_set() = assertEquals(1f, 2f, 3f, 4f, mutableVec4().set(vec4(1f, 2f, 3f, 4f)))

    @Test
    fun mutableVec2_setAll() = assertEquals(2f, 2f, mutableVec2().setAll(2f))

    @Test
    fun mutableVec3_setAll() = assertEquals(2f, 2f, 2f, mutableVec3().setAll(2f))

    @Test
    fun mutableVec4_setAll() = assertEquals(2f, 2f, 2f, 2f, mutableVec4().setAll(2f))
}