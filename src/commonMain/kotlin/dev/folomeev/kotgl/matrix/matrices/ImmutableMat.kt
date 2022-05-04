@file:kotlin.jvm.JvmName("ImmutableMat")

package dev.folomeev.kotgl.matrix.matrices

/** An immutable matrix. */
interface ImmutableMat : Mat {
    override fun copyOf(): ImmutableMat
}