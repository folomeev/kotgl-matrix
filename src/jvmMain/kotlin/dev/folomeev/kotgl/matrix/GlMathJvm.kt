package dev.folomeev.kotgl.matrix

import java.lang.Math.ulp
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

private const val FLOAT_EPS = 1e-6

internal actual infix fun Float.epsEquals(other: Float) =
    when {
        other == 0f -> abs(this) < FLOAT_EPS
        this == 0f -> abs(other) < FLOAT_EPS
        else -> abs(this - other) <= 7 * max(ulp(this), ulp(other))
    }

private fun sqr(value: Float) = value * value

internal actual fun hypot3(x: Float, y: Float, z: Float) =
    if (x != 0f) abs(x) * sqrt(1f + sqr(y / x) + sqr(z / x)) else hypot2(y, z)

internal actual fun hypot4(x: Float, y: Float, z: Float, w: Float) =
    if (x != 0f) abs(x) * sqrt(1 + sqr(y / x) + sqr(z / x) + sqr(w / x)) else hypot3(y, z, w)
