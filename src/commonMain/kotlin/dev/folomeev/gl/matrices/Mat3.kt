@file:kotlin.jvm.JvmName("Mat3")

package dev.folomeev.gl.matrices

import dev.folomeev.gl.epsEquals

/** A 3-dimensional matrix. */
abstract class Mat3 : Mat {
    /** An element at a first row, first column. */
    abstract val m00: Float

    /** An element at a first row, second column. */
    abstract val m01: Float

    /** An element at a first row, third column. */
    abstract val m02: Float

    /** An element at a second row, first column. */
    abstract val m10: Float

    /** An element at a second row, second column. */
    abstract val m11: Float

    /** An element at a second row, third column. */
    abstract val m12: Float

    /** An element at a third row, first column. */
    abstract val m20: Float

    /** An element at a third row, second column. */
    abstract val m21: Float

    /** An element at a third row, third column. */
    abstract val m22: Float

    override fun hashCode(): Int =
        m00.hashCode() xor
            (m01.hashCode() xor 0x75A5A5A5) xor
            (m02.hashCode() xor 0x5A5A5A5A) xor
            (m10.hashCode() xor 0x76969696) xor
            (m11.hashCode() xor 0x75A5A5A5) xor
            (m12.hashCode() xor 0x5A5A5A5A) xor
            (m20.hashCode() xor 0x76969696) xor
            (m21.hashCode() xor 0x75A5A5A5) xor
            (m22.hashCode() xor 0x5A5A5A5A)

    override fun equals(other: Any?) =
        other is Mat3 &&
                m00 epsEquals other.m00 &&
                m01 epsEquals other.m01 &&
                m02 epsEquals other.m02 &&
                m10 epsEquals other.m10 &&
                m11 epsEquals other.m11 &&
                m12 epsEquals other.m12 &&
                m20 epsEquals other.m20 &&
                m21 epsEquals other.m21 &&
                m22 epsEquals other.m22

    override fun toString() = "(($m00, $m01, $m02),\n" +
            " ($m10, $m11, $m12),\n" +
            " ($m20, $m21, $m22))"

    abstract override fun copyOf(): Mat3
}