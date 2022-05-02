@file:kotlin.jvm.JvmName("ImmutableMat")

package dev.folomeev.gl.matrices

/** An immutable matrix. */
interface ImmutableMat : Mat {
    override fun copyOf(): ImmutableMat
}