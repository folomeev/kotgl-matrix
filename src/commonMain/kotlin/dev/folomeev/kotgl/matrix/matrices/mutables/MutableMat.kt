@file:kotlin.jvm.JvmName("MutableMat")

package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.Mat

/** A mutable matrix. */
interface MutableMat : Mat {
    /** Return a copy of the matrix as a new instance of [MutableMat]. */
    override fun copyOf(): MutableMat
}