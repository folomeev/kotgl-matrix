package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.mat2
import dev.folomeev.kotgl.matrix.matrices.mat3
import dev.folomeev.kotgl.matrix.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals

class PlusTest {
    @Test
    fun mat2_plus() = assertEquals(
        mat2 { i, j -> (i * 4 + j * 2 + 6).toFloat() },
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }
            .plus(mat2 { i, j -> (i * 2 + j + 5).toFloat() })
    )

    @Test
    fun mat3_plus() = assertEquals(
        mat3 { i, j -> (i * 6 + j * 2 + 6).toFloat() },
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }
            .plus(mat3 { i, j -> (i * 3 + j + 5).toFloat() })
    )

    @Test
    fun mat4_plus() = assertEquals(
        mat4 { i, j -> (i * 8 + j * 2 + 6).toFloat() },
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }
            .plus(mat4 { i, j -> (i * 4 + j + 5).toFloat() })
    )

    @Test
    fun mat2_plusTo() = assertEquals(
        mat2 { i, j -> (i * 4 + j * 2 + 6).toFloat() },
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }
            .plusTo(mat2 { i, j -> (i * 2 + j + 5).toFloat() }, mutableMat2 { _, _ -> 0f })
    )

    @Test
    fun mat3_plusTo() = assertEquals(
        mat3 { i, j -> (i * 6 + j * 2 + 6).toFloat() },
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }
            .plusTo(mat3 { i, j -> (i * 3 + j + 5).toFloat() }, mutableMat3 { _, _ -> 0f })
    )

    @Test
    fun mat4_plusTo() = assertEquals(
        mat4 { i, j -> (i * 8 + j * 2 + 6).toFloat() },
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }
            .plusTo(mat4 { i, j -> (i * 4 + j + 5).toFloat() }, mutableMat4 { _, _ -> 0f })
    )

    @Test
    fun mat2_plusSelf() = assertEquals(
        mat2 { i, j -> (i * 4 + j * 2 + 6).toFloat() },
        mutableMat2 { i, j -> (i * 2 + j + 1).toFloat() }
            .plusSelf(mat2 { i, j -> (i * 2 + j + 5).toFloat() })
    )

    @Test
    fun mat3_plusSelf() = assertEquals(
        mat3 { i, j -> (i * 6 + j * 2 + 6).toFloat() },
        mutableMat3 { i, j -> (i * 3 + j + 1).toFloat() }
            .plusSelf(mat3 { i, j -> (i * 3 + j + 5).toFloat() })
    )

    @Test
    fun mat4_plusSelf() = assertEquals(
        mat4 { i, j -> (i * 8 + j * 2 + 6).toFloat() },
        mutableMat4 { i, j -> (i * 4 + j + 1).toFloat() }
            .plusSelf(mat4 { i, j -> (i * 4 + j + 5).toFloat() })
    )
}