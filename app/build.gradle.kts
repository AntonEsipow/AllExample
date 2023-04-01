plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.bigtoapps.test.allexample"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.bigtoapps.test.allexample"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.androidTestInstrumentation
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(AppDependencies.core)
    implementation(AppDependencies.composeLib)
    testImplementation(AppDependencies.unitTest)
    androidTestImplementation(AppDependencies.uiTests)
    debugImplementation(AppDependencies.composeDebug)
}
