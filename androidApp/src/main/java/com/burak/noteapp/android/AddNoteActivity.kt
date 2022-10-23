package com.burak.noteapp.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.burak.noteapp.android.databinding.ActivityAddNoteBinding
import com.burak.noteapp.android.viewmodels.AddNoteViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddNoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddNoteBinding
    private val viewModel: AddNoteViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.addNote("Burak", "TestUser")

    }
}