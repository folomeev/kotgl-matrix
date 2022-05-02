/** Set of methods to calculate vectors dot product. */
@file:kotlin.jvm.JvmName("Vectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors

import dev.folomeev.gl.sumOf2
import dev.folomeev.gl.sumOf3
import dev.folomeev.gl.sumOf4

/** Calculate dot product: `([this].x * [b].x + [this].y * [b].y)`. */
fun Vec2.dot(b: Vec2) = mapReduce(b, Float::times, ::sumOf2)

/** Calculate dot product: `([this].x * [b].x + [this].y * [b].y + [this].z * [b].z)`. */
fun Vec3.dot(b: Vec3) = mapReduce(b, Float::times, ::sumOf3)

/** Calculate dot product: `([this].x * [b].x + [this].y * [b].y + [this].z * [b].z + [this].w * [b].w)`. */
fun Vec4.dot(b: Vec4) = mapReduce(b, Float::times, ::sumOf4)
