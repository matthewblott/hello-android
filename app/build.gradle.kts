plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.jetbrains.kotlin.android)
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
  lint {
    // Required to suppress 'Instantiation error':
    // https://stackoverflow.com/questions/41635131/gradle-getting-the-root-project-directory-path-when-starting-with-a-custom-buil
    lintConfig = file("$rootDir/lint.xml")
  }
}

dependencies {
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.core.ktx)
}
