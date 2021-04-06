plugins {
  id("java-library")
  id("kotlin")
  id("kotlin-kapt")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

@Suppress("AnnotationProcessorOnCompilePath")
dependencies {
  kapt("com.google.auto.service:auto-service:1.0-rc7")
  implementation("com.google.auto.service:auto-service:1.0-rc7")
  implementation("com.google.dagger:hilt-compiler:2.33-beta")
}
