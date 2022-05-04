/** Set of methods instantiating mutable matrices. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.matrices.*

/** Create a mutable 2-dimensional matrix from [this] matrix. */
fun Mat2.toMutable(): MutableMat2 = reduce(::mutableMat2)

/** Create a mutable 3-dimensional matrix from [this] matrix. */
fun Mat3.toMutable(): MutableMat3 = reduce(::mutableMat3)

/** Create a mutable 4-dimensional matrix from [this] matrix. */
fun Mat4.toMutable(): MutableMat4 = reduce(::mutableMat4)

/** Create a new 2-dimensional matrix from the mutable matrix. */
fun MutableMat2.toImmutable(): Mat2 = reduce(::mat2)

/** Create a new 3-dimensional matrix from the mutable matrix. */
fun MutableMat3.toImmutable(): Mat3 = reduce(::mat3)

/** Create a new 4-dimensional matrix from the mutable matrix. */
fun MutableMat4.toImmutable(): Mat4 = reduce(::mat4)

/** Create a mutable 2-dimensional matrix from given values.
 * @param m00 An element at a first row, first column.
 * @param m01 An element at a first row, second column.
 * @param m10 An element at a second row, first column.
 * @param m11 An element at a second row, second column.
 */
fun mutableMat2(
    m00: Float, m01: Float,
    m10: Float, m11: Float
): MutableMat2 = MutableMat2.Implementation(m00, m01, m10, m11)

/** Create a mutable 2-dimensional matrix from values of the [src] matrix. */
fun mutableMat2(src: Mat2): MutableMat2 = src.reduce(::mutableMat2)

/** Create a mutable 2-dimensional matrix with a given initializer.
 * @param init Initialization function, accepts a zero based row index as a first parameter and a zero based col index
 * as a second parameter. */
inline fun mutableMat2(init: MatInitializer) = mutableMat2(
    init(0, 0), init(0, 1),
    init(1, 0), init(1, 1)
)

/** Create a mutable 3-dimensional matrix from given values.
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
fun mutableMat3(
    m00: Float, m01: Float, m02: Float,
    m10: Float, m11: Float, m12: Float,
    m20: Float, m21: Float, m22: Float
): MutableMat3 = MutableMat3.Implementation(m00, m01, m02, m10, m11, m12, m20, m21, m22)

/** Create a mutable 3-dimensional matrix from values of the [src] matrix. */
fun mutableMat3(src: Mat3): MutableMat3 = src.reduce(::mutableMat3)

/** Create a mutable 3-dimensional matrix with a given initializer.
 * @param init Initialization function, accepts a zero based row index as a first parameter and a zero based col index
 * as a second parameter.  */
inline fun mutableMat3(init: MatInitializer) = mutableMat3(
    init(0, 0), init(0, 1), init(0, 2),
    init(1, 0), init(1, 1), init(1, 2),
    init(2, 0), init(2, 1), init(2, 2)
)

/** Create a mutable 4-dimensional matrix from given values.
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
fun mutableMat4(
    m00: Float, m01: Float, m02: Float, m03: Float,
    m10: Float, m11: Float, m12: Float, m13: Float,
    m20: Float, m21: Float, m22: Float, m23: Float,
    m30: Float, m31: Float, m32: Float, m33: Float
): MutableMat4 = MutableMat4.Implementation(
    m00, m01, m02, m03,
    m10, m11, m12, m13,
    m20, m21, m22, m23,
    m30, m31, m32, m33
)

/** Create a mutable 4-dimensional matrix from values of the [src] matrix. */
fun mutableMat4(src: Mat4): MutableMat4 = src.reduce(::mutableMat4)

/** Create a mutable 4-dimensional matrix with a given initializer.
 * @param init Initialization function, accepts a zero based row index as a first parameter and a zero based col index
 * as a second parameter.  */
inline fun mutableMat4(init: MatInitializer) = mutableMat4(
    init(0, 0), init(0, 1), init(0, 2), init(0, 3),
    init(1, 0), init(1, 1), init(1, 2), init(1, 3),
    init(2, 0), init(2, 1), init(2, 2), init(2, 3),
    init(3, 0), init(3, 1), init(3, 2), init(3, 3)
)