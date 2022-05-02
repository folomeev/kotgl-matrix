@file:kotlin.jvm.JvmName("Matrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices

import dev.folomeev.gl.FloatMapping16
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.FloatMapping9

/** Call [f] on all [this] matrix components given row by row and return it's result. */
internal inline fun <T> Mat2.reduce(f: FloatMapping4<T>): T = f(
    m00, m01,
    m10, m11
)

/** Call [f] on all [this] matrix components given row by row and return it's result. */
internal inline fun <T> Mat3.reduce(f: FloatMapping9<T>): T = f(
    m00, m01, m02,
    m10, m11, m12,
    m20, m21, m22
)

/** Call [f] on all [this] matrix components given row by row and return it's result. */
internal inline fun <T> Mat4.reduce(f: FloatMapping16<T>): T = f(
    m00, m01, m02, m03,
    m10, m11, m12, m13,
    m20, m21, m22, m23,
    m30, m31, m32, m33
)