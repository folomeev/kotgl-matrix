/** Set of matrix map-reducing methods. */
@file:kotlin.jvm.JvmName("Matrices")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.matrices

import dev.folomeev.kotgl.matrix.*

/** Call [mapper] on each component of [this] then reduce the results by [reducer]. */
internal inline fun <T, R> Mat2.mapReduce(mapper: FloatMapping<T>, reducer: Mapping4<T, R>) =
    reducer(mapper(m00), mapper(m01), mapper(m10), mapper(m11))

/** Call [mapper] on each component of [this] then reduce the results by [reducer]. */
internal inline fun <T, R> Mat3.mapReduce(mapper: FloatMapping<T>, reducer: Mapping9<T, R>) =
    reducer(
        mapper(m00), mapper(m01), mapper(m02),
        mapper(m10), mapper(m11), mapper(m12),
        mapper(m20), mapper(m21), mapper(m22)
    )

/** Call [mapper] on each component of [this] then reduce the results by [reducer]. */
internal inline fun <T, R> Mat4.mapReduce(mapper: FloatMapping<T>, reducer: Mapping16<T, R>) =
    reducer(
        mapper(m00), mapper(m01), mapper(m02), mapper(m03),
        mapper(m10), mapper(m11), mapper(m12), mapper(m13),
        mapper(m20), mapper(m21), mapper(m22), mapper(m23),
        mapper(m30), mapper(m31), mapper(m32), mapper(m33)
    )

/** Call [mapper] on each component pair of [this] and [m] then reduce the results by [reducer].
 * @param m other matrix.
 * @param mapper accepts two float values, first parameter is a component of [this], second is a component of [m]. */
internal inline fun <T, R> Mat2.mapReduce(m: Mat2, mapper: FloatMapping2<T>, reducer: Mapping4<T, R>) =
    reducer(mapper(m00, m.m00), mapper(m01, m.m01), mapper(m10, m.m10), mapper(m11, m.m11))

/** Call [mapper] on each component pair of [this] and [m] then reduce the results by [reducer].
 * @param m other matrix.
 * @param mapper accepts two float values, first parameter is a component of [this], second is a component of [m]. */
internal inline fun <T, R> Mat3.mapReduce(m: Mat3, mapper: FloatMapping2<T>, reducer: Mapping9<T, R>) =
    reducer(
        mapper(m00, m.m00), mapper(m01, m.m01), mapper(m02, m.m02),
        mapper(m10, m.m10), mapper(m11, m.m11), mapper(m12, m.m12),
        mapper(m20, m.m20), mapper(m21, m.m21), mapper(m22, m.m22)
    )

/** Call [mapper] on each component pair of [this] and [m] then reduce the results by [reducer].
 * @param m other matrix.
 * @param mapper accepts two float values, first parameter is a component of [this], second is a component of [m]. */
internal inline fun <T, R> Mat4.mapReduce(m: Mat4, mapper: FloatMapping2<T>, reducer: Mapping16<T, R>) =
    reducer(
        mapper(m00, m.m00), mapper(m01, m.m01), mapper(m02, m.m02), mapper(m03, m.m03),
        mapper(m10, m.m10), mapper(m11, m.m11), mapper(m12, m.m12), mapper(m13, m.m13),
        mapper(m20, m.m20), mapper(m21, m.m21), mapper(m22, m.m22), mapper(m23, m.m23),
        mapper(m30, m.m30), mapper(m31, m.m31), mapper(m32, m.m32), mapper(m33, m.m33)
    )
