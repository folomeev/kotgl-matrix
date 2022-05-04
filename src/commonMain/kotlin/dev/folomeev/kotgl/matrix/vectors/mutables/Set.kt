@file:kotlin.jvm.JvmName("MutableVectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.Vec2
import dev.folomeev.kotgl.matrix.vectors.Vec3
import dev.folomeev.kotgl.matrix.vectors.Vec4
import dev.folomeev.kotgl.matrix.vectors.reduce

/** Set all vector components.
 *
 * @return the instance of this object */
fun MutableVec2.set(x: Float, y: Float): MutableVec2 {
    this.x = x
    this.y = y
    return this
}

/** Set all vector components.
 *
 * @return the instance of this object */
fun MutableVec3.set(x: Float, y: Float, z: Float): MutableVec3 {
    this.x = x
    this.y = y
    this.z = z
    return this
}

/** Set all vector components.
 *
 * @return the instance of this object */
fun MutableVec4.set(x: Float, y: Float, z: Float, w: Float): MutableVec4 {
    this.x = x
    this.y = y
    this.z = z
    this.w = w
    return this
}

/** Copy components of [v] into [this]. */
fun MutableVec2.set(v: Vec2): MutableVec2 = v.reduce(this::set)

/** Copy components of [v] into [this]. */
fun MutableVec3.set(v: Vec3): MutableVec3 = v.reduce(this::set)

/** Copy components of [v] into [this]. */
fun MutableVec4.set(v: Vec4): MutableVec4 = v.reduce(this::set)

/** Set each component of [this] to [value]. */
fun MutableVec2.setAll(value: Float) = set(value, value)

/** Set each component of [this] to [value]. */
fun MutableVec3.setAll(value: Float) = set(value, value, value)

/** Set each component of [this] to [value]. */
fun MutableVec4.setAll(value: Float) = set(value, value, value, value)
