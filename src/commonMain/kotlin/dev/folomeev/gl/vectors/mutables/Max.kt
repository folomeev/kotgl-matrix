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
import kotlin.math.max as mathMax

/** Max values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec2.max(b: Vec2, out: FloatMapping2<T>) = mapReduce(b, ::mathMax, out)

/** Max values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec3.max(b: Vec3, out: FloatMapping3<T>) = mapReduce(b, ::mathMax, out)

/** Max values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec4.max(b: Vec4, out: FloatMapping4<T>) = mapReduce(b, ::mathMax, out)

/** Create a new [MutableVec2] vector initialized with max values of respective components of [this] and [b]. */
fun Vec2.max(b: Vec2) = max(b, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with max values of respective components of [this] and [b]. */
fun Vec3.max(b: Vec3) = max(b, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with max values of respective components of [this] and [b]. */
fun Vec4.max(b: Vec4) = max(b, ::mutableVec4)

/** Set max values of respective components of [this] and [b] to [out]. */
fun Vec2.maxTo(b: Vec2, out: MutableVec2) = max(b, out::set)

/** Set max values of respective components of [this] and [b] to [out]. */
fun Vec3.maxTo(b: Vec3, out: MutableVec3) = max(b, out::set)

/** Set max values of respective components of [this] and [b] to [out]. */
fun Vec4.maxTo(b: Vec4, out: MutableVec4) = max(b, out::set)

/** Set max values of respective components of [this] and [b] to [this]. */
fun MutableVec2.maxSelf(b: Vec2) = maxTo(b, this)

/** Set max values of respective components of [this] and [b] to [this]. */
fun MutableVec3.maxSelf(b: Vec3) = maxTo(b, this)

/** Set max values of respective components of [this] and [b] to [this]. */
fun MutableVec4.maxSelf(b: Vec4) = maxTo(b, this)
