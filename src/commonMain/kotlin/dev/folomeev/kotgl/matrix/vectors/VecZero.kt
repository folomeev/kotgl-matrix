@file:kotlin.jvm.JvmName("VecZero")

package dev.folomeev.kotgl.matrix.vectors

/** A singleton of zero vector, all components of the vector are zeros. */
class VecZero private constructor() : ImmutableVec2(0f, 0f) {

    override fun copyOf() = this

    companion object {
        internal val INSTANCE = VecZero()
    }
}