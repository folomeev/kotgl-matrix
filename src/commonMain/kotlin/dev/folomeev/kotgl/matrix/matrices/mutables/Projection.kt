/** Set of matrix projecting methods. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.FloatMapping16
import kotlin.math.tan

private fun <T> orthogonal(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f,
    out: FloatMapping16<T>
): T {
    val invWidth = 1f / (left - right)
    val invHeight = 1f / (bottom - top)
    val invDepth = 1f / (near - far)
    return out(
        -2f * invWidth, 0f, 0f, 0f,
        0f, -2 * invHeight, 0f, 0f,
        0f, 0f, 2f * invDepth, 0f,
        (left + right) * invWidth, (top + bottom) * invHeight, (far + near) * invDepth, 1f
    )
}

private fun <T> perspective(
    fovRad: Float,
    aspect: Float,
    near: Float,
    far: Float,
    out: FloatMapping16<T>
): T {
    val f = 1f / tan(fovRad / 2f)
    val nf = 1 / (near - far)
    return out(
        f / aspect, 0f, 0f, 0f,
        0f, f, 0f, 0f,
        0f, 0f, (far + near) * nf, -1f,
        0f, 0f, 2 * far * near * nf, 0f
    )
}

private fun <T> frustum(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f,
    out: FloatMapping16<T>
): T {
    val invWidth = 1f / (right - left)
    val invHeight = 1f / (top - bottom)
    val invDepth = 1f / (near - far)
    return out(
        2f * invWidth * near, 0f, 0f, 0f,
        0f, 2 * invHeight * near, 0f, 0f,
        (left + right) * invWidth, (top + bottom) * invHeight, (far + near) * invDepth, -1f,
        0f, 0f, 2f * far * near * invDepth, 0f
    )
}

fun orthogonal(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f,
) = orthogonal(left, right, bottom, top, near, far, ::mutableMat4)

fun perspective(
    fovRad: Float,
    aspect: Float,
    near: Float,
    far: Float
) = perspective(fovRad, aspect, near, far, ::mutableMat4)

fun frustum(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f
) = frustum(left, right, bottom, top, near, far, ::mutableMat4)

fun orthogonalTo(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f,
    out: MutableMat4
) = orthogonal(left, right, bottom, top, near, far, out::set)

fun perspectiveTo(
    fovRad: Float,
    aspect: Float,
    near: Float,
    far: Float,
    out: MutableMat4
) = perspective(fovRad, aspect, near, far, out::set)

fun frustumTo(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f,
    out: MutableMat4
) = frustum(left, right, bottom, top, near, far, out::set)

fun MutableMat4.orthogonalSelf(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f,
) = orthogonalTo(left, right, bottom, top, near, far, this)

fun MutableMat4.perspectiveSelf(
    fovRad: Float,
    aspect: Float,
    near: Float,
    far: Float
) = perspectiveTo(fovRad, aspect, near, far, this)

fun MutableMat4.frustumSelf(
    left: Float = -1f, right: Float = 1f,
    bottom: Float = -1f, top: Float = 1f,
    near: Float = 1f, far: Float = -1f
) = frustumTo(left, right, bottom, top, near, far, this)
