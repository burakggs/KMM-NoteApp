package com.burak.noteapp.android

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.burak.noteapp.android.databinding.ActivityAddNoteBinding
import com.burak.noteapp.android.viewmodels.AddNoteViewModel
import com.burak.noteapp.presenter.NotePresenter
import org.koin.android.ext.android.inject

class AddNoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddNoteBinding
    private lateinit var viewModel: AddNoteViewModel
    private val presenter: NotePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(AddNoteViewModel::class.java)

        presenter.deleteAllNotes()
        val desc = presenter.add("Title", "Descriptionn1")
        desc?.let {
            Log.i("::::LOGG", desc)
        }

    }
}