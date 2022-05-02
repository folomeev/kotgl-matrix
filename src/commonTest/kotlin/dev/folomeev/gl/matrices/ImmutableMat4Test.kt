package dev.folomeev.gl.matrices

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class ImmutableMat4Test {
    @Test
    fun create() {
        ImmutableMat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f
        ).apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m02)
            assertEquals(4f, m03)
            assertEquals(5f, m10)
            assertEquals(6f, m11)
            assertEquals(7f, m12)
            assertEquals(8f, m13)
            assertEquals(9f, m20)
            assertEquals(10f, m21)
            assertEquals(11f, m22)
            assertEquals(12f, m23)
            assertEquals(13f, m30)
            assertEquals(14f, m31)
            assertEquals(15f, m32)
            assertEquals(16f, m33)
        }
    }

    @Test
    fun copyOf_returnsItself() {
        ImmutableMat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f
        ).apply {
            assertSame(this, this.copyOf())
        }
    }
}