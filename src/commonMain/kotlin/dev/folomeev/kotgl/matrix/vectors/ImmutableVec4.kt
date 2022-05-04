@file:kotlin.jvm.JvmName("ImmutableVec4")

package dev.folomeev.kotgl.matrix.vectors

/** Immutable thread-safe 4-dimensional vector. */
open class ImmutableVec4 internal constructor(
    override val x: Float,
    override val y: Float,
    override val z: Float,
    override val w: Float
) :
    Vec4(), ImmutableVec {
    override fun copyOf() = this
}