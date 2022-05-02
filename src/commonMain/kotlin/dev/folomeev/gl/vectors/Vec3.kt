package dev.folomeev.gl.vectors


/** A 3-dimensional vector.
 *
 * Represents a 4-dimensional vector which belongs to the XYZ space, the w-component always equals to 0. */
abstract class Vec3 internal constructor() : Vec4() {
    final override val w: Float get() = 0f

    abstract override fun copyOf(): Vec3

    override fun toString() = "($x, $y, $z)"
}