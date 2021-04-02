plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  implementation("androidx.navigation:navigation-compose:1.0.0-alpha09")
  implementation("androidx.hilt:hilt-navigation-compose:1.0.0-alpha01")
}