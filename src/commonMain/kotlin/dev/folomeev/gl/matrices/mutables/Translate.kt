/** Set of matrix translating methods. */
@file:kotlin.jvm.JvmName("MutableMatrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.FloatMapping16
import dev.folomeev.gl.FloatMapping9
import dev.folomeev.gl.matrices.Mat3
import dev.folomeev.gl.matrices.Mat4
import dev.folomeev.gl.vectors.Vec2
import dev.folomeev.gl.vectors.Vec3

/** Translate [this] matrix by vector [v] and reduce result by [out]. */
private fun <T> Mat3.translate(v: Vec2, out: FloatMapping9<T>) = v.let { (x, y) ->
    out(
        m00, m01, m02,
        m10, m11, m12,
        x * m00 + y * m10 + m20, x * m01 + y * m11 + m21, x * m02 + y * m12 + m22
    )
}

/** Translate [this] matrix by vector [v] and reduce result by [out]. */
private fun <T> Mat4.translate(v: Vec3, out: FloatMapping16<T>) = v.let { (x, y, z) ->
    out(
        m00, m01, m02, m03,
        m10, m11, m12, m13,
        m20, m21, m22, m23,
        x * m00 + y * m10 + z * m20 + m30, x * m01 + y * m11 + z * m21 + m31,
        x * m02 + y * m12 + z * m22 + m32, x * m03 + y * m13 + z * m23 + m33
    )
}

/** Translate [this] matrix by vector [v] and set result to a new [MutableMat3].*/
fun Mat3.translate(v: Vec2) = translate(v, ::mutableMat3)

/** Translate [this] matrix by vector [v] and set result to a new [MutableMat4].*/
fun Mat4.translate(v: Vec3) = translate(v, ::mutableMat4)

/** Translate [this] matrix by vector [v] and set result to [out].
 * @return [out]. */
fun Mat3.translateTo(v: Vec2, out: MutableMat3) =
    if (this === out) {
        out.translateSelf(v)
    } else {
        translate(v, out::set)
    }

/** Translate [this] matrix by vector [v] and set result to [out].
 * @return [out]. */
fun Mat4.translateTo(v: Vec3, out: MutableMat4) =
    if (this === out) {
        out.translateSelf(v)
    } else {
        translate(v, out::set)
    }

/** Translate [this] matrix by vector [v] in-place.
 * @return [this]. */
fun MutableMat3.translateSelf(v: Vec2) =
    v.let { (x, y) ->
        m20 += x * m00 + y * m10
        m21 += x * m01 + y * m11
        m22 += x * m02 + y * m12
        this
    }

/** Translate [this] matrix by vector [v] in-place.
 * @return [this]. */
fun MutableMat4.translateSelf(v: Vec3) =
    v.let { (x, y, z) ->
        m30 += x * m00 + y * m10 + z * m20
        m31 += x * m01 + y * m11 + z * m21
        m32 += x * m02 + y * m12 + z * m22
        m33 += x * m03 + y * m13 + z * m23
        this
    }
