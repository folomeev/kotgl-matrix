package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class ReduceTest {
    @Test
    fun mat2_reduce() =
        assertEquals(10f, mat2 { i, j -> (i * 2 + j + 1).toFloat() }.reduce { a, b, c, d -> a + b + c + d })

    @Test
    fun mat3_reduce() =
        assertEquals(45f, mat3 { i, j -> (i * 3 + j + 1).toFloat() }.reduce { a, b, c, d, e, f, g, h, i ->
            a + b + c + d + e + f + g + h + i
        })

    @Test
    fun mat4_reduce() =
        assertEquals(
            136f,
            mat4 { i, j -> (i * 4 + j + 1).toFloat() }.reduce { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p ->
                a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p
            })
}