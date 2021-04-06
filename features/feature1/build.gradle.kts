plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
}

android {
  compileSdkVersion(30)

  defaultConfig {
    minSdkVersion(21)
    targetSdkVersion(30)
  }

  buildFeatures {
    compose = true
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  composeOptions {
    kotlinCompilerExtensionVersion = "1.0.0-beta03"
  }
}

dependencies {
  implementation(project(":utils:compose-navigation"))
  implementation("androidx.compose.ui:ui:1.0.0-beta03")
  implementation("androidx.compose.foundation:foundation:1.0.0-beta03")
  implementation("androidx.compose.material:material:1.0.0-beta03")
  implementation("androidx.compose.runtime:runtime-livedata:1.0.0-beta03")
  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
  implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
  implementation("androidx.navigation:navigation-compose:1.0.0-alpha09")
  implementation("androidx.hilt:hilt-navigation-compose:1.0.0-alpha01")

  // Dagger
  implementation("com.google.dagger:dagger:2.33")
  implementation("com.google.dagger:hilt-android:2.33-beta")
  kapt("com.google.dagger:dagger-compiler:2.33")
  kapt("com.google.dagger:hilt-compiler:2.33-beta")
  kapt(project(":utils:compose-navigation-compiler"))
}
