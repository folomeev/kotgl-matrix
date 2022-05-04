@file:kotlin.jvm.JvmName("MutableVectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.*

/** Create a new mutable 2-dimensional vector from the 2-dimensional vector. */
fun Vec2.toMutable() = mutableVec2(this)

/** Create a new mutable 3-dimensional vector from the 3-dimensional vector. */
fun Vec3.toMutable() = mutableVec3(this)

/** Create a new mutable 4-dimensional vector from the 4-dimensional vector. */
fun Vec4.toMutable() = mutableVec4(this)

/** Create a new immutable 2-dimensional vector from the mutable 2-dimensional vector. */
fun MutableVec2.toImmutable(): Vec2 = reduce(::vec2)

/** Create a new immutable 3-dimensional vector from the mutable 3-dimensional vector. */
fun MutableVec3.toImmutable(): Vec3 = reduce(::vec3)

/** Create a new immutable 4-dimensional vector from the mutable 4-dimensional vector. */
fun MutableVec4.toImmutable(): Vec4 = reduce(::vec4)

/** Create a new mutable 2-dimensional vector with all components set to zero. */
fun mutableVec2() = mutableVec2(vecZero())

/** Create a new mutable 2-dimensional vector from another 2-dimensional vector. */
fun mutableVec2(v: Vec2): MutableVec2 = v.reduce(::mutableVec2)

/** Create a new mutable 2-dimensional vector from the given xy components. */
fun mutableVec2(x: Float, y: Float): MutableVec2 = MutableVec2.Implementation(x, y)

/** Create a new mutable 3-dimensional vector with all components set to zero. */
fun mutableVec3() = mutableVec3(vecZero())

/** Create a new mutable 3-dimensional vector from a 2-dimensional vector appended with a z-component. */
fun mutableVec3(v: Vec2, z: Float) = mutableVec3(v.x, v.y, z)

/** Create a new mutable 3-dimensional vector from another 3-dimensional vector. */
fun mutableVec3(v: Vec3): MutableVec3 = v.reduce(::mutableVec3)

/** Create a new mutable 3-dimensional vector from the given xy components. */
fun mutableVec3(x: Float, y: Float, z: Float): MutableVec3 = MutableVec3.Implementation(x, y, z)

/** Create a new mutable 4-dimensional vector with all components set to zero. */
fun mutableVec4() = mutableVec4(vecZero())

/** Create a new mutable 4-dimensional vector from a 2-dimensional vector appended with zw components. */
fun mutableVec4(v: Vec2, z: Float, w: Float) = mutableVec4(v.x, v.y, z, w)

/** Create a new mutable 4-dimensional vector from a 3-dimensional vector appended with a w-component. */
fun mutableVec4(v: Vec3, w: Float) = mutableVec4(v.x, v.y, v.z, w)

/** Create a new mutable 4-dimensional vector from another 4-dimensional vector. */
fun mutableVec4(v: Vec4): MutableVec4 = v.reduce(::mutableVec4)

/** Create a new mutable 4-dimensional vector from the given xy components. */
fun mutableVec4(x: Float, y: Float, z: Float, w: Float): MutableVec4 = MutableVec4.Implementation(x, y, z, w)
