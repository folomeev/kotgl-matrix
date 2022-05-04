/** A set of methods, reducing all vector components to a single object. */
@file:kotlin.jvm.JvmName("Vectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.kotgl.matrix.vectors

import dev.folomeev.kotgl.matrix.FloatMapping2
import dev.folomeev.kotgl.matrix.FloatMapping3
import dev.folomeev.kotgl.matrix.FloatMapping4

/** Call [f] on [Vec2.x] and [Vec2.y] components and return it's result. */
internal inline fun <T> Vec2.reduce(f: FloatMapping2<T>) = f(x, y)

/** Call [f] on [Vec3.x], [Vec3.y], and [Vec3.z] components and return it's result. */
internal inline fun <T> Vec3.reduce(f: FloatMapping3<T>) = f(x, y, z)

/** Call [f] on [Vec4.x], [Vec4.y], [Vec4.z], and [Vec4.w] components and return it's result. */
internal inline fun <T> Vec4.reduce(f: FloatMapping4<T>) = f(x, y, z, w)
