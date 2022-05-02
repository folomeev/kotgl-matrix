/** Set of methods to modify mutable matrices elements in a bunch. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.Mat2
import dev.folomeev.gl.matrices.Mat3
import dev.folomeev.gl.matrices.Mat4
import dev.folomeev.gl.matrices.reduce

/** Set all elements of the [this].
 * @param m00 An element at a first row, first column.
 * @param m01 An element at a first row, second column.
 * @param m10 An element at a second row, first column.
 * @param m11 An element at a second row, second column.
 * @return [this].
 */
fun MutableMat2.set(
    m00: Float, m01: Float,
    m10: Float, m11: Float
): MutableMat2 {
    this.m00 = m00
    this.m01 = m01
    this.m10 = m10
    this.m11 = m11
    return this
}

/** Set all elements of the [this].
 * @param m00 An element at a first row, first column.
 * @param m01 An element at a first row, second column.
 * @param m02 An element at a first row, third column.
 * @param m10 An element at a second row, first column.
 * @param m11 An element at a second row, second column.
 * @param m22 An element at a second row, third column.
 * @param m20 An element at a third row, first column.
 * @param m21 An element at a third row, second column.
 * @param m22 An element at a third row, third column.
 * @return [this].
 */
fun MutableMat3.set(
    m00: Float, m01: Float, m02: Float,
    m10: Float, m11: Float, m12: Float,
    m20: Float, m21: Float, m22: Float
): MutableMat3 {
    this.m00 = m00
    this.m01 = m01
    this.m02 = m02
    this.m10 = m10
    this.m11 = m11
    this.m12 = m12
    this.m20 = m20
    this.m21 = m21
    this.m22 = m22
    return this
}

/** Set all elements of the [this].
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
 * @return [this].
 */
fun MutableMat4.set(
    m00: Float, m01: Float, m02: Float, m03: Float,
    m10: Float, m11: Float, m12: Float, m13: Float,
    m20: Float, m21: Float, m22: Float, m23: Float,
    m30: Float, m31: Float, m32: Float, m33: Float
): MutableMat4 {
    this.m00 = m00
    this.m01 = m01
    this.m02 = m02
    this.m03 = m03
    this.m10 = m10
    this.m11 = m11
    this.m12 = m12
    this.m13 = m13
    this.m20 = m20
    this.m21 = m21
    this.m22 = m22
    this.m23 = m23
    this.m30 = m30
    this.m31 = m31
    this.m32 = m32
    this.m33 = m33
    return this
}

/** Copy elements of [other] matrix to [this].
 * @return [this]. */
fun MutableMat2.set(other: Mat2): MutableMat2 = other.reduce(this::set)

/** Copy elements of [other] matrix to [this].
 * @return [this]. */
fun MutableMat3.set(other: Mat3): MutableMat3 = other.reduce(this::set)

/** Copy elements of [other] matrix to [this].
 * @return [this]. */
fun MutableMat4.set(other: Mat4): MutableMat4 = other.reduce(this::set)

/** Set all elements of the [this] to the given [value].
 * @return [this] */
fun MutableMat2.setAll(value: Float) = set(value, value, value, value)

/** Set all elements of the [this] to the given [value].
 * @return [this] */
fun MutableMat3.setAll(value: Float) = set(value, value, value, value, value, value, value, value, value)

/** Set all elements of the [this] to the given [value].
 * @return [this] */
fun MutableMat4.setAll(value: Float) =
    set(value, value, value, value, value, value, value, value, value, value, value, value, value, value, value, value)