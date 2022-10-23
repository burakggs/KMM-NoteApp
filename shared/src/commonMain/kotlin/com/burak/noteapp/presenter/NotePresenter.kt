package com.burak.noteapp.presenter

import com.burak.noteapp.repository.DataSource

class NotePresenter(val dataSource: DataSource) {

    fun add(title: String, desc: String, imageUrl: String? = null): String? {
        dataSource.addNote(title, desc, imageUrl)
        val list = dataSource.getAllNotes()
        return list[0].description
    }

    fun deleteAllNotes() {
        dataSource.deleteAllNotes()
    }
}