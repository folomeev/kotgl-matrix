package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.assertEquals
import dev.folomeev.gl.vectors.length
import kotlin.random.Random
import kotlin.test.Test

class RandomizeTest {
    private val random = Random(1234)

    @Test
    fun nextVec2_newVec() = assertEquals(1.5f, random.nextVec2(length = 1.5f).length())

    @Test
    fun nextVec3_newVec() = assertEquals(2.5f, random.nextVec3(length = 2.5f).length())

    @Test
    fun nextVec4_newVec() = assertEquals(3.5f, random.nextVec4(length = 3.5f).length())

    @Test
    fun nextVec2_reuseVec() = assertEquals(4.5f, random.nextVec2To(length = 4.5f, mutableVec2()).length())

    @Test
    fun nextVec3_reuseVec() = assertEquals(5.5f, random.nextVec3To(length = 5.5f, mutableVec3()).length())

    @Test
    fun nextVec4_reuseVec() = assertEquals(6.5f, random.nextVec4To(length = 6.5f, mutableVec4()).length())

    @Test
    fun mutableVec2_setRandom() = assertEquals(7.5f, mutableVec2().randomizeSelf(random, length = 7.5f).length())

    @Test
    fun mutableVec3_setRandom() = assertEquals(8.5f, mutableVec3().randomizeSelf(random, length = 8.5f).length())

    @Test
    fun mutableVec4_setRandom() = assertEquals(9.5f, mutableVec4().randomizeSelf(random, length = 9.5f).length())
}