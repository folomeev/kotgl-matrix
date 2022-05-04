@file:kotlin.jvm.JvmName("MutableVectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.FloatMapping2
import dev.folomeev.kotgl.matrix.FloatMapping3
import dev.folomeev.kotgl.matrix.FloatMapping4
import dev.folomeev.kotgl.matrix.vectors.Vec2
import dev.folomeev.kotgl.matrix.vectors.Vec3
import dev.folomeev.kotgl.matrix.vectors.Vec4
import dev.folomeev.kotgl.matrix.vectors.mapReduce
import kotlin.math.ceil as mathCeil

/** Map components of [this] with [mathCeil] and reduce by [out]. */
private inline fun <T> Vec2.ceil(out: FloatMapping2<T>) = mapReduce(::mathCeil, out)

/** Map components of [this] with [mathCeil] and reduce by [out]. */
private inline fun <T> Vec3.ceil(out: FloatMapping3<T>) = mapReduce(::mathCeil, out)

/** Map components of [this] with [mathCeil] and reduce by [out]. */
private inline fun <T> Vec4.ceil(out: FloatMapping4<T>) = mapReduce(::mathCeil, out)

/** Create new [MutableVec2] vector initialized with ceil component values of [this]. */
fun Vec2.ceil() = ceil(::mutableVec2)

/** Create new [MutableVec3] vector initialized with ceil component values of [this]. */
fun Vec3.ceil() = ceil(::mutableVec3)

/** Create new [MutableVec4] vector initialized with ceil component values of [this]. */
fun Vec4.ceil() = ceil(::mutableVec4)

/** Ceil component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec2.ceilTo(out: MutableVec2) = ceil(out::set)

/** Ceil component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec3.ceilTo(out: MutableVec3) = ceil(out::set)

/** Ceil component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec4.ceilTo(out: MutableVec4) = ceil(out::set)

/** Ceil component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec2.ceilSelf() = ceilTo(this)

/** Ceil component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec3.ceilSelf() = ceilTo(this)

/** Ceil component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec4.ceilSelf() = ceilTo(this)
