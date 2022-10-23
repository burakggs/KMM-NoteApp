package org.koin.sample.kmp

import com.burak.noteapp.di.dataModule
import com.burak.noteapp.di.dbModule
import org.koin.core.context.startKoin

fun initKoin() {
    // start Koin
    val koinApp = startKoin {
        modules(dbModule + dataModule)
    }.koin

    // load default users
    //koinApp.get<UserRepository>().addUsers(DefaultData.DEFAULT_USERS)
}