@file:kotlin.jvm.JvmName("ImmutableMat3")

package dev.folomeev.kotgl.matrix.matrices

/** An immutable 3-dimensional matrix. */
class ImmutableMat3 internal constructor(
    /** An element at a first row, first column. */
    override val m00: Float,
    /** An element at a first row, second column. */
    override val m01: Float,
    /** An element at a first row, third column. */
    override val m02: Float,
    /** An element at a second row, first column. */
    override val m10: Float,
    /** An element at a second row, second column. */
    override val m11: Float,
    /** An element at a second row, third column. */
    override val m12: Float,
    /** An element at a third row, first column. */
    override val m20: Float,
    /** An element at a third row, second column. */
    override val m21: Float,
    /** An element at a third row, third column. */
    override val m22: Float,
) : Mat3(), ImmutableMat {
    /** Return itself instead of copying. */
    override fun copyOf() = this
}