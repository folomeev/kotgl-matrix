package dev.folomeev.kotgl.matrix.matrices

import kotlin.test.Test
import kotlin.test.assertEquals

class MapReduceTest {
    @Test
    fun mat2_mapReduce() =
        assertEquals(
            mat2 { i, j -> (i * 2 + j + 3).toFloat() },
            mat2 { i, j -> (i * 2 + j + 1).toFloat() }.mapReduce(2f::plus, ::mat2)
        )

    @Test
    fun mat3_mapReduce() =
        assertEquals(
            mat3 { i, j -> (i * 3 + j + 3).toFloat() },
            mat3 { i, j -> (i * 3 + j + 1).toFloat() }.mapReduce(2f::plus, ::mat3)
        )

    @Test
    fun mat4_mapReduce() =
        assertEquals(
            mat4 { i, j -> (i * 4 + j + 3).toFloat() },
            mat4 { i, j -> (i * 4 + j + 1).toFloat() }.mapReduce(2f::plus, ::mat4)
        )

    @Test
    fun mat2_mapReduce_mat2() =
        assertEquals(
            mat2 { i, j -> (i * 4 + j * 2 + 2).toFloat() },
            mat2 { i, j -> (i * 2 + j + 1).toFloat() }
                .mapReduce(mat2 { i, j -> (i * 2 + j + 1).toFloat() }, Float::plus, ::mat2)
        )

    @Test
    fun mat3_mapReduce_mat3() =
        assertEquals(
            mat3 { i, j -> (i * 6 + j * 2 + 2).toFloat() },
            mat3 { i, j -> (i * 3 + j + 1).toFloat() }
                .mapReduce(mat3 { i, j -> (i * 3 + j + 1).toFloat() }, Float::plus, ::mat3)
        )

    @Test
    fun mat4_mapReduce_mat4() =
        assertEquals(
            mat4 { i, j -> (i * 8 + j * 2 + 2).toFloat() },
            mat4 { i, j -> (i * 4 + j + 1).toFloat() }
                .mapReduce(mat4 { i, j -> (i * 4 + j + 1).toFloat() }, Float::plus, ::mat4)
        )
}