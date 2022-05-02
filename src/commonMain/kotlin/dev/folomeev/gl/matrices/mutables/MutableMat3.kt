@file:kotlin.jvm.JvmName("MutableMat3")

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.Mat3
import dev.folomeev.gl.matrices.reduce

/** A mutable 3-dimensional matrix. */
abstract class MutableMat3: Mat3(), MutableMat {
    /** An element at a first row, first column. */
    abstract override var m00: Float

    /** An element at a first row, second column. */
    abstract override var m01: Float

    /** An element at a first row, third column. */
    abstract override var m02: Float

    /** An element at a second row, first column. */
    abstract override var m10: Float

    /** An element at a second row, second column. */
    abstract override var m11: Float

    /** An element at a second row, third column. */
    abstract override var m12: Float

    /** An element at a third row, first column. */
    abstract override var m20: Float

    /** An element at a third row, second column. */
    abstract override var m21: Float

    /** An element at a third row, third column. */
    abstract override var m22: Float

    /** Return a copy of the matrix as a new instance of [MutableMat3]. */
    abstract override fun copyOf(): MutableMat3

    /** Plain implementation of [MutableMat3]. */
    internal class Implementation(
        override var m00: Float,
        override var m01: Float,
        override var m02: Float,
        override var m10: Float,
        override var m11: Float,
        override var m12: Float,
        override var m20: Float,
        override var m21: Float,
        override var m22: Float
    ): MutableMat3() {
        override fun copyOf(): MutableMat3 = reduce(::Implementation)
    }
}