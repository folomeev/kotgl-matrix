/** Set of matrix rotating methods. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.FloatMapping16
import dev.folomeev.gl.FloatMapping4
import dev.folomeev.gl.FloatMapping9
import dev.folomeev.gl.matrices.Mat2
import dev.folomeev.gl.matrices.Mat3
import dev.folomeev.gl.matrices.Mat4
import kotlin.math.cos
import kotlin.math.sin

private inline fun <T> Float.cosSin(receiver: (Float, Float) -> T) = receiver(cos(this), sin(this))

/** Rotate [this] by the [angle] given in radians, reduce results by [reducer]. */
private fun <T> Mat2.rotate(angle: Float, reducer: FloatMapping4<T>): T =
    angle.cosSin { cos, sin ->
        reducer(
            m00 * cos + m10 * sin,
            m01 * cos + m11 * sin,
            m10 * cos - m00 * sin,
            m11 * cos - m01 * sin
        )
    }

/** Rotate [this] around 0Z axis by the [angle] given in radians, reduce results by [reducer]. */
private fun <T> Mat3.rotateZ(angle: Float, reducer: FloatMapping9<T>): T {
    return angle.cosSin { cos, sin ->
        reducer(
            cos * m00 + sin * m10,
            cos * m01 + sin * m11,
            cos * m02 + sin * m12,
            cos * m10 - sin * m00,
            cos * m11 - sin * m01,
            cos * m12 - sin * m02,
            m20,
            m21,
            m22
        )
    }
}

/** Rotate [this] around 0X axis by the [angle] given in radians, reduce results by [reducer]. */
private fun <T> Mat4.rotateX(angle: Float, reducer: FloatMapping16<T>): T =
    angle.cosSin { cos, sin ->
        reducer(
            m00, m01, m02, m03,
            m10 * cos + m20 * sin, m11 * cos + m21 * sin, m12 * cos + m22 * sin, m13 * cos + m23 * sin,
            m20 * cos - m10 * sin, m21 * cos - m11 * sin, m22 * cos - m12 * sin, m23 * cos - m13 * sin,
            m30, m31, m32, m33,
        )
    }

/** Rotate [this] around 0Y axis by the [angle] given in radians, reduce results by [reducer]. */
private fun <T> Mat4.rotateY(angle: Float, reducer: FloatMapping16<T>): T =
    angle.cosSin { cos, sin ->
        reducer(
            m00 * cos - m20 * sin, m01 * cos - m21 * sin, m02 * cos - m22 * sin, m03 * cos - m23 * sin,
            m10, m11, m12, m13,
            m00 * sin + m20 * cos, m01 * sin + m21 * cos, m02 * sin + m22 * cos, m03 * sin + m23 * cos,
            m30, m31, m32, m33,
        )
    }

/** Rotate [this] around 0Z axis by the [angle] given in radians, reduce results by [reducer]. */
private fun <T> Mat4.rotateZ(angle: Float, reducer: FloatMapping16<T>): T =
    angle.cosSin { cos, sin ->
        reducer(
            m00 * cos + m10 * sin, m01 * cos + m11 * sin, m02 * cos + m12 * sin, m03 * cos + m13 * sin,
            m10 * cos - m00 * sin, m11 * cos - m01 * sin, m12 * cos - m02 * sin, m13 * cos - m03 * sin,
            m20, m21, m22, m23,
            m30, m31, m32, m33,
        )
    }

/** Rotate [this] by the [angle] given in radians, set result to a new [MutableMat2]. */
fun Mat2.rotate(angle: Float) = rotate(angle, ::mutableMat2)

/** Rotate [this] by then [angle] given in radians, set result to a new [MutableMat2]. */
fun Mat2.rotate(angle: Double) = rotate(angle.toFloat())


/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to a new [MutableMat3]. */
fun Mat3.rotate(angle: Float) = rotateZ(angle, ::mutableMat3)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to a new [MutableMat3]. */
fun Mat3.rotate(angle: Double) = rotate(angle.toFloat())

/** Rotate [this] around 0X axis by the [angle] given in radians, set result to a new [MutableMat4]. */
fun Mat4.rotateX(angle: Float) = rotateX(angle, ::mutableMat4)

/** Rotate [this] around 0X axis by the [angle] given in radians, set result to a new [MutableMat4]. */
fun Mat4.rotateX(angle: Double) = rotateX(angle.toFloat())

/** Rotate [this] around 0Y axis by the [angle] given in radians, set result to a new [MutableMat4]. */
fun Mat4.rotateY(angle: Float) = rotateY(angle, ::mutableMat4)

/** Rotate [this] around 0Y axis by the [angle] given in radians, set result to a new [MutableMat4]. */
fun Mat4.rotateY(angle: Double) = rotateY(angle.toFloat())

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to a new [MutableMat4]. */
fun Mat4.rotateZ(angle: Float) = rotateZ(angle, ::mutableMat4)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to a new [MutableMat4]. */
fun Mat4.rotateZ(angle: Double) = rotateZ(angle.toFloat())

/** Rotate [this] by the [angle] given in radians, set result to [out]. */
fun Mat2.rotateTo(angle: Float, out: MutableMat2) = rotate(angle, out::set)

/** Rotate [this] by the [angle] given in radians, set result to [out]. */
fun Mat2.rotateTo(angle: Double, out: MutableMat2) = rotateTo(angle.toFloat(), out)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [out]. */
fun Mat3.rotateTo(angle: Float, out: MutableMat3) = rotateZ(angle, out::set)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [out]. */
fun Mat3.rotateTo(angle: Double, out: MutableMat3) = rotateTo(angle.toFloat(), out)

/** Rotate [this] around 0X axis by the [angle] given in radians, set result to [out]. */
fun Mat4.rotateXTo(angle: Float, out: MutableMat4) = rotateX(angle, out::set)

/** Rotate [this] around 0X axis by the [angle] given in radians, set result to [out]. */
fun Mat4.rotateXTo(angle: Double, out: MutableMat4) = rotateXTo(angle.toFloat(), out)

/** Rotate [this] around 0Y axis by the [angle] given in radians, set result to [out]. */
fun Mat4.rotateYTo(angle: Float, out: MutableMat4) = rotateY(angle, out::set)

/** Rotate [this] around 0Y axis by the [angle] given in radians, set result to [out]. */
fun Mat4.rotateYTo(angle: Double, out: MutableMat4) = rotateYTo(angle.toFloat(), out)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [out]. */
fun Mat4.rotateZTo(angle: Float, out: MutableMat4) = rotateZ(angle, out::set)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [out]. */
fun Mat4.rotateZTo(angle: Double, out: MutableMat4) = rotateZTo(angle.toFloat(), out)

/** Rotate [this] by the [angle] given in radians, set result to [this]. */
fun MutableMat2.rotateSelf(angle: Float) = rotate(angle, this::set)

/** Rotate [this] by the [angle] given in radians, set result to [this]. */
fun MutableMat2.rotateSelf(angle: Double) = rotateSelf(angle.toFloat())

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [this]. */
fun MutableMat3.rotateSelf(angle: Float) = rotateZ(angle, this::set)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [this]. */
fun MutableMat3.rotateSelf(angle: Double) = rotateSelf(angle.toFloat())

/** Rotate [this] around 0X axis by the [angle] given in radians, set result to [this]. */
fun MutableMat4.rotateXSelf(angle: Float) = rotateX(angle, this::set)

/** Rotate [this] around 0X axis by the [angle] given in radians, set result to [this]. */
fun MutableMat4.rotateXSelf(angle: Double) = rotateXSelf(angle.toFloat())

/** Rotate [this] around 0Y axis by the [angle] given in radians, set result to [this]. */
fun MutableMat4.rotateYSelf(angle: Float) = rotateY(angle, this::set)

/** Rotate [this] around 0Y axis by the [angle] given in radians, set result to [this]. */
fun MutableMat4.rotateYSelf(angle: Double) = rotateYSelf(angle.toFloat())

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [this]. */
fun MutableMat4.rotateZSelf(angle: Float) = rotateZ(angle, this::set)

/** Rotate [this] around 0Z axis by the [angle] given in radians, set result to [this]. */
fun MutableMat4.rotateZSelf(angle: Double) = rotateZSelf(angle.toFloat())
