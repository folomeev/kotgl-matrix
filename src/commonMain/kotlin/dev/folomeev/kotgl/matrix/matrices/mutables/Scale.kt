package dev.folomeev.kotgl.matrix.matrices.mutables

import dev.folomeev.kotgl.matrix.FloatMapping16
import dev.folomeev.kotgl.matrix.FloatMapping4
import dev.folomeev.kotgl.matrix.FloatMapping9
import dev.folomeev.kotgl.matrix.matrices.Mat2
import dev.folomeev.kotgl.matrix.matrices.Mat3
import dev.folomeev.kotgl.matrix.matrices.Mat4
import dev.folomeev.kotgl.matrix.vectors.Vec2
import dev.folomeev.kotgl.matrix.vectors.Vec3

/** Scale each row of [this] matrix by component of vector [v] and reduce the result by [out]. */
private fun <T> Mat2.scale(v: Vec2, out: FloatMapping4<T>) = v.let { (x, y) ->
    out(
        m00 * x, m01 * x,
        m10 * y, m11 * y
    )
}

/** Scale each row of [this] matrix by component of vector [v] and reduce the result by [out]. */
private fun <T> Mat3.scale(v: Vec2, out: FloatMapping9<T>) = v.let { (x, y) ->
    out(
        m00 * x, m01 * x, m02 * x,
        m10 * y, m11 * y, m12 * y,
        m20, m21, m22,
    )
}

/** Scale each row of [this] matrix by component of vector [v] and reduce the result by [out]. */
private fun <T> Mat4.scale(v: Vec3, out: FloatMapping16<T>) = v.let { (x, y, z) ->
    out(
        m00 * x, m01 * x, m02 * x, m03 * x,
        m10 * y, m11 * y, m12 * y, m13 * y,
        m20 * z, m21 * z, m22 * z, m23 * z,
        m30, m31, m32, m33
    )
}

/** Scale each row of [this] matrix by component of vector [v] and set the result in new instance of [MutableMat2]. */
fun Mat2.scale(v: Vec2) = scale(v, ::mutableMat2)

/** Scale each row of [this] matrix by component of vector [v] and set the result in new instance of [MutableMat3]. */
fun Mat3.scale(v: Vec2) = scale(v, ::mutableMat3)

/** Scale each row of [this] matrix by component of vector [v] and set the result in new instance of [MutableMat4]. */
fun Mat4.scale(v: Vec3) = scale(v, ::mutableMat4)

/** Scale each row of [this] matrix by component of vector [v] and set the result to [out]. */
fun Mat2.scaleTo(v: Vec2, out: MutableMat2) = scale(v, out::set)

/** Scale each row of [this] matrix by component of vector [v] and set the result to [out]. */
fun Mat3.scaleTo(v: Vec2, out: MutableMat3) = scale(v, out::set)

/** Scale each row of [this] matrix by component of vector [v] and set the result to [out]. */
fun Mat4.scaleTo(v: Vec3, out: MutableMat4) = scale(v, out::set)

/** Scale each row of [this] matrix by component of vector [v] and set the result to [this]. */
fun MutableMat2.scaleSelf(v: Vec2) = scaleTo(v, this)

/** Scale each row of [this] matrix by component of vector [v] and set the result to [this]. */
fun MutableMat3.scaleSelf(v: Vec2) = scaleTo(v, this)

/** Scale each row of [this] matrix by component of vector [v] and set the result to [this]. */
fun MutableMat4.scaleSelf(v: Vec3) = scaleTo(v, this)
