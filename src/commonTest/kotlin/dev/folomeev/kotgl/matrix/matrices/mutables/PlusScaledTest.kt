package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.mat2
import dev.folomeev.kotgl.matrix.matrices.mat3
import dev.folomeev.kotgl.matrix.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals

class PlusScaledTest {
    @Test
    fun mat2_plusScaled() = assertEquals(
        mat2 { i, j -> (i * 6 + j * 3 + 11).toFloat() },
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }
            .plusScaled(2f, mat2 { i, j -> (i * 2 + j + 5).toFloat() })
    )

    @Test
    fun mat3_plusScaled() = assertEquals(
        mat3 { i, j -> (i * 9 + j * 3 + 11).toFloat() },
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }
            .plusScaled(2f, mat3 { i, j -> (i * 3 + j + 5).toFloat() })
    )

    @Test
    fun mat4_plusScaled() = assertEquals(
        mat4 { i, j -> (i * 12 + j * 3 + 11).toFloat() },
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }
            .plusScaled(2f, mat4 { i, j -> (i * 4 + j + 5).toFloat() })
    )

    @Test
    fun mat2_plusScaledTo() = assertEquals(
        mat2 { i, j -> (i * 6 + j * 3 + 11).toFloat() },
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }
            .plusScaledTo(2f, mat2 { i, j -> (i * 2 + j + 5).toFloat() }, mutableMat2 { _, _ -> 0f })
    )

    @Test
    fun mat3_plusScaledTo() = assertEquals(
        mat3 { i, j -> (i * 9 + j * 3 + 11).toFloat() },
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }
            .plusScaledTo(2f, mat3 { i, j -> (i * 3 + j + 5).toFloat() }, mutableMat3 { _, _ -> 0f })
    )

    @Test
    fun mat4_plusScaledTo() = assertEquals(
        mat4 { i, j -> (i * 12 + j * 3 + 11).toFloat() },
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }
            .plusScaledTo(2f, mat4 { i, j -> (i * 4 + j + 5).toFloat() }, mutableMat4 { _, _ -> 0f })
    )

    @Test
    fun mat2_plusScaledSelf() = assertEquals(
        mat2 { i, j -> (i * 6 + j * 3 + 11).toFloat() },
        mutableMat2 { i, j -> (i * 2 + j + 1).toFloat() }
            .plusScaledSelf(2f, mat2 { i, j -> (i * 2 + j + 5).toFloat() })
    )

    @Test
    fun mat3_plusScaledSelf() = assertEquals(
        mat3 { i, j -> (i * 9 + j * 3 + 11).toFloat() },
        mutableMat3 { i, j -> (i * 3 + j + 1).toFloat() }
            .plusScaledSelf(2f, mat3 { i, j -> (i * 3 + j + 5).toFloat() })
    )

    @Test
    fun mat4_plusScaledSelf() = assertEquals(
        mat4 { i, j -> (i * 12 + j * 3 + 11).toFloat() },
        mutableMat4 { i, j -> (i * 4 + j + 1).toFloat() }
            .plusScaledSelf(2f, mat4 { i, j -> (i * 4 + j + 5).toFloat() })
    )
}