@file:kotlin.jvm.JvmName("ImmutableVec2")

package dev.folomeev.kotgl.matrix.vectors

/** Immutable thread-safe 2-dimensional vector. */
open class ImmutableVec2 internal constructor(final override val x: Float, final override val y: Float) : Vec2(),
    ImmutableVec {
    override fun copyOf() = this
}