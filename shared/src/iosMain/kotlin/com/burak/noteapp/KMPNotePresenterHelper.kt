package org.koin.sample.kmp

import com.burak.noteapp.presenter.NotePresenter
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KMPNotePresenterHelper : KoinComponent {

    private val notePresenter: NotePresenter by inject()

    //fun sayHello(): String = userPresenter.sayHello()

}