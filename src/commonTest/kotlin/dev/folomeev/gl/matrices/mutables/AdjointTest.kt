package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.mat2
import dev.folomeev.gl.matrices.mat3
import dev.folomeev.gl.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals

class AdjointTest {

    @Test
    fun mat2_adjoint() =
        assertEquals(
            mat2(
                4f, -2f,
                -3f, 1f
            ),
            mat2(
                1f, 2f,
                3f, 4f
            ).adjoint()
        )

    @Test
    fun mat3_adjoint() =
        assertEquals(
            mat3(
                -17f, 13f, -2f,
                -2f, -17f, 13f,
                22f, 7f, -8f
            ),
            mat3(
                1f, 2f, 3f,
                6f, 4f, 5f,
                8f, 9f, 7f
            ).adjoint()
        )

    @Test
    fun mat4_adjoint() =
        assertEquals(
            mat4(
                148f, -124f, 12f, 12f,
                12f, 148f, -124f, 12f,
                12f, 12f, 148f, -124f,
                -188f, -52f, -52f, 84f
            ),
            mat4(
                1f, 2f, 3f, 4f,
                8f, 5f, 6f, 7f,
                11f, 12f, 9f, 10f,
                14f, 15f, 16f, 13f
            ).adjoint()
        )

    @Test
    fun mat2_adjointTo() =
        assertEquals(
            mat2(
                4f, -2f,
                -3f, 1f
            ),
            mat2(
                1f, 2f,
                3f, 4f
            ).adjointTo(mutableMat2 { _, _ -> 0f })
        )

    @Test
    fun mat3_adjointTo() =
        assertEquals(
            mat3(
                -17f, 13f, -2f,
                -2f, -17f, 13f,
                22f, 7f, -8f
            ),
            mat3(
                1f, 2f, 3f,
                6f, 4f, 5f,
                8f, 9f, 7f
            ).adjointTo(mutableMat3 { _, _ -> 0f })
        )

    @Test
    fun mat4_adjointTo() =
        assertEquals(
            mat4(
                148f, -124f, 12f, 12f,
                12f, 148f, -124f, 12f,
                12f, 12f, 148f, -124f,
                -188f, -52f, -52f, 84f
            ),
            mat4(
                1f, 2f, 3f, 4f,
                8f, 5f, 6f, 7f,
                11f, 12f, 9f, 10f,
                14f, 15f, 16f, 13f
            ).adjointTo(mutableMat4 { _, _ -> 0f })
        )


    @Test
    fun mat2_adjointSelf() =
        assertEquals(
            mat2(
                4f, -2f,
                -3f, 1f
            ),
            mutableMat2(
                1f, 2f,
                3f, 4f
            ).adjointSelf()
        )

    @Test
    fun mat3_adjointSelf() =
        assertEquals(
            mat3(
                -17f, 13f, -2f,
                -2f, -17f, 13f,
                22f, 7f, -8f
            ),
            mutableMat3(
                1f, 2f, 3f,
                6f, 4f, 5f,
                8f, 9f, 7f
            ).adjointSelf()
        )

    @Test
    fun mat4_adjointSelf() =
        assertEquals(
            mat4(
                148f, -124f, 12f, 12f,
                12f, 148f, -124f, 12f,
                12f, 12f, 148f, -124f,
                -188f, -52f, -52f, 84f
            ),
            mutableMat4(
                1f, 2f, 3f, 4f,
                8f, 5f, 6f, 7f,
                11f, 12f, 9f, 10f,
                14f, 15f, 16f, 13f
            ).adjointSelf()
        )
}