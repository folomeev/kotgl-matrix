package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import kotlin.test.Test

class MutableVec4Test {
    @Test
    fun mutableVec4_createAndMutate() {
        MutableVec4.Implementation(1f, 2f, 3f, 4f).also { vec ->
            assertEquals(1f, 2f, 3f, 4f, vec)
            vec.x = 5f
            vec.y = 6f
            vec.z = 7f
            vec.w = 8f
            assertEquals(5f, 6f, 7f, 8f, vec)
        }
    }

    @Test
    fun mutableVec4_copyOf() {
        MutableVec4.Implementation(1f, 2f, 3f, 4f).also { vec ->
            val vecCopy = vec.copyOf()
            assertEquals(1f, 2f, 3f, 4f, vecCopy)
            vecCopy.set(5f, 6f, 7f, 8f)
            assertEquals(5f, 6f, 7f, 8f, vecCopy)
            // Assert that original value unchanged
            assertEquals(1f, 2f, 3f, 4f, vec)
        }
    }
}