package com.raminarmanfar.personalgermanlearning.ui.persoanlDictionary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonalDictionaryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Personal Dictionary Fragment"
    }
    val text: LiveData<String> = _text
}