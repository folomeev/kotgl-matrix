package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.mat3
import dev.folomeev.kotgl.matrix.matrices.mat4
import dev.folomeev.kotgl.matrix.vectors.vec2
import dev.folomeev.kotgl.matrix.vectors.vec3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class TranslateTest {
    @Test
    fun mat3_translate() =
        assertEquals(
            mat3(
                1f, 2f, 3f,
                4f, 5f, 6f,
                61f, 83f, 105f
            ),
            mat3(seqGenerator(3)).translate(vec2(10f, 11f))
        )

    @Test
    fun mat3_translateTo() =
        mutableMat3(constGenerator(100f)).let { matrix ->
            mat3(seqGenerator(3)).translateTo(vec2(10f, 11f), matrix)
                .let { translated ->
                    assertSame(translated, matrix)
                    assertEquals(
                        mat3(
                            1f, 2f, 3f,
                            4f, 5f, 6f,
                            61f, 83f, 105f
                        ),
                        matrix
                    )
                }
        }

    @Test
    fun mat3_translateSelf() =
        mutableMat3(seqGenerator(3)).let { matrix ->
            val translated = matrix.translateSelf(vec2(10f, 11f))
            assertSame(translated, matrix)
            assertEquals(
                mat3(
                    1f, 2f, 3f,
                    4f, 5f, 6f,
                    61f, 83f, 105f
                ),
                matrix
            )
        }

    @Test
    fun mat4_translate() =
        assertEquals(
            mat4(
                1f, 2f, 3f, 4f,
                5f, 6f, 7f, 8f,
                9f, 10f, 11f, 12f,
                291f, 346f, 401f, 456f,
            ),
            mat4(seqGenerator(4)).translate(vec3(17f, 18f, 19f))
        )

    @Test
    fun mat4_translateTo() =
        mutableMat4(constGenerator(100f)).let { matrix ->
            mat4(seqGenerator(4)).translateTo(vec3(17f, 18f, 19f), matrix)
                .let { translated ->
                    assertSame(translated, matrix)
                    assertEquals(
                        mat4(
                            1f, 2f, 3f, 4f,
                            5f, 6f, 7f, 8f,
                            9f, 10f, 11f, 12f,
                            291f, 346f, 401f, 456f,
                        ),
                        matrix
                    )
                }
        }

    @Test
    fun mat4_translateSelf() =
        mutableMat4(seqGenerator(4)).let { matrix ->
            val translated = matrix.translateSelf(vec3(17f, 18f, 19f))
            assertSame(translated, matrix)
            assertEquals(
                mat4(
                    1f, 2f, 3f, 4f,
                    5f, 6f, 7f, 8f,
                    9f, 10f, 11f, 12f,
                    291f, 346f, 401f, 456f,
                ),
                matrix
            )
        }

    companion object {
        fun seqGenerator(size: Int) = { i: Int, j: Int -> (i * size + j + 1).toFloat() }

        fun constGenerator(value: Float) = { _: Int, _: Int -> value }
    }
}