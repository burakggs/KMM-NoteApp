package com.burak.noteapp.repository

import com.burak.noteapp.sqldelight.NOTE

interface DataSource {
    fun addNote(title: String, desc: String, imageUrl: String?=null)
    fun getAllNotes(): List<NOTE>
    fun deleteAllNotes()
}