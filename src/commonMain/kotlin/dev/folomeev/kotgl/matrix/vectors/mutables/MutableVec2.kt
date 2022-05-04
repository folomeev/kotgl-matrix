@file:kotlin.jvm.JvmName("MutableVec2")

package dev.folomeev.kotgl.matrix.vectors.mutables

import dev.folomeev.kotgl.matrix.vectors.Vec2

/** A basic class for a mutable [Vec2]. */
abstract class MutableVec2 : Vec2(), MutableVec {
    /** Mutable x-component of the vector. */
    abstract override var x: Float

    /** Mutable y-component of the vector. */
    abstract override var y: Float

    /** Plain implementation of [MutableVec2]. */
    internal class Implementation(override var x: Float, override var y: Float) : MutableVec2() {
        override fun copyOf() = mutableVec2(this)
    }
}