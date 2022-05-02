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

/** Subtracted values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec2.minus(b: Vec2, out: FloatMapping2<T>) = mapReduce(b, Float::minus, out)

/** Subtracted values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec3.minus(b: Vec3, out: FloatMapping3<T>) = mapReduce(b, Float::minus, out)

/** Subtracted values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec4.minus(b: Vec4, out: FloatMapping4<T>) = mapReduce(b, Float::minus, out)

/** Create a new [MutableVec2] vector initialized with subtracted values of respective components of [this] and [b]. */
fun Vec2.minus(b: Vec2) = minus(b, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with subtracted values of respective components of [this] and [b]. */
fun Vec3.minus(b: Vec3) = minus(b, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with subtracted values of respective components of [this] and [b]. */
fun Vec4.minus(b: Vec4) = minus(b, ::mutableVec4)

/** Set subtracted values of respective components of [this] and [b] to [out]. */
fun Vec2.minusTo(b: Vec2, out: MutableVec2) = minus(b, out::set)

/** Set subtracted values of respective components of [this] and [b] to [out]. */
fun Vec3.minusTo(b: Vec3, out: MutableVec3) = minus(b, out::set)

/** Set subtracted values of respective components of [this] and [b] to [out]. */
fun Vec4.minusTo(b: Vec4, out: MutableVec4) = minus(b, out::set)

/** Set subtracted values of respective components of [this] and [b] to [this]. */
fun MutableVec2.minusSelf(b: Vec2) = minusTo(b, this)

/** Set subtracted values of respective components of [this] and [b] to [this]. */
fun MutableVec3.minusSelf(b: Vec3) = minusTo(b, this)

/** Set subtracted values of respective components of [this] and [b] to [this]. */
fun MutableVec4.minusSelf(b: Vec4) = minusTo(b, this)