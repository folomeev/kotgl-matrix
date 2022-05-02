@file:kotlin.jvm.JvmName("MutableMat2")

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.Mat2
import dev.folomeev.gl.matrices.reduce

/** A mutable 2-dimensional matrix. */
abstract class MutableMat2 : Mat2(), MutableMat {
    /** An element at a first row, first column. */
    abstract override var m00: Float

    /** An element at a first row, second column. */
    abstract override var m01: Float

    /** An element at a second row, first column. */
    abstract override var m10: Float

    /** An element at a second row, second column. */
    abstract override var m11: Float

    /** Return a copy of the matrix as a new instance of [MutableMat2]. */
    abstract override fun copyOf(): MutableMat2

    /** Plain implementation of [MutableMat2]. */
    internal class Implementation(
        override var m00: Float,
        override var m01: Float,
        override var m10: Float,
        override var m11: Float
    ) : MutableMat2() {
        override fun copyOf(): MutableMat2 = reduce(::Implementation)
    }
}