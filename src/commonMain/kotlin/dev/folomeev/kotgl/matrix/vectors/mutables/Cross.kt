@file:kotlin.jvm.JvmName("MutableVectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.FloatMapping3
import dev.folomeev.kotgl.matrix.FloatMapping4
import dev.folomeev.kotgl.matrix.vectors.Vec2
import dev.folomeev.kotgl.matrix.vectors.Vec3
import dev.folomeev.kotgl.matrix.vectors.Vec4

/** Calculate a cross-product of [this] and [b] and reduce it by [out]. */
private inline fun <T> Vec2.cross(b: Vec2, out: FloatMapping3<T>) = out(0f, 0f, x * b.y - y * b.x)

/** Calculate a cross-product of [this] and [b] and reduce it by [out]. */
private inline fun <T> Vec3.cross(b: Vec3, out: FloatMapping3<T>) = out(
    y * b.z - z * b.y,
    z * b.x - x * b.z,
    x * b.y - y * b.x
)

/** Calculate a cross-product of [this], [b], and [c] and reduce it by [out]. */
private inline fun <T> Vec4.cross(b: Vec4, c: Vec4, out: FloatMapping4<T>): T {
    val s1 = b.x * c.y - b.y * c.x
    val s2 = b.x * c.z - b.z * c.x
    val s3 = b.x * c.w - b.w * c.x
    val s4 = b.y * c.z - b.z * c.y
    val s5 = b.y * c.w - b.w * c.y
    val s6 = b.z * c.w - b.w * c.z

    return out(
        y * s6 - z * s5 + w * s4,
        -(x * s6) + z * s3 - w * s2,
        x * s5 - y * s3 + w * s1,
        -(x * s4) + y * s2 - z * s1
    )
}

/** Create a new [MutableVec3] as a cross-product of [this] and [b]. */
fun Vec2.cross(b: Vec2) = cross(b, ::mutableVec3)

/** Create a new [MutableVec3] as a cross-product of [this] and [b]. */
fun Vec3.cross(b: Vec3) = cross(b, ::mutableVec3)

/** Create a new [MutableVec4] as a cross-product of [this], [b], and [c]. */
fun Vec4.cross(b: Vec4, c: Vec4) = cross(b, c, ::mutableVec4)

/** Calculate a cross-product of [this] and [b] and set it to [this]. */
fun Vec2.crossTo(b: Vec2, out: MutableVec3) = cross(b, out::set)

/** Calculate a cross-product of [this] and [b] and set it to [this]. */
fun Vec3.crossTo(b: Vec3, out: MutableVec3) = cross(b, out::set)

/** Calculate a cross-product of [this], [b], and [c] and set it to [out]. */
fun Vec4.crossTo(b: Vec4, c: Vec4, out: MutableVec4) = cross(b, c, out::set)

/** Calculate a cross-product of [this] and [b] and set it to [this]. */
fun MutableVec3.crossSelf(b: Vec3) = crossTo(b, this)

/** Calculate a cross-product of [this], [b], and [c] and set it to [this]. */
fun MutableVec4.crossSelf(b: Vec4, c: Vec4) = crossTo(b, c, this)