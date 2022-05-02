package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import kotlin.test.Test

class MutableVec2Test {
    @Test
    fun mutableVec2_createAndMutate() {
        MutableVec2.Implementation(1f, 2f).also { vec ->
            assertEquals(1f, 2f, vec)
            vec.x = 3f
            vec.y = 4f
            assertEquals(3f, 4f, vec)
        }
    }

    @Test
    fun mutableVec2_copyOf() {
        MutableVec2.Implementation(1f, 2f).also { vec ->
            val vecCopy = vec.copyOf()
            assertEquals(1f, 2f, vecCopy)
            vecCopy.set(3f, 4f)
            assertEquals(3f, 4f, vecCopy)
            // Assert that original value unchanged
            assertEquals(1f, 2f, vec)
        }
    }
}