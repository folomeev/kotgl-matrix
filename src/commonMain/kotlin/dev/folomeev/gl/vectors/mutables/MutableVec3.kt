@file:kotlin.jvm.JvmName("MutableVec3")
package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.Vec3

/** A basic class for a mutable [Vec3]. */
abstract class MutableVec3 : Vec3(), MutableVec {
    /** Mutable x-component of the vector. */
    abstract override var x: Float
    /** Mutable y-component of the vector. */
    abstract override var y: Float
    /** Mutable z-component of the vector. */
    abstract override var z: Float

    /** Plain implementation of [MutableVec3]. */
    internal class Implementation(override var x: Float, override var y: Float, override var z: Float) : MutableVec3() {
        override fun copyOf() = mutableVec3(this)
    }
}