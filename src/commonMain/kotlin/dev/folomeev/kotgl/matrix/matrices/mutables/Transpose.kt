/** Set of matrix transposing methods. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.FloatMapping16
import dev.folomeev.kotgl.matrix.FloatMapping4
import dev.folomeev.kotgl.matrix.FloatMapping9
import dev.folomeev.kotgl.matrix.matrices.Mat2
import dev.folomeev.kotgl.matrix.matrices.Mat3
import dev.folomeev.kotgl.matrix.matrices.Mat4

/** Transpose [this] and call [reducer]. */
private inline fun Mat2.transpose(reducer: FloatMapping4<MutableMat2>): MutableMat2 = reducer(m00, m10, m01, m11)

/** Transpose [this] and call [reducer]. */
private inline fun Mat3.transpose(reducer: FloatMapping9<MutableMat3>): MutableMat3 = reducer(
    m00, m10, m20,
    m01, m11, m21,
    m02, m12, m22
)

/** Transpose [this] and call [reducer]. */
private inline fun Mat4.transpose(reducer: FloatMapping16<MutableMat4>): MutableMat4 = reducer(
    m00, m10, m20, m30,
    m01, m11, m21, m31,
    m02, m12, m22, m32,
    m03, m13, m23, m33
)

/** Transpose [this] into new instance of [MutableMat2]. */
fun Mat2.transpose(): MutableMat2 = transpose(::mutableMat2)

/** Transpose [this] into new instance of [MutableMat4]. */
fun Mat3.transpose(): MutableMat3 = transpose(::mutableMat3)

/** Transpose [this] into new instance of [MutableMat4]. */
fun Mat4.transpose(): MutableMat4 = transpose(::mutableMat4)

/** Transpose [this] and set values to [out].
 * @return [out]. */
fun Mat2.transposeTo(out: MutableMat2): MutableMat2 = transpose(out::set)

/** Transpose [this] and set values to [out].
 * @return [out]. */
fun Mat3.transposeTo(out: MutableMat3): MutableMat3 = transpose(out::set)

/** Transpose [this] and set values to [out].
 * @return [out]. */
fun Mat4.transposeTo(out: MutableMat4): MutableMat4 = transpose(out::set)

/** Transpose [this] in-place.
 * @return [this]. */
fun MutableMat2.transposeSelf(): MutableMat2 = transposeTo(this)

/** Transpose [this] in-place.
 * @return [this]. */
fun MutableMat3.transposeSelf(): MutableMat3 = transposeTo(this)

/** Transpose [this] in-place.
 * @return [this]. */
fun MutableMat4.transposeSelf(): MutableMat4 = transposeTo(this)
