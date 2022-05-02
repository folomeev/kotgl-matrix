package dev.folomeev.gl.matrices

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MatricesTest {
    @Test
    fun mat2_fromValues() {
        mat2(1f, 2f, 3f, 4f).apply {
            assertTrue(this is ImmutableMat)
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mat2_fromInitializer() {
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }.apply {
            assertTrue(this is ImmutableMat)
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mat3_fromValues() {
        mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).apply {
            assertTrue(this is ImmutableMat)
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
    fun mat3_fromInitializer() {
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }.apply {
            assertTrue(this is ImmutableMat)
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
    fun mat4_fromValues() {
        mat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f
        ).apply {
            assertTrue(this is ImmutableMat)
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
    fun mat4_fromInitializer() {
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }.apply {
            assertTrue(this is ImmutableMat)
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
    fun mat2_identity() {
        identityMat2().apply {
            assertTrue(this is ImmutableMat)
            assertEquals(1f, m00)
            assertEquals(0f, m01)

            assertEquals(0f, m10)
            assertEquals(1f, m11)
        }
    }

    @Test
    fun mat3_identity() {
        identityMat3().apply {
            assertTrue(this is ImmutableMat)
            assertEquals(1f, m00)
            assertEquals(0f, m01)
            assertEquals(0f, m02)

            assertEquals(0f, m10)
            assertEquals(1f, m11)
            assertEquals(0f, m12)

            assertEquals(0f, m20)
            assertEquals(0f, m21)
            assertEquals(1f, m22)
        }
    }

    @Test
    fun mat4_identity() {
        identityMat4().apply {
            assertTrue(this is ImmutableMat)
            assertEquals(1f, m00)
            assertEquals(0f, m01)
            assertEquals(0f, m02)
            assertEquals(0f, m03)

            assertEquals(0f, m10)
            assertEquals(1f, m11)
            assertEquals(0f, m12)
            assertEquals(0f, m13)

            assertEquals(0f, m20)
            assertEquals(0f, m21)
            assertEquals(1f, m22)
            assertEquals(0f, m23)

            assertEquals(0f, m30)
            assertEquals(0f, m31)
            assertEquals(0f, m32)
            assertEquals(1f, m33)
        }
    }
}