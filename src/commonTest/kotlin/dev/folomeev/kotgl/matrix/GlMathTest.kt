package dev.folomeev.kotgl.matrix

import kotlin.math.sqrt
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GlMathTest {
    @Test
    fun epsEquals_2_equals_2() = assertTrue(2f epsEquals 2f)

    @Test
    fun epsEquals_closeValue_equals() = assertTrue(.1f + .1f epsEquals .2f)

    @Test
    fun epsEquals_smallValue_equals() = assertTrue(1e-16f + 1e-16f epsEquals 2e-16f)

    @Test
    fun epsEquals_smallValue_nonEquals() = assertFalse(1e-16f + 1e-16f epsEquals 3e-16f)

    @Test
    fun epsEquals_leftZero_equals() = assertTrue(1e-16f epsEquals 0f)

    @Test
    fun epsEquals_rightZero_equals() = assertTrue(0f epsEquals 1e-16f)

    @Test
    fun epsEquals_leftZero_nonEquals() = assertFalse(1e-5f epsEquals 0f)

    @Test
    fun epsEquals_rightZero_nonEquals() = assertFalse(0f epsEquals 1e-5f)

    @Test
    fun hypot2_lowValues() = assertEquals(5f, hypot2(3f, 4f))

    @Test
    fun hypot2_negativeValues() = assertEquals(5f, hypot2(-3f, -4f))

    @Test
    fun hypot2_noOverflow() = assertEquals(5e20f, hypot2(3e20f, 4e20f))

    @Test
    fun hypot2_noUnderflow() = assertEquals(5e-20f, hypot2(3e-20f, 4e-20f))

    @Test
    fun hypot3_lowValues() = assertEquals(sqrt(50f), hypot3(3f, 4f, 5f))

    @Test
    fun hypot3_negativeValues() = assertEquals(sqrt(50f), hypot3(-3f, -4f, -5f))

    @Test
    fun hypot3_noOverflow() = assertEquals(sqrt(50f) * 1e20f, hypot3(3e20f, 4e20f, 5e20f))

    @Test
    fun hypot3_noUnderflow() = assertEquals(sqrt(50f) * 1e-20f, hypot3(3e-20f, 4e-20f, 5e-20f))

    @Test
    fun hypot4_lowValues() = assertEquals(sqrt(54f), hypot4(2f, 3f, 4f, 5f))

    @Test
    fun hypot4_negativeValues() = assertEquals(sqrt(54f), hypot4(-2f, -3f, -4f, -5f))

    @Test
    fun hypot4_noOverflow() = assertEquals(sqrt(54f) * 1e20f, hypot4(2e20f, 3e20f, 4e20f, 5e20f))

    @Test
    fun hypot4_noUnderflow() = assertEquals(sqrt(54f) * 1e-20f, hypot4(2e-20f, 3e-20f, 4e-20f, 5e-20f))

    @Test
    fun sqrHypot2_lowValues() = assertEquals(25f, sqrHypot2(3f, 4f))

    @Test
    fun sqrHypot3_lowValues() = assertEquals(50f, sqrHypot3(3f, 4f, 5f))

    @Test
    fun sqrHypot4_lowValues() = assertEquals(54f, sqrHypot4(2f, 3f, 4f, 5f))

    @Test
    fun sumOf2_success() = assertEquals(3f, sumOf2(1f, 2f))

    @Test
    fun sumOf3_success() = assertEquals(6f, sumOf3(1f, 2f, 3f))

    @Test
    fun sumOf4_success() = assertEquals(10f, sumOf4(1f, 2f, 3f, 4f))
}