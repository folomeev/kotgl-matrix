@file:kotlin.jvm.JvmName("Vec")

package dev.folomeev.kotgl.matrix.vectors

/** A basic interface for a 4 component structure representing a vector in a 4-dimensional space.  */
interface Vec {
    /** X-component of the vector. */
    val x: Float

    /** Y-component of the vector. */
    val y: Float

    /** Z-component of the vector. */
    val z: Float

    /** W-component of the vector. */
    val w: Float

    /** Get the copy of the vector.
     *
     * Immutable vectors may return itself.
     */
    fun copyOf(): Vec
}