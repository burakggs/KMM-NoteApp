package com.burak.noteapp.android.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.burak.noteapp.presenter.NotePresenter

class AddNoteViewModel(private val presenter: NotePresenter, private val savedStateHandle: SavedStateHandle) : ViewModel() {

    fun addNote(title: String, description: String, imageUrl: String? = null) {
        presenter.add(title, description, imageUrl)
    }

    /*

        public void setQuery(CharSequence query) {
        // Save the user's query into the SavedStateHandle.
        // This ensures that we retain the value across process death
        // and is used as the input into the Transformations.switchMap above
        mSavedStateHandler.set(QUERY_KEY, query);
    }
     */
}