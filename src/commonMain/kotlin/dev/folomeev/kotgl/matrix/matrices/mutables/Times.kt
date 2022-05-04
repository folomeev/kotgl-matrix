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
import dev.folomeev.kotgl.matrix.matrices.mapReduce

/** Multiply [this] and [b], reduce results by [reducer]. */
fun Mat2.times(b: Mat2, reducer: FloatMapping4<MutableMat2>) = reducer(
    m00 * b.m00 + m01 * b.m10, m00 * b.m01 + m01 * b.m11,
    m10 * b.m00 + m11 * b.m10, m10 * b.m01 + m11 * b.m11
)

/** Multiply [this] and [b], reduce results by [reducer]. */
fun Mat3.times(b: Mat3, reducer: FloatMapping9<MutableMat3>) = reducer(
    m00 * b.m00 + m01 * b.m10 + m02 * b.m20,
    m00 * b.m01 + m01 * b.m11 + m02 * b.m21,
    m00 * b.m02 + m01 * b.m12 + m02 * b.m22,
    m10 * b.m00 + m11 * b.m10 + m12 * b.m20,
    m10 * b.m01 + m11 * b.m11 + m12 * b.m21,
    m10 * b.m02 + m11 * b.m12 + m12 * b.m22,
    m20 * b.m00 + m21 * b.m10 + m22 * b.m20,
    m20 * b.m01 + m21 * b.m11 + m22 * b.m21,
    m20 * b.m02 + m21 * b.m12 + m22 * b.m22
)

/** Multiply [this] and [b], reduce results by [reducer]. */
fun Mat4.times(b: Mat4, reducer: FloatMapping16<MutableMat4>): MutableMat4 = reducer(
    m00 * b.m00 + m01 * b.m10 + m02 * b.m20 + m03 * b.m30,
    m00 * b.m01 + m01 * b.m11 + m02 * b.m21 + m03 * b.m31,
    m00 * b.m02 + m01 * b.m12 + m02 * b.m22 + m03 * b.m32,
    m00 * b.m03 + m01 * b.m13 + m02 * b.m23 + m03 * b.m33,

    m10 * b.m00 + m11 * b.m10 + m12 * b.m20 + m13 * b.m30,
    m10 * b.m01 + m11 * b.m11 + m12 * b.m21 + m13 * b.m31,
    m10 * b.m02 + m11 * b.m12 + m12 * b.m22 + m13 * b.m32,
    m10 * b.m03 + m11 * b.m13 + m12 * b.m23 + m13 * b.m33,

    m20 * b.m00 + m21 * b.m10 + m22 * b.m20 + m23 * b.m30,
    m20 * b.m01 + m21 * b.m11 + m22 * b.m21 + m23 * b.m31,
    m20 * b.m02 + m21 * b.m12 + m22 * b.m22 + m23 * b.m32,
    m20 * b.m03 + m21 * b.m13 + m22 * b.m23 + m23 * b.m33,

    m30 * b.m00 + m31 * b.m10 + m32 * b.m20 + m33 * b.m30,
    m30 * b.m01 + m31 * b.m11 + m32 * b.m21 + m33 * b.m31,
    m30 * b.m02 + m31 * b.m12 + m32 * b.m22 + m33 * b.m32,
    m30 * b.m03 + m31 * b.m13 + m32 * b.m23 + m33 * b.m33
)

/** Multiply each component of [this] to [k], reduce results by [reducer]. */
fun Mat2.times(k: Float, reducer: FloatMapping4<MutableMat2>): MutableMat2 = mapReduce(k::times, reducer)

/** Multiply each component of [this] to [k], reduce results by [reducer]. */
fun Mat3.times(k: Float, reducer: FloatMapping9<MutableMat3>): MutableMat3 = mapReduce(k::times, reducer)

/** Multiply each component of [this] to [k], reduce results by [reducer]. */
fun Mat4.times(k: Float, reducer: FloatMapping16<MutableMat4>): MutableMat4 = mapReduce(k::times, reducer)

/** Multiply [this] and [b], set results to new instance of [MutableMat2]. */
fun Mat2.times(b: Mat2) = times(b, ::mutableMat2)

/** Multiply [this] and [b], set results to new instance of [MutableMat3]. */
fun Mat3.times(b: Mat3) = times(b, ::mutableMat3)

/** Multiply [this] and [b], set results to new instance of [MutableMat4]. */
fun Mat4.times(b: Mat4) = times(b, ::mutableMat4)

/** Multiply each component of [this] to [k], set results to new instance of [MutableMat2]. */
fun Mat2.times(k: Float) = times(k, ::mutableMat2)

/** Multiply each component of [this] to [k], set results to new instance of [MutableMat4]. */
fun Mat3.times(k: Float) = times(k, ::mutableMat3)

/** Multiply each component of [this] to [k], set results to new instance of [MutableMat4]. */
fun Mat4.times(k: Float) = times(k, ::mutableMat4)

/** Multiply [this] and [b], set results to [out]. */
fun Mat2.timesTo(b: Mat2, out: MutableMat2) = times(b, out::set)

/** Multiply [this] and [b], set results to [out]. */
fun Mat3.timesTo(b: Mat3, out: MutableMat3) = times(b, out::set)

/** Multiply [this] and [b], set results to [out]. */
fun Mat4.timesTo(b: Mat4, out: MutableMat4) = times(b, out::set)

/** Multiply each component of [this] to [k], set results to [out]. */
fun Mat2.timesTo(k: Float, out: MutableMat2) = times(k, out::set)

/** Multiply each component of [this] to [k], set results to [out]. */
fun Mat3.timesTo(k: Float, out: MutableMat3) = times(k, out::set)

/** Multiply each component of [this] to [k], set results to [out]. */
fun Mat4.timesTo(k: Float, out: MutableMat4) = times(k, out::set)

/** Multiply [this] and [b], set results to [this]. */
fun MutableMat2.timesSelf(b: Mat2) = timesTo(b, this)

/** Multiply [this] and [b], set results to [this]. */
fun MutableMat3.timesSelf(b: Mat3) = timesTo(b, this)

/** Multiply [this] and [b], set results to [this]. */
fun MutableMat4.timesSelf(b: Mat4) = timesTo(b, this)

/** Multiply each component of [this] to [k], set results to [this]. */
fun MutableMat2.timesSelf(k: Float) = timesTo(k, this)

/** Multiply each component of [this] to [k], set results to [this]. */
fun MutableMat3.timesSelf(k: Float) = timesTo(k, this)

/** Multiply each component of [this] to [k], set results to [this]. */
fun MutableMat4.timesSelf(k: Float) = timesTo(k, this)
