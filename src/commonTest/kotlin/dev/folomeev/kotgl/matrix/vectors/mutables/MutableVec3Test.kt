package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.assertEquals
import kotlin.test.Test

class MutableVec3Test {
    @Test
    fun mutableVec3_createAndMutate() {
        MutableVec3.Implementation(1f, 2f, 3f).also { vec ->
            assertEquals(1f, 2f, 3f, vec)
            vec.x = 4f
            vec.y = 5f
            vec.z = 6f
            assertEquals(4f, 5f, 6f, vec)
        }
    }

    @Test
    fun mutableVec3_copyOf() {
        MutableVec3.Implementation(1f, 2f, 3f).also { vec ->
            val vecCopy = vec.copyOf()
            assertEquals(1f, 2f, 3f, vecCopy)
            vecCopy.set(4f, 5f, 6f)
            assertEquals(4f, 5f, 6f, vecCopy)
            // Assert that original value unchanged
            assertEquals(1f, 2f, 3f, vec)
        }
    }
}