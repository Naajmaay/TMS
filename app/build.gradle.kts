plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.a1634201903271905024191606189796189579_tenantmanagementlab2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.a1634201903271905024191606189796189579_tenantmanagementlab2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.activity:activity-ktx:1.9.3")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}