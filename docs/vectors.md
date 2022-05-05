# Vectors
## Create a Vector
To create immutable instances use:
```kotlin
val immutableV2 = vec2(1f, 2f)
val immutableV3 = vec3(1f, 2f, 3f)
val immutableV4 = vec4(1f, 2f, 3f, 4f)
```
To create mutable instances:
```kotlin
val mutableV2 = mutableVec2(1f, 2f)
val mutableV3 = mutableVec3(1f, 2f, 3f)
val mutableV4 = mutableVec4(1f, 2f, 3f, 4f)
```
Create functions called without parameters return zero vectors:
```kotlin
val immutableV2 = vec2() // (0.0, 0.0)
val immutableV3 = vec3() // (0.0, 0.0, 0.0)
val immutableV4 = vec4() // (0.0, 0.0, 0.0, 0.0)
```
The same is true for mutable vectors:
```kotlin
val mutableV2 = mutableVec2() // (0.0, 0.0)
val mutableV3 = mutableVec3() // (0.0, 0.0, 0.0)
val mutableV4 = mutableVec4() // (0.0, 0.0, 0.0, 0.0)
```
Dedicated functions introduced to create unit vectors:
```kotlin
val immutableUnitX = vecUnitX() // (1.0, 0.0)
val immutableUnitY = vecUnitY() // (0.0, 1.0)
val immutableUnitZ = vecUnitX() // (0.0, 0.0, 1.0)
val immutableUnitW = vecUnitW() // (0.0, 0.0, 0.0, 1.0)
```
## Copy a vector
There is also a way to create a copy of an existing vector. Please notice, that copy of
immutable vector is the same instance
```kotlin
// immutableVec === immutableCopyVec
val immutableCopyVec = immutableVec.copyOf() 

// mutableVec == mutableCopyVec but mutableVec !== mutableCopyVec
val mutableCopyVec = mutableVec.copyOf() 
```
You can also use creation functions to change vector dimensions:
```kotlin
val immutableV2 = vec2(1f, 2f)                // (1.0, 2.0)
val immutableV3 = vec3(immutableV2, 3f)       // (1.0, 2.0, 3.0)
val immutableV4a = vec4(immutableV3, 4f)      // (1.0, 2.0, 3.0, 4.0)
val immutableV4b = vec4(immutableV2, 3f, 4f)  // (1.0, 2.0, 3.0, 4.0)
```
And for mutables
```kotlin
val mutableV2 = mutableVec2(1f, 2f)              // (1.0, 2.0)
val mutableV3 = mutableVec3(mutableV2, 3f)       // (1.0, 2.0, 3.0)
val mutableV4a = mutableVec4(mutableV3, 4f)      // (1.0, 2.0, 3.0, 4.0)
val mutableV4b = mutableVec4(mutableV2, 3f, 4f)  // (1.0, 2.0, 3.0, 4.0)
```
There is a conversion between mutables and immutables:
```kotlin
val immutableFromMutableVec = mutableVec.toImmutable()
val mutableFromImmutableVec = immutableVec.toMutable()
```

## Get a Vector Length
To calculate Euclidean vector length:
```kotlin
val length = vec.length()
```
or square of the length:
```kotlin
val sqrLength = vec.sqrLength()
```

## Get a distance Between Two Vectors
In a common sense the distance between two vectors a length of their subtraction,
but there is a more convinient wat to get the distance:
```kotlin
val distance = vecA.distance(vecB)
val sqrDistance = vecA.sqrDistance(vecB) // Returns a square of the distance
```

## Get a Dot Product

```kotlin
val dotProduct = vecA.dot(vecB)
```

## Mutate Vectors
It is allowed to modify each vector component by its names `(x, y, z, w)`:
```kotlin
mutableVec4().apply {
    x = 1f
    y = 2f
    z = 3f
    w = 4f   
}
```
or set values in a single call:
```kotlin
mutableV2.set(1f, 2f)
mutableV3.set(1f, 2f, 3f)
mutableV4.set(1f, 2f, 3f, 4f)
```
if you want to set same value to each component use `setAll()`:
```kotlin
mutableV2.setAll(5f) // (5.0, 5.0)
mutableV3.setAll(5f) // (5.0, 5.0, 5.0)
mutableV4.setAll(5f) // (5.0, 5.0, 5.0, 5.0)
```
## Negate vector
```kotlin
// Create a new mutable instance holding the result
val mutableVec = vec.negate()
```

```kotlin
// Put the result to mutableVec and return it
// mutableVec === negatedMutableVec
val negatedMutableVec = vec.negateTo(mutableVec)
```

```kotlin
// Perform the operation in-place
// mutableVec === negatedMutableVec
val negatedMutableVec = mutableVec.negateSelf()
```