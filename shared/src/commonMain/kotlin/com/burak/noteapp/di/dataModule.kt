package com.burak.noteapp.di

import com.burak.noteapp.presenter.NotePresenter
import com.burak.noteapp.repository.DataSource
import com.burak.noteapp.repository.DataSourceImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val dataModule: Module = module {
    single<DataSource> { DataSourceImpl(get()) }
    single { NotePresenter(get()) }

}