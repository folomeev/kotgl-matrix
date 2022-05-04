package dev.folomeev.kotgl.matrix.vectors

/** A 2-dimensional vector.
 *
 * Represents a 3-dimensional vector which lies in the XY plane, the z-component always equals to 0. */
abstract class Vec2 internal constructor() : Vec3() {
    final override val z: Float get() = 0f

    abstract override fun copyOf(): Vec2

    override fun toString() = "($x, $y)"
}