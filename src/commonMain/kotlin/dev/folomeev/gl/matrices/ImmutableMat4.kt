@file:kotlin.jvm.JvmName("ImmutableMat4")

package dev.folomeev.gl.matrices

/** An immutable 4-dimensional matrix. */
class ImmutableMat4 internal constructor(
    /** An element at a first row, first column. */
    override val m00: Float,
    /** An element at a first row, second column. */
    override val m01: Float,
    /** An element at a first row, third column. */
    override val m02: Float,
    /** An element at a first row, forth column. */
    override val m03: Float,
    /** An element at a second row, first column. */
    override val m10: Float,
    /** An element at a second row, second column. */
    override val m11: Float,
    /** An element at a second row, third column. */
    override val m12: Float,
    /** An element at a second row, forth column. */
    override val m13: Float,
    /** An element at a third row, first column. */
    override val m20: Float,
    /** An element at a third row, second column. */
    override val m21: Float,
    /** An element at a third row, third column. */
    override val m22: Float,
    /** An element at a third row, forth column. */
    override val m23: Float,
    /** An element at a forth row, first column. */
    override val m30: Float,
    /** An element at a forth row, second column. */
    override val m31: Float,
    /** An element at a forth row, third column. */
    override val m32: Float,
    /** An element at a forth row, forth column. */
    override val m33: Float
) : Mat4(), ImmutableMat {
    /** Return itself instead of copying. */
    override fun copyOf() = this
}