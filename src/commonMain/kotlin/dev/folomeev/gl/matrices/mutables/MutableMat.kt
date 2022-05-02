@file:kotlin.jvm.JvmName("MutableMat")

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.Mat

/** A mutable matrix. */
interface MutableMat : Mat {
    /** Return a copy of the matrix as a new instance of [MutableMat]. */
    override fun copyOf(): MutableMat
}