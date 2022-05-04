package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class ImmutableMat3Test {
    @Test
    fun create() {
        ImmutableMat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m02)
            assertEquals(4f, m10)
            assertEquals(5f, m11)
            assertEquals(6f, m12)
            assertEquals(7f, m20)
            assertEquals(8f, m21)
            assertEquals(9f, m22)
        }
    }

    @Test
    fun copyOf_returnsItself() {
        ImmutableMat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).apply {
            assertSame(this, this.copyOf())
        }
    }
}