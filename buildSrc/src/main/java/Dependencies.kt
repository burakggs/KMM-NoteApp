object Dependencies {
    object SqlDelight {
        const val androidMain = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val iosMain = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
        const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"

    }

    object Koin {
        const val koinCommon = "io.insert-koin:koin-core:${Versions.koinVersion}"
        const val koinAnd = "io.insert-koin:koin-android:${Versions.koinVersion}"

    }

    object AndroidApp {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
        const val liveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"

    }
}

object Versions {
    const val sqlDelight = "1.5.3"
    const val appcompat = "1.5.1"
    const val constraintLayout = "2.1.4"
    const val lifecycle_version = "2.5.1"
    const val koinVersion = "3.2.2"
}