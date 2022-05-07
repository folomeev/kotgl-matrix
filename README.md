# KotGL-Matrix 

It's a Kotlin multiplatform Vectors and Matrices Library designed to be used
with GL libraries. 

## Features
- Ready to be used with JavaScript/WebGl and Java/OpenGL libraries.
- 2D and 3D support.
- Provides mutable and immutable structures.
- Build with performance in-mind.

## How to Use

Use Maven Central repository:

```groovy
repositories {
    mavenCentral()
}
```

And then include `dev.folomeev.kotgl:kotgl-matrix` library as dependency for common sources:

```groovy
kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation "dev.folomeev.kotgl:kotgl-matrix:0.0.1-beta"
            }
        }
    }
}
```

## See Also
- [How to Use Vectors](docs/vectors.md)