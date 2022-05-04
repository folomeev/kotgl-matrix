package dev.folomeev.kotgl.matrix.vectors

/** Singleton unit vector having z-component equals to 1 and all other are zeros. */
class VecUnitZ private constructor() : ImmutableVec3(0f, 0f, 1f) {

    override fun copyOf() = this

    companion object {
        internal val INSTANCE = VecUnitZ()
    }
}