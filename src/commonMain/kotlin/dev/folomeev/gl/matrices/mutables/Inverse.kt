/** Set of matrix inversion methods. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.FloatMapping16
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.FloatMapping9
import dev.folomeev.gl.matrices.Mat2
import dev.folomeev.gl.matrices.Mat3
import dev.folomeev.gl.matrices.Mat4

/** Inverse [this] and reduce the result by [reducer]. */
private fun <T> Mat2.inverse(reducer: FloatMapping4<T>) =
    adjoint { a00, a01,
              a10, a11 ->
        val det = m00 * a00 + m01 * a10
        if (det == 0f) {
            throw IllegalArgumentException("Matrix determinant is zero:\n$this")
        }
        reducer(a00 / det, a01 / det, a10 / det, a11 / det)
    }

/** Inverse [this] and reduce the result by [reducer]. */
private fun <T> Mat3.inverse(reducer: FloatMapping9<T>) =
    adjoint { a00, a01, a02,
              a10, a11, a12,
              a20, a21, a22 ->
        val det = m00 * a00 + m01 * a10 + m02 * a20
        if (det == 0f) {
            throw IllegalArgumentException("Matrix determinant is zero:\n$this")
        }
        reducer(
            a00 / det, a01 / det, a02 / det,
            a10 / det, a11 / det, a12 / det,
            a20 / det, a21 / det, a22 / det
        )
    }

/** Inverse [this] and reduce the result by [reducer]. */
private fun <T> Mat4.inverse(reducer: FloatMapping16<T>): T {
    return adjoint { a00, a01, a02, a03,
                     a10, a11, a12, a13,
                     a20, a21, a22, a23,
                     a30, a31, a32, a33 ->
        val det = m00 * a00 + m01 * a10 + m02 * a20 + m03 * a30
        if (det == 0f) {
            throw IllegalArgumentException("Matrix determinant is zero:\n$this")
        }
        reducer(
            a00 / det, a01 / det, a02 / det, a03 / det,
            a10 / det, a11 / det, a12 / det, a13 / det,
            a20 / det, a21 / det, a22 / det, a23 / det,
            a30 / det, a31 / det, a32 / det, a33 / det
        )
    }
}

/** Inverse [this] and set the result to a new instance of [MutableMat2]. */
fun Mat2.inverse() = inverse(::mutableMat2)

/** Inverse [this] and set the result to a new instance of [MutableMat3]. */
fun Mat3.inverse() = inverse(::mutableMat3)

/** Inverse [this] and set the result to a new instance of [MutableMat4]. */
fun Mat4.inverse() = inverse(::mutableMat4)

/** Inverse [this] and set the result to [out].
 * @return [out]. */
fun Mat2.inverseTo(out: MutableMat2) = inverse(out::set)

/** Inverse [this] and set the result to [out].
 * @return [out]. */
fun Mat3.inverseTo(out: MutableMat3) = inverse(out::set)

/** Inverse [this] and set the result to [out].
 * @return [out]. */
fun Mat4.inverseTo(out: MutableMat4) = inverse(out::set)

/** Inverse [this] and set the result to [this].
 * @return [this]. */
fun MutableMat2.inverseSelf() = inverseTo(this)

/** Inverse [this] and set the result to [this].
 * @return [this]. */
fun MutableMat3.inverseSelf() = inverseTo(this)

/** Inverse [this] and set the result to [this].
 * @return [this]. */
fun MutableMat4.inverseSelf() = inverseTo(this)