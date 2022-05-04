/** Set of methods instantiating matrices. */
@file:kotlin.jvm.JvmName("Matrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.matrices

/** A matrix element value initializer by row and col indexes. */
internal typealias MatInitializer = (Int, Int) -> Float

/** Create a 2-dimensional matrix from given values.
 * @param m00 An element at a first row, first column.
 * @param m01 An element at a first row, second column.
 * @param m10 An element at a second row, first column.
 * @param m11 An element at a second row, second column.
 */
fun mat2(
    m00: Float, m01: Float,
    m10: Float, m11: Float
): Mat2 = ImmutableMat2(m00, m01, m10, m11)

/** Create a 2-dimensional matrix with a given initializer.
 * @param init Initialization function, accepts a zero based row index as a first parameter and a zero based col index
 * as a second parameter. */
inline fun mat2(init: MatInitializer) = mat2(
    init(0, 0), init(0, 1),
    init(1, 0), init(1, 1)
)

/** Create a 3-dimensional matrix from given values.
 * @param m00 An element at a first row, first column.
 * @param m01 An element at a first row, second column.
 * @param m02 An element at a first row, third column.
 * @param m10 An element at a second row, first column.
 * @param m11 An element at a second row, second column.
 * @param m22 An element at a second row, third column.
 * @param m20 An element at a third row, first column.
 * @param m21 An element at a third row, second column.
 * @param m22 An element at a third row, third column.
 */
fun mat3(
    m00: Float, m01: Float, m02: Float,
    m10: Float, m11: Float, m12: Float,
    m20: Float, m21: Float, m22: Float
): Mat3 = ImmutableMat3(m00, m01, m02, m10, m11, m12, m20, m21, m22)

/** Create a 3-dimensional matrix with a given initializer.
 * @param init Initialization function, accepts a zero based row index as a first parameter and a zero based col index
 * as a second parameter.  */
inline fun mat3(init: MatInitializer) = mat3(
    init(0, 0), init(0, 1), init(0, 2),
    init(1, 0), init(1, 1), init(1, 2),
    init(2, 0), init(2, 1), init(2, 2)
)

/** Create a 4-dimensional matrix from given values.
 * @param m00 An element at a first row, first column.
 * @param m01 An element at a first row, second column.
 * @param m02 An element at a first row, third column.
 * @param m03 An element at a first row, forth column.
 * @param m10 An element at a second row, first column.
 * @param m11 An element at a second row, second column.
 * @param m22 An element at a second row, third column.
 * @param m03 An element at a second row, forth column.
 * @param m20 An element at a third row, first column.
 * @param m21 An element at a third row, second column.
 * @param m22 An element at a third row, third column.
 * @param m23 An element at a third row, forth column.
 * @param m30 An element at a forth row, first column.
 * @param m31 An element at a forth row, second column.
 * @param m32 An element at a forth row, third column.
 * @param m33 An element at a forth row, forth column.
 */
fun mat4(
    m00: Float, m01: Float, m02: Float, m03: Float,
    m10: Float, m11: Float, m12: Float, m13: Float,
    m20: Float, m21: Float, m22: Float, m23: Float,
    m30: Float, m31: Float, m32: Float, m33: Float
): Mat4 = ImmutableMat4(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33)

/** Create a 4-dimensional matrix with a given initializer.
 * @param init Initialization function, accepts a zero based row index as a first parameter and a zero based col index
 * as a second parameter.  */
inline fun mat4(init: MatInitializer) = mat4(
    init(0, 0), init(0, 1), init(0, 2), init(0, 3),
    init(1, 0), init(1, 1), init(1, 2), init(1, 3),
    init(2, 0), init(2, 1), init(2, 2), init(2, 3),
    init(3, 0), init(3, 1), init(3, 2), init(3, 3)
)

private val IDENTITY_MAT_2 = mat2(1f, 0f, 0f, 1f)

/** Get an immutable instance of a 2-dimensional matrix. */
fun identityMat2() = IDENTITY_MAT_2

private val IDENTITY_MAT_3 = mat3(1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f)

/** Get an immutable instance of a 3-dimensional matrix. */
fun identityMat3() = IDENTITY_MAT_3

private val IDENTITY_MAT_4 = mat4(
    1f, 0f, 0f, 0f,
    0f, 1f, 0f, 0f,
    0f, 0f, 1f, 0f,
    0f, 0f, 0f, 1f
)

/** Get an immutable instance of a 4-dimensional matrix. */
fun identityMat4() = IDENTITY_MAT_4