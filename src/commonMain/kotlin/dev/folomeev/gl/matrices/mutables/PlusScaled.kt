/** Set of matrix transposing methods. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.FloatMapping16
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.FloatMapping9
import dev.folomeev.gl.matrices.Mat2
import dev.folomeev.gl.matrices.Mat3
import dev.folomeev.gl.matrices.Mat4
import dev.folomeev.gl.matrices.mapReduce

/** @return a sum of [a] and [this] multiplied to [b]. */
private fun Float.plusScaled(a: Float, b: Float) = a + this * b

/** Scale [b] by [k] and add to [this], reduce results byo [reducer]. */
fun Mat2.plusScaled(k: Float, b: Mat2, reducer: FloatMapping4<MutableMat2>) = mapReduce(b, k::plusScaled, reducer)

/** Scale [b] by [k] and add to [this], reduce results byo [reducer]. */
fun Mat3.plusScaled(k: Float, b: Mat3, reducer: FloatMapping9<MutableMat3>) = mapReduce(b, k::plusScaled, reducer)

/** Scale [b] by [k] and add to [this], reduce results byo [reducer]. */
fun Mat4.plusScaled(k: Float, b: Mat4, reducer: FloatMapping16<MutableMat4>) = mapReduce(b, k::plusScaled, reducer)

/** Scale [b] by [k] and add to [this], set results to new instance of [MutableMat2]. */
fun Mat2.plusScaled(k: Float, b: Mat2) = plusScaled(k, b, ::mutableMat2)

/** Scale [b] by [k] and add to [this], set results to new instance of [MutableMat3]. */
fun Mat3.plusScaled(k: Float, b: Mat3) = plusScaled(k, b, ::mutableMat3)

/** Scale [b] by [k] and add to [this], set results to new instance of [MutableMat4]. */
fun Mat4.plusScaled(k: Float, b: Mat4) = plusScaled(k, b, ::mutableMat4)

/** Scale [b] by [k] and add to [this], set results to [out]. */
fun Mat2.plusScaledTo(k: Float, b: Mat2, out: MutableMat2) = plusScaled(k, b, out::set)

/** Scale [b] by [k] and add to [this], set results to [out]. */
fun Mat3.plusScaledTo(k: Float, b: Mat3, out: MutableMat3) = plusScaled(k, b, out::set)

/** Scale [b] by [k] and add to [this], set results to [out]. */
fun Mat4.plusScaledTo(k: Float, b: Mat4, out: MutableMat4) = plusScaled(k, b, out::set)

/** Scale [b] by [k] and add to [this], set results to [this]. */
fun MutableMat2.plusScaledSelf(k: Float, b: Mat2) = plusScaledTo(k, b, this)

/** Scale [b] by [k] and add to [this], set results to [this]. */
fun MutableMat3.plusScaledSelf(k: Float, b: Mat3) = plusScaledTo(k, b, this)

/** Scale [b] by [k] and add to [this], set results to [this]. */
fun MutableMat4.plusScaledSelf(k: Float, b: Mat4) = plusScaledTo(k, b, this)
