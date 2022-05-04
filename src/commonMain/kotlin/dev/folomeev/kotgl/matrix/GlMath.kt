package dev.folomeev.kotgl.matrix

import kotlin.math.hypot

/** Compare two floating-point values.
 *
 * @receiver left side value.
 * @param other right side value.
 * @return `true` if [other] value is close enough to [this] value.
 */
internal expect infix fun Float.epsEquals(other: Float): Boolean

/** Calculates sqrt(x^2 + y^2) without overflow/underflow. */
internal fun hypot2(x: Float, y: Float) = hypot(x, y)

/** Calculates sqrt(x^2 + y^2 + z^2) without overflow/underflow. */
internal expect fun hypot3(x: Float, y: Float, z: Float): Float

/** Calculates sqrt(x^2 + y^2 + z^2 + w^2) without overflow/underflow. */
internal expect fun hypot4(x: Float, y: Float, z: Float, w: Float): Float

/** Calculates (x^2 + y^2) without overflow/underflow. */
internal fun sqrHypot2(x: Float, y: Float) = x * x + y * y

/** Calculates (x^2 + y^2 + z^2) without overflow/underflow. */
internal fun sqrHypot3(x: Float, y: Float, z: Float) = x * x + y * y + z * z

/** Calculates (x^2 + y^2 + z^2 + w^2) without overflow/underflow. */
internal fun sqrHypot4(x: Float, y: Float, z: Float, w: Float) = x * x + y * y + z * z + w * w

/** Calculate sum of all given params. */
internal fun sumOf2(x: Float, y: Float) = x + y

/** Calculate sum of all given params. */
internal fun sumOf3(x: Float, y: Float, z: Float) = x + y + z

/** Calculate sum of all given params. */
internal fun sumOf4(x: Float, y: Float, z: Float, w: Float) = x + y + z + w

/** A function accepting a single parameter of type T, returns an object of type R. */
internal typealias Mapping<T, R> = (T) -> R
/** A function accepting two parameters of type T, returns an object of type R. */
internal typealias Mapping2<T, R> = (T, T) -> R
/** A function accepting three parameters of type T, returns an object of type R. */
internal typealias Mapping3<T, R> = (T, T, T) -> R
/** A function accepting four parameters of type T, returns an object of type R. */
internal typealias Mapping4<T, R> = (T, T, T, T) -> R
/** A function accepting nine parameters of type T, returns an object of type R. */
internal typealias Mapping9<T, R> = (T, T, T, T, T, T, T, T, T) -> R
/** A function accepting sixteen parameters of type T, returns an object of type R. */
internal typealias Mapping16<T, R> = (T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T) -> R

/** A function accepting a single float parameter, returns an object of type T. */
internal typealias FloatMapping<T> = Mapping<Float, T>
/** A function accepting two float parameters, returns an object of type T. */
internal typealias FloatMapping2<T> = Mapping2<Float, T>
/** A function accepting three float parameters, returns an object of type T. */
internal typealias FloatMapping3<T> = Mapping3<Float, T>
/** A function accepting four float parameters, returns an object of type T. */
internal typealias FloatMapping4<T> = Mapping4<Float, T>
/** A function accepting nine float parameters, returns an object of type T. */
internal typealias FloatMapping9<T> = Mapping9<Float, T>
/** A function accepting sixteen float parameters, returns an object of type T. */
internal typealias FloatMapping16<T> = Mapping16<Float, T>