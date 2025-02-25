// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.google.devtools.ksp").version("1.6.10-1.0.4")
}
dependencies {
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.15.0")
}