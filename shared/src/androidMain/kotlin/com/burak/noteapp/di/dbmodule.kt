package com.burak.noteapp.di

import com.burak.noteapp.NoteAppDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module


actual val dbModule: Module = module {
    single<SqlDriver> {
        AndroidSqliteDriver(
            NoteAppDatabase.Schema,
            androidContext(),
            "noteApp.db"
        )
    }
    single { NoteAppDatabase(get()) }
}