package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.mat2
import dev.folomeev.kotgl.matrix.matrices.mat3
import dev.folomeev.kotgl.matrix.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals

class MinusTest {
    @Test
    fun mat2_minus() = assertEquals(
        mat2 { i, j -> (i * 2 + j + 1).toFloat() },
        mat2 { i, j -> (i * 4 + j * 2 + 6).toFloat() }
            .minus(mat2 { i, j -> (i * 2 + j + 5).toFloat() })
    )

    @Test
    fun mat3_minus() = assertEquals(
        mat3 { i, j -> (i * 3 + j + 1).toFloat() },
        mat3 { i, j -> (i * 6 + j * 2 + 6).toFloat() }
            .minus(mat3 { i, j -> (i * 3 + j + 5).toFloat() })
    )

    @Test
    fun mat4_minus() = assertEquals(
        mat4 { i, j -> (i * 4 + j + 1).toFloat() },
        mat4 { i, j -> (i * 8 + j * 2 + 6).toFloat() }
            .minus(mat4 { i, j -> (i * 4 + j + 5).toFloat() })
    )

    @Test
    fun mat2_minusTo() = assertEquals(
        mat2 { i, j -> (i * 2 + j + 1).toFloat() },
        mat2 { i, j -> (i * 4 + j * 2 + 6).toFloat() }
            .minusTo(mat2 { i, j -> (i * 2 + j + 5).toFloat() }, mutableMat2 { _, _ -> 0f })
    )

    @Test
    fun mat3_minusTo() = assertEquals(
        mat3 { i, j -> (i * 3 + j + 1).toFloat() },
        mat3 { i, j -> (i * 6 + j * 2 + 6).toFloat() }
            .minusTo(mat3 { i, j -> (i * 3 + j + 5).toFloat() }, mutableMat3 { _, _ -> 0f })
    )

    @Test
    fun mat4_minusTo() = assertEquals(
        mat4 { i, j -> (i * 4 + j + 1).toFloat() },
        mat4 { i, j -> (i * 8 + j * 2 + 6).toFloat() }
            .minusTo(mat4 { i, j -> (i * 4 + j + 5).toFloat() }, mutableMat4 { _, _ -> 0f })
    )

    @Test
    fun mat2_minusSelf() = assertEquals(
        mat2 { i, j -> (i * 2 + j + 1).toFloat() },
        mutableMat2 { i, j -> (i * 4 + j * 2 + 6).toFloat() }
            .minusSelf(mat2 { i, j -> (i * 2 + j + 5).toFloat() })
    )

    @Test
    fun mat3_minusSelf() = assertEquals(
        mat3 { i, j -> (i * 3 + j + 1).toFloat() },
        mutableMat3 { i, j -> (i * 6 + j * 2 + 6).toFloat() }
            .minusSelf(mat3 { i, j -> (i * 3 + j + 5).toFloat() })
    )

    @Test
    fun mat4_minusSelf() = assertEquals(
        mat4 { i, j -> (i * 4 + j + 1).toFloat() },
        mutableMat4 { i, j -> (i * 8 + j * 2 + 6).toFloat() }
            .minusSelf(mat4 { i, j -> (i * 4 + j + 5).toFloat() })
    )
}