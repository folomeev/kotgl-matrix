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

/** Multiplied values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec2.times(b: Vec2, out: FloatMapping2<T>) = mapReduce(b, Float::times, out)

/** Multiplied values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec3.times(b: Vec3, out: FloatMapping3<T>) = mapReduce(b, Float::times, out)

/** Multiplied values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec4.times(b: Vec4, out: FloatMapping4<T>) = mapReduce(b, Float::times, out)

/** Multiplied values of respective components of [this] and [k] reduced by [out]. */
private inline fun <T> Vec2.times(k: Float, out: FloatMapping2<T>) = mapReduce(k::times, out)

/** Multiplied values of respective components of [this] and [k] reduced by [out]. */
private inline fun <T> Vec3.times(k: Float, out: FloatMapping3<T>) = mapReduce(k::times, out)

/** Multiplied values of respective components of [this] and [k] reduced by [out]. */
private inline fun <T> Vec4.times(k: Float, out: FloatMapping4<T>) = mapReduce(k::times, out)

/** Create a new [MutableVec2] vector initialized with multiplied values of respective components of [this] and [k]. */
fun Vec2.times(k: Float) = times(k, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with multiplied values of respective components of [this] and [k]. */
fun Vec3.times(k: Float) = times(k, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with multiplied values of respective components of [this] and [k]. */
fun Vec4.times(k: Float) = times(k, ::mutableVec4)

/** Set multiplied values of respective components of [this] and [k] to [out]. */
fun Vec2.timesTo(k: Float, out: MutableVec2) = times(k, out::set)

/** Set multiplied values of respective components of [this] and [k] to [out]. */
fun Vec3.timesTo(k: Float, out: MutableVec3) = times(k, out::set)

/** Set multiplied values of respective components of [this] and [k] to [out]. */
fun Vec4.timesTo(k: Float, out: MutableVec4) = times(k, out::set)

/** Create a new [MutableVec2] vector initialized with multiplied values of respective components of [this] and [b]. */
fun Vec2.times(b: Vec2) = times(b, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with multiplied values of respective components of [this] and [b]. */
fun Vec3.times(b: Vec3) = times(b, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with multiplied values of respective components of [this] and [b]. */
fun Vec4.times(b: Vec4) = times(b, ::mutableVec4)

/** Set multiplied values of respective components of [this] and [b] to [out]. */
fun Vec2.timesTo(b: Vec2, out: MutableVec2) = times(b, out::set)

/** Set multiplied values of respective components of [this] and [b] to [out]. */
fun Vec3.timesTo(b: Vec3, out: MutableVec3) = times(b, out::set)

/** Set multiplied values of respective components of [this] and [b] to [out]. */
fun Vec4.timesTo(b: Vec4, out: MutableVec4) = times(b, out::set)

/** Set multiplied values of respective components of [this] and [b] to [this]. */
fun MutableVec2.timesSelf(b: Vec2) = timesTo(b, this)

/** Set multiplied values of respective components of [this] and [b] to [this]. */
fun MutableVec3.timesSelf(b: Vec3) = timesTo(b, this)

/** Set multiplied values of respective components of [this] and [b] to [this]. */
fun MutableVec4.timesSelf(b: Vec4) = timesTo(b, this)

/** Set multiplied values of respective components of [this] and [k] to [this]. */
fun MutableVec2.timesSelf(k: Float) = timesTo(k, this)

/** Set multiplied values of respective components of [this] and [k] to [this]. */
fun MutableVec3.timesSelf(k: Float) = timesTo(k, this)

/** Set multiplied values of respective components of [this] and [k] to [this]. */
fun MutableVec4.timesSelf(k: Float) = timesTo(k, this)
