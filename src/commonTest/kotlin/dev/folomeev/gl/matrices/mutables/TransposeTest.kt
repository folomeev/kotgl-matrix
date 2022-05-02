package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.mat2
import dev.folomeev.gl.matrices.mat3
import dev.folomeev.gl.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class TransposeTest {
    @Test
    fun mat2_transpose() =
        assertEquals(
            mat2(1f, 2f, 3f, 4f),
            mat2(1f, 3f, 2f, 4f).transpose()
        )

    @Test
    fun mat2_transposeTo() =
        assertEquals(
            mat2(1f, 2f, 3f, 4f),
            mat2(1f, 3f, 2f, 4f).transposeTo(mutableMat2 { _, _ -> 0f })
        )

    @Test
    fun mat2_transposeSelf() {
        mutableMat2(1f, 3f, 2f, 4f).apply {
            transposeSelf().also { transposed ->
                assertSame(this, transposed)
                assertEquals(mat2(1f, 2f, 3f, 4f), transposed)
            }
        }
    }

    @Test
    fun mat3_transpose() =
        assertEquals(
            mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f),
            mat3(1f, 4f, 7f, 2f, 5f, 8f, 3f, 6f, 9f).transpose()
        )

    @Test
    fun mat3_transposeTo() =
        assertEquals(
            mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f),
            mat3(1f, 4f, 7f, 2f, 5f, 8f, 3f, 6f, 9f).transposeTo(mutableMat3 { _, _ -> 0f })
        )

    @Test
    fun mat3_transposeSelf() {
        mutableMat3(1f, 4f, 7f, 2f, 5f, 8f, 3f, 6f, 9f).apply {
            transposeSelf().also { transposed ->
                assertSame(this, transposed)
                assertEquals(mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f), transposed)
            }
        }
    }

    @Test
    fun mat4_transpose() =
        assertEquals(
            mat4(
                1f, 2f, 3f, 4f,
                5f, 6f, 7f, 8f,
                9f, 10f, 11f, 12f,
                13f, 14f, 15f, 16f
            ),
            mat4(
                1f, 5f, 9f, 13f,
                2f, 6f, 10f, 14f,
                3f, 7f, 11f, 15f,
                4f, 8f, 12f, 16f
            ).transpose()
        )

    @Test
    fun mat4_transposeTo() =
        assertEquals(
            mat4(
                1f, 2f, 3f, 4f,
                5f, 6f, 7f, 8f,
                9f, 10f, 11f, 12f,
                13f, 14f, 15f, 16f
            ),
            mat4(
                1f, 5f, 9f, 13f,
                2f, 6f, 10f, 14f,
                3f, 7f, 11f, 15f,
                4f, 8f, 12f, 16f
            ).transposeTo(mutableMat4 { _, _ -> 0f })
        )

    @Test
    fun mat4_transposeSelf() {
        mutableMat4(
            1f, 5f, 9f, 13f,
            2f, 6f, 10f, 14f,
            3f, 7f, 11f, 15f,
            4f, 8f, 12f, 16f
        ).apply {
            transposeSelf().also { transposed ->
                assertSame(this, transposed)
                assertEquals(
                    mat4(
                        1f, 2f, 3f, 4f,
                        5f, 6f, 7f, 8f,
                        9f, 10f, 11f, 12f,
                        13f, 14f, 15f, 16f
                    ), transposed
                )
            }
        }
    }
}