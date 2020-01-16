package com.raminarmanfar.personalgermanlearning.ui.herrProfessorList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HerrProfessorListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Herr Professor List Fragment"
    }
    val text: LiveData<String> = _text
}