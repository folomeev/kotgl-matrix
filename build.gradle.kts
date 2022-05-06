plugins {
    kotlin("multiplatform") version "1.6.20"
    id("org.jetbrains.dokka") version "1.6.20"
    `maven-publish`
    signing
}

group = "dev.folomeev.kotgl"
version = "0.0.1-beta"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(BOTH) {
        nodejs()
    }
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}

val javadocJar by tasks.registering(Jar::class) {
    dependsOn(tasks.dokkaHtml)
    archiveClassifier.set("javadoc")
    from(buildDir.resolve("dokka/html"))
}

publishing {
    repositories {
        maven {
            name = "sonatype"
            setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = project.properties["ossrhUsername"].toString()
                password = project.properties["ossrhPassword"].toString()
            }
        }

        publications.withType<MavenPublication> {
            artifact(javadocJar.get())

            pom {
                name.set("KotGL-Matrix")
                description.set("Multiplatform vectors and matrices library for WebGL and OpenGL.")
                url.set("https://github.com/folomeev/kotgl-matrix")

                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("folomeev")
                        name.set("Mikhail Folomeev")
                        email.set("maven@folomeev.dev")
                    }
                }
                scm {
                    url.set("https://github.com/folomeev/kotgl-matrix")
                }

            }
        }
    }
}

signing {
    sign(publishing.publications)
}