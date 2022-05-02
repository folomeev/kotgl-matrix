/** Set of methods calculating matrix determinants. */
@file:kotlin.jvm.JvmName("Matrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices

/** Calculate the matrix determinant using the Leibniz formula. */
fun Mat2.det(): Float = m00 * m11 - m01 * m10

/** Calculate the matrix determinant using the Laplace formula. */
fun Mat3.det(): Float =
    m00 * (m22 * m11 - m12 * m21) +
            m01 * (m12 * m20 - m22 * m10) +
            m02 * (m21 * m10 - m11 * m20)

/** Calculate the matrix determinant. */
fun Mat4.det(): Float {
    val a0 = m00 * m11 - m01 * m10
    val a1 = m00 * m12 - m02 * m10
    val a2 = m01 * m12 - m02 * m11
    val a3 = m20 * m31 - m21 * m30
    val a4 = m20 * m32 - m22 * m30
    val a5 = m21 * m32 - m22 * m31
    val a6 = m00 * a5 - m01 * a4 + m02 * a3
    val a7 = m10 * a5 - m11 * a4 + m12 * a3
    val a8 = m20 * a2 - m21 * a1 + m22 * a0
    val a9 = m30 * a2 - m31 * a1 + m32 * a0

    return m13 * a6 - m03 * a7 + m33 * a8 - m23 * a9
}