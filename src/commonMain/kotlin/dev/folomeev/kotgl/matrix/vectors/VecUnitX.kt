package dev.folomeev.kotgl.matrix.vectors

/** Singleton unit vector having x-component equals to 1 and all other are zeros. */
class VecUnitX private constructor() : ImmutableVec2(1f, 0f) {

    override fun copyOf() = this

    companion object {
        internal val INSTANCE = VecUnitX()
    }
}