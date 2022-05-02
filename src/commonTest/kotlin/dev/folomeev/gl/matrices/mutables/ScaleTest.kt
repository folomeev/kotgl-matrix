package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.mat2
import dev.folomeev.gl.matrices.mat3
import dev.folomeev.gl.matrices.mat4
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class ScaleTest {
    @Test
    fun mat2_scale() =
        assertEquals(
            mat2(5f, 10f, 18f, 24f),
            mat2(1f, 2f, 3f, 4f).scale(vec2(5f, 6f)),
        )

    @Test
    fun mat2_scaleTo() =
        mutableMat2 { _, _ -> 0f }.let { matrix ->
            mat2(1f, 2f, 3f, 4f).scaleTo(vec2(5f, 6f), matrix).let { scaled ->
                assertSame(scaled, matrix)
                assertEquals(mat2(5f, 10f, 18f, 24f), scaled)
            }
        }

    @Test
    fun mat2_scaleSelf() =
        mutableMat2(1f, 2f, 3f, 4f).let { matrix ->
            matrix.scaleSelf(vec2(5f, 6f)).let { scaled ->
                assertSame(scaled, matrix)
                assertEquals(mat2(5f, 10f, 18f, 24f), scaled)
            }
        }

    @Test
    fun mat3_scale() =
        assertEquals(
            mat3(
                10f, 20f, 30f,
                44f, 55f, 66f,
                7f, 8f, 9f
            ),
            mat3(
                1f, 2f, 3f,
                4f, 5f, 6f,
                7f, 8f, 9f
            ).scale(vec2(10f, 11f)),
        )

    @Test
    fun mat3_scaleTo() =
        mutableMat3 { _, _ -> 0f }.let { matrix ->
            mat3(
                1f, 2f, 3f,
                4f, 5f, 6f,
                7f, 8f, 9f
            ).scaleTo(vec2(10f, 11f), matrix).let { scaled ->
                assertSame(scaled, matrix)
                assertEquals(
                    mat3(
                        10f, 20f, 30f,
                        44f, 55f, 66f,
                        7f, 8f, 9f
                    ), scaled
                )
            }
        }

    @Test
    fun mat3_scaleSelf() =
        mutableMat3(
            1f, 2f, 3f,
            4f, 5f, 6f,
            7f, 8f, 9f
        ).let { matrix ->
            matrix.scaleSelf(vec2(10f, 11f)).let { scaled ->
                assertSame(scaled, matrix)
                assertEquals(
                    mat3(
                        10f, 20f, 30f,
                        44f, 55f, 66f,
                        7f, 8f, 9f
                    ), scaled
                )
            }
        }

    @Test
    fun mat4_scale() =
        assertEquals(
            mat4(
                17f, 34f, 51f, 68f,
                90f, 108f, 126f, 144f,
                171f, 190f, 209f, 228f,
                13f, 14f, 15f, 16f

            ),
            mat4(
                1f, 2f, 3f, 4f,
                5f, 6f, 7f, 8f,
                9f, 10f, 11f, 12f,
                13f, 14f, 15f, 16f
            ).scale(vec3(17f, 18f, 19f)),
        )

    @Test
    fun mat4_scaleTo() =
        mutableMat4 { _, _ -> 0f }.let { matrix ->
            mat4(
                1f, 2f, 3f, 4f,
                5f, 6f, 7f, 8f,
                9f, 10f, 11f, 12f,
                13f, 14f, 15f, 16f
            ).scaleTo(vec3(17f, 18f, 19f), matrix).let { scaled ->
                assertSame(scaled, matrix)
                assertEquals(
                    mat4(
                        17f, 34f, 51f, 68f,
                        90f, 108f, 126f, 144f,
                        171f, 190f, 209f, 228f,
                        13f, 14f, 15f, 16f
                    ), scaled
                )
            }
        }

    @Test
    fun mat4_scaleSelf() =
        mutableMat4(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f
        ).let { matrix ->
            matrix.scaleSelf(vec3(17f, 18f, 19f)).let { scaled ->
                assertSame(scaled, matrix)
                assertEquals(
                    mat4(
                        17f, 34f, 51f, 68f,
                        90f, 108f, 126f, 144f,
                        171f, 190f, 209f, 228f,
                        13f, 14f, 15f, 16f
                    ), scaled
                )
            }
        }
}