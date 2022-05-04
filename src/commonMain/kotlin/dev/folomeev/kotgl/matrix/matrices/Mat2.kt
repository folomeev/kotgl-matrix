@file:kotlin.jvm.JvmName("Mat2")

package dev.folomeev.kotgl.matrix.matrices

import dev.folomeev.kotgl.matrix.epsEquals

/** A 2-dimensional matrix. */
abstract class Mat2 : Mat {
    /** An element at a first row, first column. */
    abstract val m00: Float

    /** An element at a first row, second column. */
    abstract val m01: Float

    /** An element at a second row, first column. */
    abstract val m10: Float

    /** An element at a second row, second column. */
    abstract val m11: Float

    override fun hashCode(): Int =
        m00.hashCode() xor
                (m01.hashCode() xor 0x75A5A5A5) xor
                (m10.hashCode() xor 0x5A5A5A5A) xor
                (m11.hashCode() xor 0x76969696)

    override fun equals(other: Any?) =
        other is Mat2 &&
                m00 epsEquals other.m00 &&
                m01 epsEquals other.m01 &&
                m10 epsEquals other.m10 &&
                m11 epsEquals other.m11

    override fun toString() = "(($m00, $m01),\n ($m10, $m11))"

    abstract override fun copyOf(): Mat2
}