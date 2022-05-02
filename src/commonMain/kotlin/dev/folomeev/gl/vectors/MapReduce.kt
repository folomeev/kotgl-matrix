/** A set of methods, reducing all mutated vectors components to a single object. */
@file:kotlin.jvm.JvmName("Vectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors

import dev.folomeev.gl.FloatMapping
import dev.folomeev.gl.FloatMapping2
import dev.folomeev.gl.Mapping2
import dev.folomeev.gl.Mapping3
import dev.folomeev.gl.Mapping4

/** Call [map] on [Vec2.x] and [Vec2.y] components and then call [reduce] accepting results of the mappings. */
internal inline fun <T, R> Vec2.mapReduce(map: FloatMapping<T>, reduce: Mapping2<T, R>) = reduce(map(x), map(y))

/** Call [map] on [Vec3.x], [Vec3.y], and [Vec3.z] components and then call [reduce] accepting results of the
 * mappings. */
internal inline fun <T, R> Vec3.mapReduce(map: FloatMapping<T>, reduce: Mapping3<T, R>) =
    reduce(map(x), map(y), map(z))

/** Call [map] on [Vec4.x], [Vec4.y], [Vec4.z], and [Vec4.w] components and then call [reduce] accepting results of
 * the mappings. */
internal inline fun <T, R> Vec4.mapReduce(map: FloatMapping<T>, reduce: Mapping4<T, R>) =
    reduce(map(x), map(y), map(z), map(w))

/** Call [map] on pairs ([Vec2.x], [b].x) and ([Vec2.y], [b].y) and then call [reduce] accepting results of the
 * mappings. */
internal inline fun <T, R> Vec2.mapReduce(b: Vec2, map: FloatMapping2<T>, reduce: Mapping2<T, R>) =
    reduce(map(x, b.x), map(y, b.y))

/** Call [map] on pairs ([Vec3.x], [b].x), ([Vec3.y], [b].y), and ([Vec3.z], [b].z) and then call [reduce] accepting
 * results of the mappings. */
internal inline fun <T, R> Vec3.mapReduce(b: Vec3, map: FloatMapping2<T>, reduce: Mapping3<T, R>) =
    reduce(map(x, b.x), map(y, b.y), map(z, b.z))

/** Call [map] on pairs ([Vec4.x], [b].x), ([Vec4.y], [b].y), ([Vec4.z], [b].z), and ([Vec4.w], [b].w) and then call
 * [reduce] accepting results of the mappings. */
internal inline fun <T, R> Vec4.mapReduce(b: Vec4, map: FloatMapping2<T>, reduce: Mapping4<T, R>) =
    reduce(map(x, b.x), map(y, b.y), map(z, b.z), map(w, b.w))
