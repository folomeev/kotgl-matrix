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

/** Add [this] to [b] and reduce the results by [reducer]. */
fun Mat2.plus(b: Mat2, reducer: FloatMapping4<MutableMat2>) = mapReduce(b, Float::plus, reducer)

/** Add [this] to [b] and reduce the results by [reducer]. */
fun Mat3.plus(b: Mat3, reducer: FloatMapping9<MutableMat3>) = mapReduce(b, Float::plus, reducer)

/** Add [this] to [b] and reduce the results by [reducer]. */
fun Mat4.plus(b: Mat4, reducer: FloatMapping16<MutableMat4>) = mapReduce(b, Float::plus, reducer)

/** Add [this] to [b] into new instance of [MutableMat2]. */
fun Mat2.plus(b: Mat2) = plus(b, ::mutableMat2)

/** Add [this] to [b] into new instance of [MutableMat3]. */
fun Mat3.plus(b: Mat3) = plus(b, ::mutableMat3)

/** Add [this] to [b] into new instance of [MutableMat4]. */
fun Mat4.plus(b: Mat4) = plus(b, ::mutableMat4)

/** Add [this] to [b] and set the results to [out]. */
fun Mat2.plusTo(b: Mat2, out: MutableMat2) = plus(b, out::set)

/** Add [this] to [b] and set the results to [out]. */
fun Mat3.plusTo(b: Mat3, out: MutableMat3) = plus(b, out::set)

/** Add [this] to [b] and set the results to [out]. */
fun Mat4.plusTo(b: Mat4, out: MutableMat4) = plus(b, out::set)

/** Add [this] to [b] and set the results to [this]. */
fun MutableMat2.plusSelf(b: Mat2) = plusTo(b, this)

/** Add [this] to [b] and set the results to [this]. */
fun MutableMat3.plusSelf(b: Mat3) = plusTo(b, this)

/** Add [this] to [b] and set the results to [this]. */
fun MutableMat4.plusSelf(b: Mat4) = plusTo(b, this)
