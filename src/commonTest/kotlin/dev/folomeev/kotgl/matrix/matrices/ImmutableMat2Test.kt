package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class ImmutableMat2Test {
    @Test
    fun create() {
        ImmutableMat2(1f, 2f, 3f, 4f).apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun copyOf_returnsItself() {
        ImmutableMat2(1f, 2f, 3f, 4f).apply {
            assertSame(this, this.copyOf())
        }
    }
}