package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.mat2
import dev.folomeev.gl.matrices.mat3
import dev.folomeev.gl.matrices.mat4
import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class RotateTest {

    @Test
    fun mat2_rotate_PI() =
        assertEquals(
            mat2(-1f, -2f, -3f, -4f),
            mat2(1f, 2f, 3f, 4f).rotate(PI)
        )

    @Test
    fun mat2_rotate_PI_2() =
        assertEquals(
            mat2(3f, 4f, -1f, -2f),
            mat2(1f, 2f, 3f, 4f).rotate(PI / 2)
        )

    @Test
    fun mat2_rotateTo_PI() =
        assertEquals(
            mat2(-1f, -2f, -3f, -4f),
            mat2(1f, 2f, 3f, 4f).rotateTo(PI, mutableMat2 { _, _ -> 0f })
        )

    @Test
    fun mat2_rotateTo_PI_2() =
        assertEquals(
            mat2(3f, 4f, -1f, -2f),
            mat2(1f, 2f, 3f, 4f).rotateTo(PI / 2, mutableMat2 { _, _ -> 0f })
        )

    @Test
    fun mat2_rotateSelf_PI() =
        assertEquals(
            mat2(-1f, -2f, -3f, -4f),
            mutableMat2(1f, 2f, 3f, 4f).rotateSelf(PI)
        )

    @Test
    fun mat2_rotateSelf_PI_2() =
        assertEquals(
            mat2(3f, 4f, -1f, -2f),
            mutableMat2(1f, 2f, 3f, 4f).rotateSelf(PI / 2)
        )

    @Test
    fun mat3_rotate_PI() =
        assertEquals(
            mat3(-1f, -2f, -3f, -4f, -5f, -6f, 7f, 8f, 9f),
            mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)
                .rotate(PI)
        )

    @Test
    fun mat3_rotate_PI_2() =
        assertEquals(
            mat3(-4f, -5f, -6f, 1f, 2f, 3f, 7f, 8f, 9f),
            mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)
                .rotate(-PI / 2)
        )

    @Test
    fun mat3_rotateTo_PI() =
        assertEquals(
            mat3(-1f, -2f, -3f, -4f, -5f, -6f, 7f, 8f, 9f),
            mutableMat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)
                .rotateTo(PI, mutableMat3 { _, _ -> 0f })
        )

    @Test
    fun mat3_rotateTo_PI_2() =
        assertEquals(
            mat3(-4f, -5f, -6f, 1f, 2f, 3f, 7f, 8f, 9f),
            mat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)
                .rotateTo(-PI / 2, mutableMat3 { _, _ -> 0f })
        )

    @Test
    fun mat3_rotateSelf_PI() =
        assertEquals(
            mat3(-1f, -2f, -3f, -4f, -5f, -6f, 7f, 8f, 9f),
            mutableMat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)
                .rotateSelf(PI)
        )

    @Test
    fun mat3_rotateSelf_PI_2() =
        assertEquals(
            mat3(-4f, -5f, -6f, 1f, 2f, 3f, 7f, 8f, 9f),
            mutableMat3(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f)
                .rotateSelf(-PI / 2)
        )

    @Test
    fun mat4_rotateX_PI() =
        assertEquals(
            mat4(1f, 2f, 3f, 4f, -5f, -6f, -7f, -8f, -9f, -10f, -11f, -12f, 13f, 14f, 15f, 16f),
            mat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateX(PI)
        )

    @Test
    fun mat4_rotateXTo_PI() =
        assertEquals(
            mat4(1f, 2f, 3f, 4f, -5f, -6f, -7f, -8f, -9f, -10f, -11f, -12f, 13f, 14f, 15f, 16f),
            mat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateXTo(PI, mutableMat4 { _, _ -> 0f })
        )

    @Test
    fun mat4_rotateXSelf_PI() =
        assertEquals(
            mat4(1f, 2f, 3f, 4f, -5f, -6f, -7f, -8f, -9f, -10f, -11f, -12f, 13f, 14f, 15f, 16f),
            mutableMat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateXSelf(PI)
        )


    @Test
    fun mat4_rotateY_PI() =
        assertEquals(
            mat4(-1f, -2f, -3f, -4f, 5f, 6f, 7f, 8f, -9f, -10f, -11f, -12f, 13f, 14f, 15f, 16f),
            mat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateY(PI)
        )

    @Test
    fun mat4_rotateYTo_PI() =
        assertEquals(
            mat4(-1f, -2f, -3f, -4f, 5f, 6f, 7f, 8f, -9f, -10f, -11f, -12f, 13f, 14f, 15f, 16f),
            mat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateYTo(PI, mutableMat4 { _, _ -> 0f })
        )

    @Test
    fun mat4_rotateYSelf_PI() =
        assertEquals(
            mat4(-1f, -2f, -3f, -4f, 5f, 6f, 7f, 8f, -9f, -10f, -11f, -12f, 13f, 14f, 15f, 16f),
            mutableMat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateYSelf(PI)
        )

    @Test
    fun mat4_rotateZ_PI() =
        assertEquals(
            mat4(-1f, -2f, -3f, -4f, -5f, -6f, -7f, -8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f),
            mat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateZ(PI)
        )

    @Test
    fun mat4_rotateZTo_PI() =
        assertEquals(
            mat4(-1f, -2f, -3f, -4f, -5f, -6f, -7f, -8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f),
            mat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateZTo(PI, mutableMat4 { _, _ -> 0f })
        )

    @Test
    fun mat4_rotateZSelf_PI() =
        assertEquals(
            mat4(-1f, -2f, -3f, -4f, -5f, -6f, -7f, -8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f),
            mutableMat4(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 11f, 12f, 13f, 14f, 15f, 16f)
                .rotateZSelf(PI)
        )
}