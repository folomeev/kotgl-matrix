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
import kotlin.math.floor as mathFloor

/** Map components of [this] with [mathFloor] and reduce by [out]. */
private inline fun <T> Vec2.floor(out: FloatMapping2<T>) = mapReduce(::mathFloor, out)

/** Map components of [this] with [mathFloor] and reduce by [out]. */
private inline fun <T> Vec3.floor(out: FloatMapping3<T>) = mapReduce(::mathFloor, out)

/** Map components of [this] with [mathFloor] and reduce by [out]. */
private inline fun <T> Vec4.floor(out: FloatMapping4<T>) = mapReduce(::mathFloor, out)

/** Create a new [MutableVec2] vector initialized with floor component values of [this]. */
fun Vec2.floor() = floor(::mutableVec2)

/** Create a new [MutableVec3] vector initialized with floor component values of [this]. */
fun Vec3.floor() = floor(::mutableVec3)

/** Create a new [MutableVec4] vector initialized with floor component values of [this]. */
fun Vec4.floor() = floor(::mutableVec4)

/** Floor component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec2.floorTo(out: MutableVec2) = floor(out::set)

/** Floor component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec3.floorTo(out: MutableVec3) = floor(out::set)

/** Floor component values of [this] and set them to [out].
 * @return Value of [out]. */
fun Vec4.floorTo(out: MutableVec4) = floor(out::set)

/** Ceil component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec2.floorSelf() = floorTo(this)

/** Ceil component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec3.floorSelf() = floorTo(this)

/** Ceil component values of [this] and set them back to [this].
 * @return [this]. */
fun MutableVec4.floorSelf() = floorTo(this)
