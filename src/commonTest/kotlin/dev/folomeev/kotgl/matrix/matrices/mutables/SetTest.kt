package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.mat2
import dev.folomeev.kotgl.matrix.matrices.mat3
import dev.folomeev.kotgl.matrix.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals

class SetTest {
    @Test
    fun mutableMat2_setValues() {
        mutableMat2 { _, _ -> 0f }.set(1f, 2f, 3f, 4f).apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mutableMat2_setMat2() {
        mutableMat2 { _, _ -> 0f }.set(mat2(1f, 2f, 3f, 4f)).apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mutableMat2_setAll() {
        mutableMat2 { _, _ -> 0f }.setAll(1f).apply {
            assertEquals(1f, m00)
            assertEquals(1f, m01)
            assertEquals(1f, m10)
            assertEquals(1f, m11)
        }
    }

    @Test
    fun mutableMat3_setValues() {
        mutableMat3 { _, _ -> 0f }.set(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).apply {
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
    fun mutableMat4_setMat3() {
        mutableMat3 { _, _ -> 0f }.set(mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)).apply {
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
    fun mutableMat3_setAll() {
        mutableMat3 { _, _ -> 0f }.setAll(1f).apply {
            assertEquals(1f, m00)
            assertEquals(1f, m01)
            assertEquals(1f, m02)
            assertEquals(1f, m10)
            assertEquals(1f, m11)
            assertEquals(1f, m12)
            assertEquals(1f, m20)
            assertEquals(1f, m21)
            assertEquals(1f, m22)
        }
    }

    @Test
    fun mutableMat4_setValues() {
        mutableMat4 { _, _ -> 0f }.set(
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
    fun mutableMat4_setMat4() {
        mutableMat4 { _, _ -> 0f }.set(
            mat4(
                1f, 2f, 3f, 4f,
                5f, 6f, 7f, 8f,
                9f, 10f, 11f, 12f,
                13f, 14f, 15f, 16f
            )
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
    fun mutableMat4_setAll() {
        mutableMat4 { _, _ -> 0f }.setAll(1f).apply {
            assertEquals(1f, m00)
            assertEquals(1f, m01)
            assertEquals(1f, m02)
            assertEquals(1f, m03)
            assertEquals(1f, m10)
            assertEquals(1f, m11)
            assertEquals(1f, m12)
            assertEquals(1f, m13)
            assertEquals(1f, m20)
            assertEquals(1f, m21)
            assertEquals(1f, m22)
            assertEquals(1f, m23)
            assertEquals(1f, m30)
            assertEquals(1f, m31)
            assertEquals(1f, m32)
            assertEquals(1f, m33)
        }
    }
}