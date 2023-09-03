package com.burak.noteapp.android.presentation

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.burak.noteapp.android.databinding.ActivityAddNoteBinding
import com.burak.noteapp.android.viewmodels.AddNoteViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddNoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddNoteBinding
    private val viewModel: AddNoteViewModel by viewModel()
    private var resultText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(AddNoteActivity::class.java.simpleName, "${savedInstanceState == null}")
        Log.i(AddNoteActivity::class.java.simpleName, "$resultText")
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.floatingActionButton.setOnClickListener {
            resultText = "Hello Again"
            Log.i(AddNoteActivity::class.java.simpleName, "$resultText")

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("TEST", "Hello")
    }
}