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

/** Subtract [b] from [this] and reduce the results by [reducer]. */
fun Mat2.minus(b: Mat2, reducer: FloatMapping4<MutableMat2>) = mapReduce(b, Float::minus, reducer)

/** Subtract [b] from [this] and reduce the results by [reducer]. */
fun Mat3.minus(b: Mat3, reducer: FloatMapping9<MutableMat3>) = mapReduce(b, Float::minus, reducer)

/** Subtract [b] from [this] and reduce the results by [reducer]. */
fun Mat4.minus(b: Mat4, reducer: FloatMapping16<MutableMat4>) = mapReduce(b, Float::minus, reducer)

/** Subtract [b] from [this] into new instance of [MutableMat2]. */
fun Mat2.minus(b: Mat2) = minus(b, ::mutableMat2)

/** Subtract [b] from [this] into new instance of [MutableMat3]. */
fun Mat3.minus(b: Mat3) = minus(b, ::mutableMat3)

/** Subtract [b] from [this] into new instance of [MutableMat4]. */
fun Mat4.minus(b: Mat4) = minus(b, ::mutableMat4)

/** Subtract [b] from [this] and set the results to [out]. */
fun Mat2.minusTo(b: Mat2, out: MutableMat2) = minus(b, out::set)

/** Subtract [b] from [this] and set the results to [out]. */
fun Mat3.minusTo(b: Mat3, out: MutableMat3) = minus(b, out::set)

/** Subtract [b] from [this] and set the results to [out]. */
fun Mat4.minusTo(b: Mat4, out: MutableMat4) = minus(b, out::set)

/** Subtract [b] from [this] and set the results to [this]. */
fun MutableMat2.minusSelf(b: Mat2) = minusTo(b, this)

/** Subtract [b] from [this] and set the results to [this]. */
fun MutableMat3.minusSelf(b: Mat3) = minusTo(b, this)

/** Subtract [b] from [this] and set the results to [this]. */
fun MutableMat4.minusSelf(b: Mat4) = minusTo(b, this)
