@file:kotlin.jvm.JvmName("Asserts")

package dev.folomeev.kotgl.matrix.vectors

import dev.folomeev.kotgl.matrix.epsEquals
import kotlin.test.fail

fun assertEquals(expected: Float, actual: Float) {
    expected epsEquals actual || fail("expected <$expected> but was: <$actual>")
}

fun assertEquals(expectedX: Float, expectedY: Float, actual: Vec2) = assertEquals(expectedX, expectedY, 0f, 0f, actual)

fun assertEquals(expectedX: Float, expectedY: Float, expectedZ: Float, actual: Vec3) =
    assertEquals(expectedX, expectedY, expectedZ, 0f, actual)

fun assertEquals(expectedX: Float, expectedY: Float, expectedZ: Float, expectedW: Float, actual: Vec4) {
    expectedX epsEquals actual.x || fail("X expected <$expectedX> but was: <${actual.x}>")
    expectedY epsEquals actual.y || fail("Y expected <$expectedY> but was: <${actual.y}>")
    expectedZ epsEquals actual.z || fail("Z expected <$expectedZ> but was: <${actual.z}>")
    expectedW epsEquals actual.w || fail("W expected <$expectedW> but was: <${actual.w}>")
}