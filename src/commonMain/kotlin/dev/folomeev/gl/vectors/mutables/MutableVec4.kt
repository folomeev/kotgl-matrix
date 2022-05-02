@file:kotlin.jvm.JvmName("MutableVec4")
package dev.folomeev.gl.vectors.mutables

import dev.folomeev.gl.vectors.Vec4

/** A basic class for a mutable [Vec4]. */
abstract class MutableVec4 : Vec4(), MutableVec {
    /** Mutable x-component of the vector. */
    abstract override var x: Float
    /** Mutable y-component of the vector. */
    abstract override var y: Float
    /** Mutable z-component of the vector. */
    abstract override var z: Float
    /** Mutable w-component of the vector. */
    abstract override var w: Float

    /** Plain implementation of [MutableVec3]. */
    internal class Implementation(
        override var x: Float,
        override var y: Float,
        override var z: Float,
        override var w: Float
    ) : MutableVec4() {
        override fun copyOf() = mutableVec4(this)
    }
}