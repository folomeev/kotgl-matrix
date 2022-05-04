package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.mat2
import dev.folomeev.kotgl.matrix.matrices.mat3
import dev.folomeev.kotgl.matrix.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals

class MutableMatricesTest {
    @Test
    fun mutableMat2_fromValues() {
        mutableMat2(1f, 2f, 3f, 4f).apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mutableMat2_toImmutable() {
        mutableMat2(1f, 2f, 3f, 4f).toImmutable().apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mat2_toMutable() {
        mat2(1f, 2f, 3f, 4f).toMutable().apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mutableMat2_fromMat2() {
        mutableMat2(mat2(1f, 2f, 3f, 4f)).apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mutableMat2_fromInitializer() {
        mutableMat2 { i, j -> (i * 2 + j + 1).toFloat() }.apply {
            assertEquals(1f, m00)
            assertEquals(2f, m01)
            assertEquals(3f, m10)
            assertEquals(4f, m11)
        }
    }

    @Test
    fun mutableMat3_fromValues() {
        mutableMat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).apply {
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
    fun mutableMat3_toImmutable() {
        mutableMat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).toImmutable().apply {
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
    fun mat3_toMutable() {
        mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f).toMutable().apply {
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
    fun mutableMat3_fromMat3() {
        mutableMat3(mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)).apply {
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
    fun mutableMat3_fromInitializer() {
        mutableMat3 { i, j -> (i * 3 + j + 1).toFloat() }.apply {
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
    fun mutableMat4_fromValues() {
        mutableMat4(
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
    fun mutableMat4_toImmutable() {
        mutableMat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f
        ).toImmutable().apply {
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
    fun mat4_toMutable() {
        mutableMat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f
        ).toMutable().apply {
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
    fun mutableMat4_fromMat4() {
        mutableMat4(
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
    fun mutableMat4_fromInitializer() {
        mutableMat4 { i, j -> (i * 4 + j + 1).toFloat() }.apply {
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
}