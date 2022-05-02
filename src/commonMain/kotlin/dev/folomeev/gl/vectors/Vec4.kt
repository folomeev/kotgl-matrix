package dev.folomeev.gl.vectors

import dev.folomeev.gl.epsEquals

/** A 4-dimensional vector. */
abstract class Vec4 internal constructor() : Vec {
    abstract override fun copyOf(): Vec4

    override fun hashCode(): Int {
        return x.hashCode() xor
                (y.hashCode() xor 0x75A5A5A5) xor
                (z.hashCode() xor 0x5A5A5A5A) xor
                (w.hashCode() xor 0x76969696)
    }

    override fun equals(other: Any?): Boolean {
        return other is Vec &&
                x epsEquals other.x &&
                y epsEquals other.y &&
                z epsEquals other.z &&
                w epsEquals other.w
    }

    override fun toString() = "($x, $y, $z, $w)"

    /** Get the [x]-component of the vector. */
    operator fun component1() = x

    /** Get the [y]-component of the vector. */
    operator fun component2() = y

    /** Get the [z]-component of the vector. */
    operator fun component3() = z

    /** Get the [w]-component of the vector. */
    operator fun component4() = w
}