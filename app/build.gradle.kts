plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "edu.unikom.bottomnavigationhamid"
    compileSdk = 35 // Pastikan ini adalah versi SDK terbaru yang ingin Anda gunakan

    defaultConfig {
        applicationId = "edu.unikom.bottomnavigationhamid"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        // Direkomendasikan untuk menggunakan JavaVersion.VERSION_1_8 atau lebih tinggi
        // Jika Anda menggunakan Kotlin 1.6+ dan Android Gradle Plugin 7.0+,
        // defaultnya sudah Java 11.
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        // Sesuaikan dengan compileOptions Anda
        jvmTarget = "11"
    }
}

dependencies {
    // Dependensi yang sudah dideklarasikan di libs.versions.toml
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material) // Menggunakan versi dari libs.versions.toml
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx) // Menggunakan versi dari libs.versions.toml
    implementation(libs.androidx.navigation.ui.ktx)     // Menggunakan versi dari libs.versions.toml

    // Dependensi testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}