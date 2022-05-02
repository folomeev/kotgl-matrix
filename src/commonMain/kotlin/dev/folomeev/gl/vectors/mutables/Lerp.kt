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

/** Calculate linear interpolation between [a] and [b].
 *
 * @receiver Value between 0 and 1. When k is 0 then result is [a]. When k is 1 then result is [b]. There is no strict
 * restrictions on value of k, it could be grater than 1, and this case result will be greater than [b], also [this] can
 * be less than 0 for a result less than [a].
 * @param a Left interpolation value.
 * @param b Right interpolation value.
 * @return Result is calculated like `[a] + [this] * ([b] - [a])`. */
internal fun Float.lerp(a: Float, b: Float) = a + this * (b - a)

private inline fun <T> Vec2.lerp(b: Vec2, k: Float, out: FloatMapping2<T>): T = mapReduce(b, k::lerp, out)
private inline fun <T> Vec3.lerp(b: Vec3, k: Float, out: FloatMapping3<T>): T = mapReduce(b, k::lerp, out)
private inline fun <T> Vec4.lerp(b: Vec4, k: Float, out: FloatMapping4<T>): T = mapReduce(b, k::lerp, out)

/** Create a new [MutableVec2] from linear interpolation of [this] and [b] scaled by [k].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun Vec2.lerp(b: Vec2, k: Float) = lerp(b, k, ::mutableVec2)

/** Create a new [MutableVec3] from linear interpolation of [this] and [b] scaled by [k].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun Vec3.lerp(b: Vec3, k: Float) = lerp(b, k, ::mutableVec3)

/** Create a new [MutableVec3] from linear interpolation of [this] and [b] scaled by [k].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun Vec4.lerp(b: Vec4, k: Float) = lerp(b, k, ::mutableVec4)

/** Calculate linear interpolation of [this] and [b] scaled by [k] and set it to [out].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun Vec2.lerpTo(b: Vec2, k: Float, out: MutableVec2) = lerp(b, k, out::set)

/** Calculate linear interpolation of [this] and [b] scaled by [k] and set it to [out].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun Vec3.lerpTo(b: Vec3, k: Float, out: MutableVec3) = lerp(b, k, out::set)

/** Calculate linear interpolation of [this] and [b] scaled by [k] and set it to [out].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun Vec4.lerpTo(b: Vec4, k: Float, out: MutableVec4) = lerp(b, k, out::set)

/** Calculate linear interpolation of [this] and [b] scaled by [k] and set it back to [this].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun MutableVec2.lerpSelf(b: Vec2, k: Float) = lerpTo(b, k, this)

/** Calculate linear interpolation of [this] and [b] scaled by [k] and set it back to [this].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun MutableVec3.lerpSelf(b: Vec3, k: Float) = lerpTo(b, k, this)

/** Calculate linear interpolation of [this] and [b] scaled by [k] and set it back to [this].
 *
 * @param k Value between 0 and 1. When 0 then result is equals to [this]. When 1 then result is [b]. */
fun MutableVec4.lerpSelf(b: Vec4, k: Float) = lerpTo(b, k, this)
