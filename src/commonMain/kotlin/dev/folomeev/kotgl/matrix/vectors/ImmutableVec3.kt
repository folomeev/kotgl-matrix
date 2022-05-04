package dev.folomeev.kotgl.matrix.vectors

/** Immutable thread-safe 3-dimensional vector. */
open class ImmutableVec3 internal constructor(override val x: Float, override val y: Float, override val z: Float) :
    Vec3(), ImmutableVec {
    override fun copyOf() = this
}