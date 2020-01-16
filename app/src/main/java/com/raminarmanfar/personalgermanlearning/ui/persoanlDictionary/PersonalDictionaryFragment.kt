package com.raminarmanfar.personalgermanlearning.ui.persoanlDictionary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raminarmanfar.personalgermanlearning.R

class PersonalDictionaryFragment : Fragment() {

    private lateinit var personalDictionaryViewModel: PersonalDictionaryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        personalDictionaryViewModel =
            ViewModelProviders.of(this).get(PersonalDictionaryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_personal_dictionary, container, false)
        val textView: TextView = root.findViewById(R.id.text_personal_dictionary)
        personalDictionaryViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}