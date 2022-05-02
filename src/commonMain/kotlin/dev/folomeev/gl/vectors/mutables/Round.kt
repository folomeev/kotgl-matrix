@file:kotlin.jvm.JvmName("MutableVectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.FloatMapping2
import dev.folomeev.gl.FloatMapping3
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.vectors.Vec2
import dev.folomeev.gl.vectors.Vec3
import dev.folomeev.gl.vectors.Vec4
import dev.folomeev.gl.vectors.mapReduce
import kotlin.math.round as mathRound

/** Map components of [this] with [mathRound] and reduce by [out]. */
private inline fun <T> Vec2.round(out: FloatMapping2<T>) = mapReduce(::mathRound, out)

/** Map components of [this] with [mathRound] and reduce by [out]. */
private inline fun <T> Vec3.round(out: FloatMapping3<T>) = mapReduce(::mathRound, out)

/** Map components of [this] with [mathRound] and reduce by [out]. */
private inline fun <T> Vec4.round(out: FloatMapping4<T>) = mapReduce(::mathRound, out)

/** Create a new [MutableVec2] vector initialized with round component values of [this]. */
fun Vec2.round() = round(::mutableVec2)

/** Create a new [MutableVec3] vector initialized with round component values of [this]. */
fun Vec3.round() = round(::mutableVec3)

/** Create a new [MutableVec4] vector initialized with round component values of [this]. */
fun Vec4.round() = round(::mutableVec4)

/** Round component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec2.roundTo(out: MutableVec2) = round(out::set)

/** Round component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec3.roundTo(out: MutableVec3) = round(out::set)

/** Round component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec4.roundTo(out: MutableVec4) = round(out::set)

/** Round component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec2.roundSelf() = roundTo(this)

/** Round component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec3.roundSelf() = roundTo(this)

/** Round component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec4.roundSelf() = roundTo(this)
