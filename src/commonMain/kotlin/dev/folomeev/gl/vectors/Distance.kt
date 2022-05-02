/** Sets of methods to calculate Euclidean distances between vectors. */
@file:kotlin.jvm.JvmName("Vectors")
@file:kotlin.jvm.JvmMultifileClass

package dev.folomeev.gl.vectors

import dev.folomeev.gl.hypot2
import dev.folomeev.gl.hypot3
import dev.folomeev.gl.hypot4
import dev.folomeev.gl.sqrHypot2
import dev.folomeev.gl.sqrHypot3
import dev.folomeev.gl.sqrHypot4

/** Calculate Euclidean distance between [this] vector and [b].
 *
 * Distance is `sqrt((x2 - x1)^2 + (y2 - y1)^2)`. */
fun Vec2.distance(b: Vec2) = mapReduce(b, Float::minus, ::hypot2)

/** Calculate Euclidean distance between [this] vector and [b].
 *
 * Distance is `sqrt((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)`. */
fun Vec3.distance(b: Vec3) = mapReduce(b, Float::minus, ::hypot3)

/** Calculate Euclidean distance between [this] vector and [b].
 *
 * Distance is `sqrt((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2 + (w2 - w1)^2)`. */
fun Vec4.distance(b: Vec4) = mapReduce(b, Float::minus, ::hypot4)

/** Calculate square of Euclidean distance between [this] vector and [b]..
 *
 * Square distance is `((x2 - x1)^2 + (y2 - y1)^2)`. */
fun Vec2.sqrDistance(b: Vec2) = mapReduce(b, Float::minus, ::sqrHypot2)

/** Calculate square of Euclidean distance between [this] vector and [b]..
 *
 * Square distance is `((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)`. */
fun Vec3.sqrDistance(b: Vec3) = mapReduce(b, Float::minus, ::sqrHypot3)

/** Calculate square of Euclidean distance between [this] vector and [b]..
 *
 * Square distance is `((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2 + (w2 - w1)^2)`. */
fun Vec4.sqrDistance(b: Vec4) = mapReduce(b, Float::minus, ::sqrHypot4)