package com.burak.noteapp.android.viewmodels

import androidx.lifecycle.ViewModel
import com.burak.noteapp.presenter.NotePresenter

class AddNoteViewModel(private val presenter: NotePresenter) : ViewModel() {

    fun addNote(title: String, description: String, imageUrl: String? = null) {
        presenter.add(title, description, imageUrl)
    }
}