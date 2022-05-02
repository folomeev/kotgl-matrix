@file:kotlin.jvm.JvmName("ImmutableMat2")

package dev.folomeev.gl.matrices

/** An immutable 2-dimensional matrix. */
class ImmutableMat2 internal constructor(
    /** An element at a first row, first column. */
    override val m00: Float,
    /** An element at a first row, second column. */
    override val m01: Float,
    /** An element at a second row, first column. */
    override val m10: Float,
    /** An element at a second row, second column. */
    override val m11: Float
) : Mat2(), ImmutableMat {
    /** Return itself instead of copying. */
    override fun copyOf() = this
}