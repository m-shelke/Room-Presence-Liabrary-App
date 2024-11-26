import android.databinding.tool.writer.ViewBinding

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.roompresenceliabraryapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.roompresenceliabraryapp"
        minSdk = 24
        targetSdk = 34
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

    buildFeatures{
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}


dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

//The Room persistence library Dependency. Read Documentation
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)

}