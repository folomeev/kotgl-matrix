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

/** Divided values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec2.div(b: Vec2, out: FloatMapping2<T>) = mapReduce(b, Float::div, out)

/** Divided values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec3.div(b: Vec3, out: FloatMapping3<T>) = mapReduce(b, Float::div, out)

/** Divided values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec4.div(b: Vec4, out: FloatMapping4<T>) = mapReduce(b, Float::div, out)

/** Create a new [MutableVec2] vector initialized with divided values of respective components of [this] and [b]. */
fun Vec2.div(b: Vec2) = div(b, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with divided values of respective components of [this] and [b]. */
fun Vec3.div(b: Vec3) = div(b, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with divided values of respective components of [this] and [b]. */
fun Vec4.div(b: Vec4) = div(b, ::mutableVec4)

/** Set divided values of respective components of [this] and [b] to [out]. */
fun Vec2.divTo(b: Vec2, out: MutableVec2) = div(b, out::set)

/** Set divided values of respective components of [this] and [b] to [out]. */
fun Vec3.divTo(b: Vec3, out: MutableVec3) = div(b, out::set)

/** Set divided values of respective components of [this] and [b] to [out]. */
fun Vec4.divTo(b: Vec4, out: MutableVec4) = div(b, out::set)

/** Set divided values of respective components of [this] and [b] to [this]. */
fun MutableVec2.divSelf(b: Vec2) = divTo(b, this)

/** Set divided values of respective components of [this] and [b] to [this]. */
fun MutableVec3.divSelf(b: Vec3) = divTo(b, this)

/** Set divided values of respective components of [this] and [b] to [this]. */
fun MutableVec4.divSelf(b: Vec4) = divTo(b, this)
