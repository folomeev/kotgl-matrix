package dev.folomeev.gl

import kotlin.math.abs

private const val FLOAT_EPS = 1e-6

actual infix fun Float.epsEquals(other: Float) =
    when {
        other == 0f -> abs(this) < FLOAT_EPS
        this == 0f -> abs(other) < FLOAT_EPS
        else -> abs(this / other - 1) <= FLOAT_EPS
    }

private external class Math {
    companion object {
        fun hypot(x: Float, y: Float, z: Float): Float
        fun hypot(x: Float, y: Float, z: Float, w: Float): Float
    }
}

internal actual fun hypot3(x: Float, y: Float, z: Float) = Math.hypot(x, y, z)
internal actual fun hypot4(x: Float, y: Float, z: Float, w: Float) = Math.hypot(x, y, z, w)