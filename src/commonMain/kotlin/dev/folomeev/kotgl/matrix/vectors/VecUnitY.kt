@file:kotlin.jvm.JvmName("VecUnitY")

package dev.folomeev.kotgl.matrix.vectors

/** Singleton unit vector having y-component equals to 1 and all other are zeros. */
class VecUnitY private constructor() : ImmutableVec2(0f, 1f) {

    override fun copyOf() = this

    companion object {
        internal val INSTANCE = VecUnitY()
    }
}