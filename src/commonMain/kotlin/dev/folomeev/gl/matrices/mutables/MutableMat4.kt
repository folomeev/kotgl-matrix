@file:kotlin.jvm.JvmName("MutableMat4")

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.Mat4
import dev.folomeev.gl.matrices.reduce

/** A mutable 3-dimensional matrix. */
abstract class MutableMat4: Mat4(), MutableMat {
    /** An element at a first row, first column. */
    abstract override var m00: Float

    /** An element at a first row, second column. */
    abstract override var m01: Float

    /** An element at a first row, third column. */
    abstract override var m02: Float

    /** An element at a first row, forth column. */
    abstract override var m03: Float

    /** An element at a second row, first column. */
    abstract override var m10: Float

    /** An element at a second row, second column. */
    abstract override var m11: Float

    /** An element at a second row, third column. */
    abstract override var m12: Float

    /** An element at a second row, forth column. */
    abstract override var m13: Float

    /** An element at a third row, first column. */
    abstract override var m20: Float

    /** An element at a third row, second column. */
    abstract override var m21: Float

    /** An element at a third row, third column. */
    abstract override var m22: Float

    /** An element at a third row, forth column. */
    abstract override var m23: Float

    /** An element at a forth row, first column. */
    abstract override var m30: Float

    /** An element at a forth row, second column. */
    abstract override var m31: Float

    /** An element at a forth row, third column. */
    abstract override var m32: Float

    /** An element at a forth row, forth column. */
    abstract override var m33: Float

    /** Return a copy of the matrix as a new instance of [MutableMat4]. */
    abstract override fun copyOf(): MutableMat4

    /** Plain implementation of [MutableMat3]. */
    internal class Implementation(
        override var m00: Float,
        override var m01: Float,
        override var m02: Float,
        override var m03: Float,
        override var m10: Float,
        override var m11: Float,
        override var m12: Float,
        override var m13: Float,
        override var m20: Float,
        override var m21: Float,
        override var m22: Float,
        override var m23: Float,
        override var m30: Float,
        override var m31: Float,
        override var m32: Float,
        override var m33: Float
    ): MutableMat4() {
        override fun copyOf(): MutableMat4 = reduce(::Implementation)
    }
}