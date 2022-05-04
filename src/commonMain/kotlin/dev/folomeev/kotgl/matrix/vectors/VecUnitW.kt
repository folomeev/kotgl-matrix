@file:kotlin.jvm.JvmName("VecUnitW")

package dev.folomeev.kotgl.matrix.vectors

/** Singleton unit vector having w-component equals to 1 and all other are zeros. */
class VecUnitW private constructor() : ImmutableVec4(0f, 0f, 0f, 1f) {

    override fun copyOf() = this

    companion object {
        internal val INSTANCE = VecUnitW()
    }
}