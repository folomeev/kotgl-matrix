@file:kotlin.jvm.JvmName("Mat")

package dev.folomeev.gl.matrices

/** A matrix. */
interface Mat {
    /** Return a copy of the matrix.
     *
     * Immutable vectors may return itself. */
    fun copyOf(): Mat
}