package dev.folomeev.gl.matrices.mutables

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotSame

class MutableMat3Test {
    @Test
    fun implementation_copyOf() {
        MutableMat3.Implementation(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).apply {
            val copy = this.copyOf()
            assertNotSame(this, copy)
            assertEquals(this, copy)
            copy.m00 = -1f
            assertNotEquals(this.m00, copy.m00)
        }
    }
}