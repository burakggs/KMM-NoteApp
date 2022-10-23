package com.burak.noteapp.android.di

import com.burak.noteapp.android.viewmodels.AddNoteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    viewModel { AddNoteViewModel(get()) }
}