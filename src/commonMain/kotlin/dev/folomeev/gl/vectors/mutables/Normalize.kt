@file:kotlin.jvm.JvmName("MutableVectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.FloatMapping2
import dev.folomeev.gl.FloatMapping3
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.epsEquals
import dev.folomeev.gl.vectors.length
import dev.folomeev.gl.vectors.reduce
import dev.folomeev.gl.vectors.vecZero
import dev.folomeev.gl.vectors.Vec2
import dev.folomeev.gl.vectors.Vec3
import dev.folomeev.gl.vectors.Vec4
import dev.folomeev.gl.vectors.mapReduce

private inline fun <T> Vec2.normalize(out: FloatMapping2<T>) =
    length().let { length -> if (length epsEquals 0f) vecZero().reduce(out) else mapReduce((1f / length)::times, out) }

private inline fun <T> Vec3.normalize(out: FloatMapping3<T>) =
    length().let { length -> if (length epsEquals 0f) vecZero().reduce(out) else mapReduce((1f / length)::times, out) }

private inline fun <T> Vec4.normalize(out: FloatMapping4<T>) =
    length().let { length -> if (length epsEquals 0f) vecZero().reduce(out) else mapReduce((1f / length)::times, out) }

/** Create new [MutableVec2] vector of length 1, collinear to [this]. */
fun Vec2.normalize() = normalize(::mutableVec2)
/** Create new [MutableVec3] vector of length 1, collinear to [this]. */
fun Vec3.normalize() = normalize(::mutableVec3)
/** Create new [MutableVec4] vector of length 1, collinear to [this]. */
fun Vec4.normalize() = normalize(::mutableVec4)

/** Calculate vector of length 1, collinear to [this] and set it to [out]. */
fun Vec2.normalizeTo(out: MutableVec2) = normalize(out::set)
/** Calculate vector of length 1, collinear to [this] and set it to [out]. */
fun Vec3.normalizeTo(out: MutableVec3) = normalize(out::set)
/** Calculate vector of length 1, collinear to [this] and set it to [out]. */
fun Vec4.normalizeTo(out: MutableVec4) = normalize(out::set)

/** Calculate vector of length 1, collinear to [this] and set it back to [this]. */
fun MutableVec2.normalizeSelf() = normalizeTo(this)
/** Calculate vector of length 1, collinear to [this] and set it back to [this]. */
fun MutableVec3.normalizeSelf() = normalizeTo(this)
/** Calculate vector of length 1, collinear to [this] and set it back to [this]. */
fun MutableVec4.normalizeSelf() = normalizeTo(this)
