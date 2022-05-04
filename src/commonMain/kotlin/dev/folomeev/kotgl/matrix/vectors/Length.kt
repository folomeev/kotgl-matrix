/** Sets of methods to calculate Euclidean lengths. */
@file:kotlin.jvm.JvmName("Vectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.vectors

import dev.folomeev.kotgl.matrix.*

/** Calculate square value of Euclidean vector length, which is a sum of components squares. */
fun Vec2.sqrLength() = reduce(::sqrHypot2)

/** Calculate square value of Euclidean vector length, which is a sum of components squares. */
fun Vec3.sqrLength() = reduce(::sqrHypot3)

/** Calculate square value of Euclidean vector length, which is a sum of components squares. */
fun Vec4.sqrLength() = reduce(::sqrHypot4)

/** Calculate Euclidean vector length, which is square root of components squares sum. */
fun Vec2.length() = reduce(::hypot2)

/** Calculate Euclidean vector length, which is square root of components squares sum. */
fun Vec3.length() = reduce(::hypot3)

/** Calculate Euclidean vector length, which is square root of components squares sum. */
fun Vec4.length() = reduce(::hypot4)