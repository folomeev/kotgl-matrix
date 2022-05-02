@file:kotlin.jvm.JvmName("MutableVectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.FloatMapping2
import dev.folomeev.gl.FloatMapping3
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.epsEquals
import dev.folomeev.gl.vectors.Vec2
import dev.folomeev.gl.vectors.Vec3
import dev.folomeev.gl.vectors.Vec4
import dev.folomeev.gl.vectors.vec2
import dev.folomeev.gl.vectors.vec3
import dev.folomeev.gl.vectors.vec4
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.random.Random

private typealias Radian = Float

private const val FLOAT_2_PI = 2 * PI.toFloat()

/** Generate a random [Radian] value between included 0 and excluded 2 * [PI]. */
private fun Random.nextRadian(): Radian = nextFloat() * FLOAT_2_PI

/** Generate a random [Float] value between included [min] and excluded [min] + [length]. */
private fun Random.nextFloat(min: Float, length: Float) = nextFloat() * length + min

/** Generate a random 2-dimensional vector of the given [length] and reduce by [reducer]. */
private inline fun <T> Random.nextVec2(length: Float, reducer: FloatMapping2<T>): T =
    if (length epsEquals 0f) {
        reducer(0f, 0f)
    } else {
        nextRadian().let { radian -> reducer(sin(radian) * length, cos(radian) * length) }
    }

/** Create a new random [Vec2] of the given [length]. */
fun Random.nextVec2(length: Float = 1f): Vec2 = nextVec2(length, ::vec2)

/** Set a random vector of the given [length] to [out]. */
fun Random.nextVec2To(length: Float = 1f, out: MutableVec2) = nextVec2(length, out::set)

/** Generate a random 3-dimensional vector of the given [length] and reduce by [reducer]. */
private inline fun <T> Random.nextVec3(length: Float, reducer: FloatMapping3<T>): T =
    if (length epsEquals 0f) {
        reducer(0f, 0f, 0f)
    } else {
        val z = nextFloat(min = -1f, length = 2f)
        val zLength = sqrt(1f - z * z) * length
        nextRadian().let { radian -> reducer(sin(radian) * zLength, cos(radian) * zLength, z * length) }
    }

/** Create a new random [Vec3] of the given [length]. */
fun Random.nextVec3(length: Float = 1f): Vec3 = nextVec3(length, ::vec3)

/** Set a random vector of the given [length] to [out]. */
fun Random.nextVec3To(length: Float = 1f, out: MutableVec3) = nextVec3(length, out::set)

/** Generate a random 4-dimensional vector of the given [length] and reduce by [reducer]. */
private inline fun <T> Random.nextVec4(length: Float, reducer: FloatMapping4<T>): T =
    if (length epsEquals 0f) {
        reducer(0f, 0f, 0f, 0f)
    } else {
        var kx: Float
        var ky: Float
        var k1: Float
        do {
            kx = nextFloat(min = -1f, length = 2f)
            ky = nextFloat(min = -1f, length = 2f)
            k1 = kx * kx + ky * ky
        } while (k1 >= 1f)

        var kz: Float
        var kw: Float
        var k2: Float
        do {
            kz = nextFloat(min = -1f, length = 2f)
            kw = nextFloat(min = -1f, length = 2f)
            k2 = kz * kz + kw * kw
        } while (k2 >= 1f)
        val d = sqrt((1f - k1) / k2)
        reducer(kx * length, ky * length, kz * d * length, kw * d * length)
    }

/** Create a new random [Vec4] of the given [length]. */
fun Random.nextVec4(length: Float = 1f): Vec4 = nextVec4(length, ::vec4)

/** Set a random vector of the given [length] to [out]. */
fun Random.nextVec4To(length: Float = 1f, out: MutableVec4) = nextVec4(length, out::set)

fun MutableVec2.randomizeSelf(random: Random = Random.Default, length: Float = 1f) = random.nextVec2To(length, this)
fun MutableVec3.randomizeSelf(random: Random = Random.Default, length: Float = 1f) = random.nextVec3To(length, this)
fun MutableVec4.randomizeSelf(random: Random = Random.Default, length: Float = 1f) = random.nextVec4To(length, this)
