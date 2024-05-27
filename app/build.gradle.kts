plugins {
  id("com.android.application") version "8.4.1"
  id("org.jetbrains.kotlin.android") version "1.9.0"
}

android {
  namespace = "com.example.hello"
  compileSdk = 34
  defaultConfig {
    minSdk = 34
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  implementation("androidx.activity:activity-compose:1.9.0")
  implementation("androidx.core:core-ktx:1.13.1")
}
