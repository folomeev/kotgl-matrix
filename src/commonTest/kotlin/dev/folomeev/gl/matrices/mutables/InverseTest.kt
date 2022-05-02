package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.mat2
import dev.folomeev.gl.matrices.mat3
import dev.folomeev.gl.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class InverseTest {
    @Test
    fun mat2_inverse() =
        assertEquals(
            mat2(
                -2f, 1f,
                1.5f, -0.5f
            ),
            mat2(
                1f, 2f,
                3f, 4f
            ).inverse()
        )

    @Test
    fun mat3_inverse() =
        assertEquals(
            mat3(
                -17f / 45f, 13f / 45f, -2f / 45f,
                -2f / 45f, -17f / 45f, 13f / 45f,
                22f / 45f, 7f / 45f, -8f / 45f
            ),
            mat3(
                1f, 2f, 3f,
                6f, 4f, 5f,
                8f, 9f, 7f
            ).inverse()
        )

    @Test
    fun mat4_inverse() =
        assertEquals(
            mat4(
                -148f / 544f, 124f / 544f, -12f / 544f, -12f / 544f,
                -12f / 544f, -148f / 544f, 124f / 544f, -12f / 544f,
                -12f / 544f, -12f / 544f, -148f / 544f, 124f / 544f,
                188f / 544f, 52f / 544f, 52f / 544f, -84f / 544f
            ),
            mat4(
                1f, 2f, 3f, 4f,
                8f, 5f, 6f, 7f,
                11f, 12f, 9f, 10f,
                14f, 15f, 16f, 13f
            ).inverse()
        )

    @Test
    fun mat2_inverseTo() =
        assertEquals(
            mat2(
                -2f, 1f,
                1.5f, -0.5f
            ),
            mat2(
                1f, 2f,
                3f, 4f
            ).inverseTo(mutableMat2 { _, _ -> 0f })
        )

    @Test
    fun mat3_inverseTo() =
        assertEquals(
            mat3(
                -17f / 45f, 13f / 45f, -2f / 45f,
                -2f / 45f, -17f / 45f, 13f / 45f,
                22f / 45f, 7f / 45f, -8f / 45f
            ),
            mat3(
                1f, 2f, 3f,
                6f, 4f, 5f,
                8f, 9f, 7f
            ).inverseTo(mutableMat3 { _, _ -> 0f })
        )

    @Test
    fun mat4_inverseTo() =
        assertEquals(
            mat4(
                -148f / 544f, 124f / 544f, -12f / 544f, -12f / 544f,
                -12f / 544f, -148f / 544f, 124f / 544f, -12f / 544f,
                -12f / 544f, -12f / 544f, -148f / 544f, 124f / 544f,
                188f / 544f, 52f / 544f, 52f / 544f, -84f / 544f
            ),
            mat4(
                1f, 2f, 3f, 4f,
                8f, 5f, 6f, 7f,
                11f, 12f, 9f, 10f,
                14f, 15f, 16f, 13f
            ).inverseTo(mutableMat4 { _, _ -> 0f })
        )


    @Test
    fun mat2_inverseSelf() =
        assertEquals(
            mat2(
                -2f, 1f,
                1.5f, -0.5f
            ),
            mutableMat2(
                1f, 2f,
                3f, 4f
            ).inverseSelf()
        )

    @Test
    fun mat3_inverseSelf() =
        assertEquals(
            mat3(
                -17f / 45f, 13f / 45f, -2f / 45f,
                -2f / 45f, -17f / 45f, 13f / 45f,
                22f / 45f, 7f / 45f, -8f / 45f
            ),
            mutableMat3(
                1f, 2f, 3f,
                6f, 4f, 5f,
                8f, 9f, 7f
            ).inverseSelf()
        )

    @Test
    fun mat4_inverseSelf() =
        assertEquals(
            mat4(
                -148f / 544f, 124f / 544f, -12f / 544f, -12f / 544f,
                -12f / 544f, -148f / 544f, 124f / 544f, -12f / 544f,
                -12f / 544f, -12f / 544f, -148f / 544f, 124f / 544f,
                188f / 544f, 52f / 544f, 52f / 544f, -84f / 544f
            ),
            mutableMat4(
                1f, 2f, 3f, 4f,
                8f, 5f, 6f, 7f,
                11f, 12f, 9f, 10f,
                14f, 15f, 16f, 13f
            ).inverseSelf()
        )

    @Test
    fun mat2_detZero_exceptionThrown() {
        assertFails(
            mat2(
                1f, 2f,
                2f, 4f
            )::inverse
        )
    }

    @Test
    fun mat3_detZero_exceptionThrown() {
        assertFails(
            mat3(
                1f, 2f, 3f,
                4f, 5f, 6f,
                7f, 8f, 9f
            )::inverse
        )
    }

    @Test
    fun mat4_detZero_exceptionThrown() {
        assertFails(
            mat4(
                1f, 2f, 3f, 4f,
                2f, 4f, 6f, 8f,
                1f, 2f, 3f, 4f,
                2f, 4f, 6f, 8f
            )::inverse
        )
    }
}