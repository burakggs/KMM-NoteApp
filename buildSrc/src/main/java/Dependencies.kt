object Dependencies {
    object SqlDelight {
        const val androidMain = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val iosMain = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
        const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"

    }
}

object Versions {
    const val sqlDelight = "1.5.3"
}