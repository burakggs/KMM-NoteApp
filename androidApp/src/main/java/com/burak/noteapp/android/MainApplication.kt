package com.burak.noteapp.android

import android.app.Application
import com.burak.noteapp.di.dataModule
import com.burak.noteapp.di.dbModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(dataModule + dbModule)
        }
    }
}