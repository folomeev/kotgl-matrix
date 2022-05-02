/** Set of matrix adjoint calculating methods. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.FloatMapping16
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.FloatMapping9
import dev.folomeev.gl.matrices.Mat2
import dev.folomeev.gl.matrices.Mat3
import dev.folomeev.gl.matrices.Mat4

/** Adjoint [this] and reduce the result by [reducer]. */
internal fun <T> Mat2.adjoint(reducer: FloatMapping4<T>) =
    reducer(m11, -m01, -m10, m00)

/** Adjoint [this] and reduce the result by [reducer]. */
internal fun <T> Mat3.adjoint(reducer: FloatMapping9<T>): T {
    return reducer(
        m22 * m11 - m12 * m21,
        (-m22 * m01 + m02 * m21),
        (m12 * m01 - m02 * m11),
        -m22 * m10 + m12 * m20,
        (m22 * m00 - m02 * m20),
        (-m12 * m00 + m02 * m10),
        m21 * m10 - m11 * m20,
        (-m21 * m00 + m01 * m20),
        (m11 * m00 - m01 * m10)
    )
}

/** Adjoint [this] and reduce the result by [reducer]. */
internal fun <T> Mat4.adjoint(reducer: FloatMapping16<T>): T {
    val a00 = m00 * m11 - m01 * m10
    val a01 = m00 * m12 - m02 * m10
    val a02 = m00 * m13 - m03 * m10
    val a03 = m01 * m12 - m02 * m11
    val a04 = m01 * m13 - m03 * m11
    val a05 = m02 * m13 - m03 * m12
    val a06 = m20 * m31 - m21 * m30
    val a07 = m20 * m32 - m22 * m30
    val a08 = m20 * m33 - m23 * m30
    val a09 = m21 * m32 - m22 * m31
    val a10 = m21 * m33 - m23 * m31
    val a11 = m22 * m33 - m23 * m32

    // Calculate the determinant
    return reducer(
        (m11 * a11 - m12 * a10 + m13 * a09),
        (m02 * a10 - m01 * a11 - m03 * a09),
        (m31 * a05 - m32 * a04 + m33 * a03),
        (m22 * a04 - m21 * a05 - m23 * a03),
        (m12 * a08 - m10 * a11 - m13 * a07),
        (m00 * a11 - m02 * a08 + m03 * a07),
        (m32 * a02 - m30 * a05 - m33 * a01),
        (m20 * a05 - m22 * a02 + m23 * a01),
        (m10 * a10 - m11 * a08 + m13 * a06),
        (m01 * a08 - m00 * a10 - m03 * a06),
        (m30 * a04 - m31 * a02 + m33 * a00),
        (m21 * a02 - m20 * a04 - m23 * a00),
        (m11 * a07 - m10 * a09 - m12 * a06),
        (m00 * a09 - m01 * a07 + m02 * a06),
        (m31 * a01 - m30 * a03 - m32 * a00),
        (m20 * a03 - m21 * a01 + m22 * a00)
    )
}

/** Adjoint [this] and set the result to a new instance of [MutableMat2]. */
fun Mat2.adjoint() = adjoint(::mutableMat2)

/** Adjoint [this] and set the result to a new instance of [MutableMat3]. */
fun Mat3.adjoint() = adjoint(::mutableMat3)

/** Adjoint [this] and set the result to a new instance of [MutableMat4]. */
fun Mat4.adjoint() = adjoint(::mutableMat4)

/** Adjoint [this] and set the result to [out].
 * @return [out]. */
fun Mat2.adjointTo(out: MutableMat2) = adjoint(out::set)

/** Adjoint [this] and set the result to [out].
 * @return [out]. */
fun Mat3.adjointTo(out: MutableMat3) = adjoint(out::set)

/** Adjoint [this] and set the result to [out].
 * @return [out]. */
fun Mat4.adjointTo(out: MutableMat4) = adjoint(out::set)

/** Adjoint [this] and set the result to [this].
 * @return [this]. */
fun MutableMat2.adjointSelf() = adjointTo(this)

/** Adjoint [this] and set the result to [this].
 * @return [this]. */
fun MutableMat3.adjointSelf() = adjointTo(this)

/** Adjoint [this] and set the result to [this].
 * @return [this]. */
fun MutableMat4.adjointSelf() = adjointTo(this)