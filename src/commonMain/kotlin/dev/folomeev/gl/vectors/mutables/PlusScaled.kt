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

/** Calculate `[a] + [this] * [b]`. */
internal fun Float.plusScaled(a: Float, b: Float) = a + this * b

/** Summed values of respective components of [this] and [k]*[b] reduced by [out]. */
private inline fun <T> Vec2.plusScaled(k: Float, b: Vec2, out: FloatMapping2<T>) =
    mapReduce(b, k::plusScaled, out)

/** Summed values of respective components of [this] and [k]*[b] reduced by [out]. */
private inline fun <T> Vec3.plusScaled(k: Float, b: Vec3, out: FloatMapping3<T>) =
    mapReduce(b, k::plusScaled, out)

/** Summed values of respective components of [this] and [k]*[b] reduced by [out]. */
private inline fun <T> Vec4.plusScaled(k: Float, b: Vec4, out: FloatMapping4<T>) =
    mapReduce(b, k::plusScaled, out)

/** Create a new [MutableVec2] vector initialized with summed values of respective components of [this] and [k]*[b]. */
fun Vec2.plusScaled(k: Float, b: Vec2) = plusScaled(k, b, ::mutableVec2)

/** Create a new [MutableVec3] vector initialized with summed values of respective components of [this] and [k]*[b]. */
fun Vec3.plusScaled(k: Float, b: Vec3) = plusScaled(k, b, ::mutableVec3)

/** Create a new [MutableVec4] vector initialized with summed values of respective components of [this] and [k]*[b]. */
fun Vec4.plusScaled(k: Float, b: Vec4) = plusScaled(k, b, ::mutableVec4)

/** Set summed values of respective components of [this] and [k]*[b] to [out]. */
fun Vec2.plusScaledTo(k: Float, b: Vec2, out: MutableVec2) = plusScaled(k, b, out::set)

/** Set summed values of respective components of [this] and [k]*[b] to [out]. */
fun Vec3.plusScaledTo(k: Float, b: Vec3, out: MutableVec3) = plusScaled(k, b, out::set)

/** Set summed values of respective components of [this] and [k]*[b] to [out]. */
fun Vec4.plusScaledTo(k: Float, b: Vec4, out: MutableVec4) = plusScaled(k, b, out::set)

/** Set summed values of respective components of [this] and [k]*[b] to [this]. */
fun MutableVec2.plusScaledSelf(k: Float, b: Vec2) = plusScaledTo(k, b, this)

/** Set summed values of respective components of [this] and [k]*[b] to [this]. */
fun MutableVec3.plusScaledSelf(k: Float, b: Vec3) = plusScaledTo(k, b, this)

/** Set summed values of respective components of [this] and [k]*[b] to [this]. */
fun MutableVec4.plusScaledSelf(k: Float, b: Vec4) = plusScaledTo(k, b, this)
