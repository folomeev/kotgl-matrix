@file:kotlin.jvm.JvmName("Mat4")

package dev.folomeev.kotgl.matrix.matrices

import dev.folomeev.kotgl.matrix.epsEquals


/** A 4-dimensional matrix. */
abstract class Mat4 : Mat {
    /** An element at a first row, first column. */
    abstract val m00: Float

    /** An element at a first row, second column. */
    abstract val m01: Float

    /** An element at a first row, third column. */
    abstract val m02: Float

    /** An element at a first row, forth column. */
    abstract val m03: Float

    /** An element at a second row, first column. */
    abstract val m10: Float

    /** An element at a second row, second column. */
    abstract val m11: Float

    /** An element at a second row, third column. */
    abstract val m12: Float

    /** An element at a second row, forth column. */
    abstract val m13: Float

    /** An element at a third row, first column. */
    abstract val m20: Float

    /** An element at a third row, second column. */
    abstract val m21: Float

    /** An element at a third row, third column. */
    abstract val m22: Float

    /** An element at a third row, forth column. */
    abstract val m23: Float

    /** An element at a forth row, first column. */
    abstract val m30: Float

    /** An element at a forth row, second column. */
    abstract val m31: Float

    /** An element at a forth row, third column. */
    abstract val m32: Float

    /** An element at a forth row, forth column. */
    abstract val m33: Float

    override fun hashCode(): Int =
        m00.hashCode() xor
                (m01.hashCode() xor 0x75A5A5A5) xor
                (m02.hashCode() xor 0x5A5A5A5A) xor
                (m03.hashCode() xor 0x76969696) xor
                (m10.hashCode() xor 0x75A5A5A5) xor
                (m11.hashCode() xor 0x5A5A5A5A) xor
                (m12.hashCode() xor 0x76969696) xor
                (m13.hashCode() xor 0x75A5A5A5) xor
                (m20.hashCode() xor 0x5A5A5A5A) xor
                (m21.hashCode() xor 0x76969696) xor
                (m22.hashCode() xor 0x75A5A5A5) xor
                (m23.hashCode() xor 0x5A5A5A5A) xor
                (m30.hashCode() xor 0x76969696) xor
                (m31.hashCode() xor 0x75A5A5A5) xor
                (m32.hashCode() xor 0x5A5A5A5A) xor
                (m33.hashCode() xor 0x76969696)

    override fun equals(other: Any?) =
        other is Mat4 &&
                m00 epsEquals other.m00 &&
                m01 epsEquals other.m01 &&
                m02 epsEquals other.m02 &&
                m03 epsEquals other.m03 &&
                m10 epsEquals other.m10 &&
                m11 epsEquals other.m11 &&
                m12 epsEquals other.m12 &&
                m13 epsEquals other.m13 &&
                m20 epsEquals other.m20 &&
                m21 epsEquals other.m21 &&
                m22 epsEquals other.m22 &&
                m23 epsEquals other.m23 &&
                m30 epsEquals other.m30 &&
                m31 epsEquals other.m31 &&
                m32 epsEquals other.m32 &&
                m33 epsEquals other.m33

    override fun toString() = "(($m00, $m01, $m02, $m03),\n" +
            " ($m10, $m11, $m12, $m13),\n" +
            " ($m20, $m21, $m22, $m23),\n" +
            " ($m30, $m31, $m32, $m33))"

    abstract override fun copyOf(): Mat4
}