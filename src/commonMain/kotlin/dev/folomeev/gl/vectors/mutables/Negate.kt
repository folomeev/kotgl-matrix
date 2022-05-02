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

/** Negate each components of [this] reduce by [out]. */
private inline fun <T> Vec2.negate(out: FloatMapping2<T>) = mapReduce(Float::unaryMinus, out)

/** Negate each components of [this] reduce by [out]. */
private inline fun <T> Vec3.negate(out: FloatMapping3<T>) = mapReduce(Float::unaryMinus, out)

/** Negate each components of [this] reduce by [out]. */
private inline fun <T> Vec4.negate(out: FloatMapping4<T>) = mapReduce(Float::unaryMinus, out)

/** Create a new [MutableVec2] vector initialized with negated component values of [this]. */
fun Vec2.negate() = negate(::mutableVec2)

/** Create a new [MutableVec3] vector initialized with negated component values of [this]. */
fun Vec3.negate() = negate(::mutableVec3)

/** Create a new [MutableVec4] vector initialized with negated component values of [this]. */
fun Vec4.negate() = negate(::mutableVec4)

/** Negate component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec2.negateTo(out: MutableVec2) = negate(out::set)

/** Negate component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec3.negateTo(out: MutableVec3) = negate(out::set)

/** Negate component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec4.negateTo(out: MutableVec4) = negate(out::set)

/** Negate component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec2.negateSelf() = negateTo(this)

/** Negate component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec3.negateSelf() = negateTo(this)

/** Negate component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec4.negateSelf() = negateTo(this)