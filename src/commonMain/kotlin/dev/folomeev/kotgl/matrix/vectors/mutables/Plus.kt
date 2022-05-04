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

/** Summed values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec2.plus(b: Vec2, out: FloatMapping2<T>) = mapReduce(b, Float::plus, out)

/** Summed values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec3.plus(b: Vec3, out: FloatMapping3<T>) = mapReduce(b, Float::plus, out)

/** Summed values of respective components of [this] and [b] reduced by [out]. */
private inline fun <T> Vec4.plus(b: Vec4, out: FloatMapping4<T>) = mapReduce(b, Float::plus, out)

/** Create a new [MutableVec2] vector initialized with summed values of respective components of [this] and [b]. */
fun Vec2.plus(b: Vec2) = plus(b, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with summed values of respective components of [this] and [b]. */
fun Vec3.plus(b: Vec3) = plus(b, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with summed values of respective components of [this] and [b]. */
fun Vec4.plus(b: Vec4) = plus(b, ::mutableVec4)

/** Set summed values of respective components of [this] and [b] to [out]. */
fun Vec2.plusTo(b: Vec2, out: MutableVec2) = plus(b, out::set)

/** Set summed values of respective components of [this] and [b] to [out]. */
fun Vec3.plusTo(b: Vec3, out: MutableVec3) = plus(b, out::set)

/** Set summed values of respective components of [this] and [b] to [out]. */
fun Vec4.plusTo(b: Vec4, out: MutableVec4) = plus(b, out::set)

/** Set summed values of respective components of [this] and [b] to [this]. */
fun MutableVec2.plusSelf(b: Vec2) = plusTo(b, this)

/** Set summed values of respective components of [this] and [b] to [this]. */
fun MutableVec3.plusSelf(b: Vec3) = plusTo(b, this)

/** Set summed values of respective components of [this] and [b] to [this]. */
fun MutableVec4.plusSelf(b: Vec4) = plusTo(b, this)
