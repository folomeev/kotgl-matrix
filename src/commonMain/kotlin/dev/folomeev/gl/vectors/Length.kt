/** Sets of methods to calculate Euclidean lengths. */
@file:kotlin.jvm.JvmName("Vectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors

import dev.folomeev.gl.hypot2
import dev.folomeev.gl.hypot3
import dev.folomeev.gl.hypot4
import dev.folomeev.gl.sqrHypot2
import dev.folomeev.gl.sqrHypot3
import dev.folomeev.gl.sqrHypot4

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