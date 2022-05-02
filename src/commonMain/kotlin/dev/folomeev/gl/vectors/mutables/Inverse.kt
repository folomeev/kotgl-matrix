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

/** Inverse each components of [this] reduce by [out]. */
private inline fun <T> Vec2.inverse(out: FloatMapping2<T>) = mapReduce(1::div, out)

/** Inverse each components of [this] reduce by [out]. */
private inline fun <T> Vec3.inverse(out: FloatMapping3<T>) = mapReduce(1::div, out)

/** Inverse each components of [this] reduce by [out]. */
private inline fun <T> Vec4.inverse(out: FloatMapping4<T>) = mapReduce(1::div, out)

/** Create a new [MutableVec2] vector initialized with inversed component values of [this]. */
fun Vec2.inverse() = inverse(::mutableVec2)

/** Create a new [MutableVec3] vector initialized with inversed component values of [this]. */
fun Vec3.inverse() = inverse(::mutableVec3)

/** Create a new [MutableVec4] vector initialized with inversed component values of [this]. */
fun Vec4.inverse() = inverse(::mutableVec4)

/** Inverse component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec2.inverseTo(out: MutableVec2) = inverse(out::set)

/** Inverse component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec3.inverseTo(out: MutableVec3) = inverse(out::set)

/** Inverse component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec4.inverseTo(out: MutableVec4) = inverse(out::set)

/** Inverse component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec2.inverseSelf() = inverseTo(this)

/** Inverse component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec3.inverseSelf() = inverseTo(this)

/** Inverse component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec4.inverseSelf() = inverseTo(this)