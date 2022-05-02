package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.mat2
import dev.folomeev.gl.matrices.mat3
import dev.folomeev.gl.matrices.mat4
import kotlin.test.Test
import kotlin.test.assertEquals

class TimesTest {
    @Test
    fun mat2_timesValue() = assertEquals(
        mat2 { i, j -> (i * 6 + j * 3 + 3).toFloat() },
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }.times(3f)
    )

    @Test
    fun mat3_timesValue() = assertEquals(
        mat3 { i, j -> (i * 9 + j * 3 + 3).toFloat() },
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }.times(3f)
    )

    @Test
    fun mat4_timesValue() = assertEquals(
        mat4 { i, j -> (i * 12 + j * 3 + 3).toFloat() },
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }.times(3f)
    )

    @Test
    fun mat2_timesToValue() = assertEquals(
        mat2 { i, j -> (i * 6 + j * 3 + 3).toFloat() },
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }.timesTo(3f, mutableMat2 { _, _ -> 0f })
    )

    @Test
    fun mat3_timesToValue() = assertEquals(
        mat3 { i, j -> (i * 9 + j * 3 + 3).toFloat() },
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }.timesTo(3f, mutableMat3 { _, _ -> 0f })
    )

    @Test
    fun mat4_timesToValue() = assertEquals(
        mat4 { i, j -> (i * 12 + j * 3 + 3).toFloat() },
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }.timesTo(3f, mutableMat4 { _, _ -> 0f })
    )

    @Test
    fun mat2_timesSelfValue() = assertEquals(
        mat2 { i, j -> (i * 6 + j * 3 + 3).toFloat() },
        mutableMat2 { i, j -> (i * 2 + j + 1).toFloat() }.timesSelf(3f)
    )

    @Test
    fun mat3_timesSelfValue() = assertEquals(
        mat3 { i, j -> (i * 9 + j * 3 + 3).toFloat() },
        mutableMat3 { i, j -> (i * 3 + j + 1).toFloat() }.timesSelf(3f)
    )

    @Test
    fun mat4_timesSelfValue() = assertEquals(
        mat4 { i, j -> (i * 12 + j * 3 + 3).toFloat() },
        mutableMat4 { i, j -> (i * 4 + j + 1).toFloat() }.timesSelf(3f)
    )

    @Test
    fun mat2_timesMat2() = assertEquals(
        mat2(-7f, -10f, -15f, -22f),
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }.times(mat2 { i, j -> -(i * 2 + j + 1).toFloat() })
    )

    @Test
    fun mat3_timesMat3() = assertEquals(
        mat3(
            -30f, -36f, -42f,
            -66f, -81f, -96f,
            -102f, -126f, -150f
        ),
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }.times(mat3 { i, j -> -(i * 3 + j + 1).toFloat() })
    )

    @Test
    fun mat4_timesMat4() = assertEquals(
        mat4(
            -90f, -100f, -110f, -120f,
            -202f, -228f, -254f, -280f,
            -314f, -356f, -398f, -440f,
            -426f, -484f, -542f, -600f
        ),
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }.times(mat4 { i, j -> -(i * 4 + j + 1).toFloat() })
    )

    @Test
    fun mat2_timesToMat2() = assertEquals(
        mat2(-7f, -10f, -15f, -22f),
        mat2 { i, j -> (i * 2 + j + 1).toFloat() }.timesTo(
            mat2 { i, j -> -(i * 2 + j + 1).toFloat() },
            mutableMat2 { _, _ -> 0f })
    )

    @Test
    fun mat3_timesToMat3() = assertEquals(
        mat3(
            -30f, -36f, -42f,
            -66f, -81f, -96f,
            -102f, -126f, -150f
        ),
        mat3 { i, j -> (i * 3 + j + 1).toFloat() }.timesTo(
            mat3 { i, j -> -(i * 3 + j + 1).toFloat() },
            mutableMat3 { _, _ -> 0f })
    )

    @Test
    fun mat4_timesToMat4() = assertEquals(
        mat4(
            -90f, -100f, -110f, -120f,
            -202f, -228f, -254f, -280f,
            -314f, -356f, -398f, -440f,
            -426f, -484f, -542f, -600f
        ),
        mat4 { i, j -> (i * 4 + j + 1).toFloat() }.timesTo(
            mat4 { i, j -> -(i * 4 + j + 1).toFloat() },
            mutableMat4 { _, _ -> 0f })
    )

    @Test
    fun mat2_timesSelfMat2() = assertEquals(
        mat2(-7f, -10f, -15f, -22f),
        mutableMat2 { i, j -> (i * 2 + j + 1).toFloat() }.timesSelf(mat2 { i, j -> -(i * 2 + j + 1).toFloat() })
    )

    @Test
    fun mat3_timesSelfMat3() = assertEquals(
        mat3(
            -30f, -36f, -42f,
            -66f, -81f, -96f,
            -102f, -126f, -150f
        ),
        mutableMat3 { i, j -> (i * 3 + j + 1).toFloat() }.timesSelf(mat3 { i, j -> -(i * 3 + j + 1).toFloat() })
    )

    @Test
    fun mat4_timesSelfMat4() = assertEquals(
        mat4(
            -90f, -100f, -110f, -120f,
            -202f, -228f, -254f, -280f,
            -314f, -356f, -398f, -440f,
            -426f, -484f, -542f, -600f
        ),
        mutableMat4 { i, j -> (i * 4 + j + 1).toFloat() }.timesSelf(mat4 { i, j -> -(i * 4 + j + 1).toFloat() })
    )
}