package com.burak.noteapp.di

import com.burak.noteapp.NoteAppDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import org.koin.core.module.Module
import org.koin.dsl.module

actual val dbModule: Module = module {
    single<SqlDriver> { NativeSqliteDriver(NoteAppDatabase.Schema, "noteApp.db") }
    single { NoteAppDatabase(get()) }
}