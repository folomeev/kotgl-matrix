/** Set of methods instantiating vectors. */
@file:kotlin.jvm.JvmName("Vectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors

/** Get an immutable zero vector. */
fun vecZero() = VecZero.INSTANCE

/** Get an immutable unit vector, having x-component of 1. */
fun vecUnitX() = VecUnitX.INSTANCE

/** Get an immutable unit vector, having y-component of 1. */
fun vecUnitY() = VecUnitY.INSTANCE

/** Get an immutable unit vector, having z-component of 1. */
fun vecUnitZ() = VecUnitZ.INSTANCE

/** Get an immutable unit vector, having w-component of 1. */
fun vecUnitW() = VecUnitW.INSTANCE

/** Get an immutable zero vector. */
fun vec2(): Vec2 = vecZero()

/** Create a new immutable 2-dimensional vector from the given xy components. */
fun vec2(x: Float, y: Float): Vec2 = ImmutableVec2(x, y)

/** Get an immutable zero vector. */
fun vec3(): Vec3 = vecZero()

/** Create a new immutable 3-dimensional vector from the given xyz components. */
fun vec3(x: Float, y: Float, z: Float): Vec3 = ImmutableVec3(x, y, z)

/** Create a new immutable 3-dimensional vector from a 2-dimensional vector appended with a z-component. */
fun vec3(v: Vec2, z: Float) = vec3(v.x, v.y, z)

/** Get an immutable zero vector. */
fun vec4(): Vec4 = vecZero()

/** Create a new immutable 4-dimensional vector from the given xyzw components. */
fun vec4(x: Float, y: Float, z: Float, w: Float): Vec4 = ImmutableVec4(x, y, z, w)

/** Create a new immutable 4-dimensional vector from a 2-dimensional vector appended with zw components. */
fun vec4(v: Vec2, z: Float, w: Float) = vec4(v.x, v.y, z, w)

/** Create a new immutable 4-dimensional vector from a 3-dimensional vector appended with a w-component. */
fun vec4(v: Vec3, w: Float) = vec4(v.x, v.y, v.z, w)
