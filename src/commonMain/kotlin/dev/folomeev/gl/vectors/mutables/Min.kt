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
import kotlin.math.min as mathMin

/** Min values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec2.min(b: Vec2, out: FloatMapping2<T>) = mapReduce(b, ::mathMin, out)

/** Min values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec3.min(b: Vec3, out: FloatMapping3<T>) = mapReduce(b, ::mathMin, out)

/** Min values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec4.min(b: Vec4, out: FloatMapping4<T>) = mapReduce(b, ::mathMin, out)

/** Create a new [MutableVec2] vector initialized with min values of respective components of [this] and [b]. */
fun Vec2.min(b: Vec2) = min(b, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with min values of respective components of [this] and [b]. */
fun Vec3.min(b: Vec3) = min(b, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with min values of respective components of [this] and [b]. */
fun Vec4.min(b: Vec4) = min(b, ::mutableVec4)

/** Set min values of respective components of [this] and [b] to [out]. */
fun Vec2.minTo(b: Vec2, out: MutableVec2) = min(b, out::set)

/** Set min values of respective components of [this] and [b] to [out]. */
fun Vec3.minTo(b: Vec3, out: MutableVec3) = min(b, out::set)

/** Set min values of respective components of [this] and [b] to [out]. */
fun Vec4.minTo(b: Vec4, out: MutableVec4) = min(b, out::set)

/** Set min values of respective components of [this] and [b] to [this]. */
fun MutableVec2.minSelf(b: Vec2) = minTo(b, this)

/** Set min values of respective components of [this] and [b] to [this]. */
fun MutableVec3.minSelf(b: Vec3) = minTo(b, this)

/** Set min values of respective components of [this] and [b] to [this]. */
fun MutableVec4.minSelf(b: Vec4) = minTo(b, this)
