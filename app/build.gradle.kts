plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.bmi_calculator"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.bmi_calculator"
        minSdk = 26
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
//    androidTestImplementation(libs.ext.junit)
//    androidTestImplementation(libs.espresso.core)
    androidTestImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")

    // Add JUnit Jupiter Engine for test runtime
    androidTestImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}