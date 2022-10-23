package com.burak.noteapp.repository

import com.burak.noteapp.NoteAppDatabase
import com.burak.noteapp.sqldelight.NOTE
import com.burak.noteapp.sqldelight.NoteEntityQueries

class DataSourceImpl(private val database: NoteAppDatabase) : DataSource {
    private val entityQueries: NoteEntityQueries by lazy {
        database.noteEntityQueries
    }

    override fun addNote(title: String, desc: String, imageUrl: String?) {
        entityQueries.addNote(null, title, desc, imageUrl)
    }

    override fun getAllNotes(): List<NOTE> {
        return entityQueries.getAllNotes().executeAsList()
    }

    override fun deleteAllNotes() {
        entityQueries.deleteAllNotes()
    }
}