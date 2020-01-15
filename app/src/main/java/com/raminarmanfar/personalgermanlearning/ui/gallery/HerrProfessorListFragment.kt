package com.raminarmanfar.personalgermanlearning.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raminarmanfar.personalgermanlearning.R

class HerrProfessorListFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_herr_professor_list, container, false)
        val textView: TextView = root.findViewById(R.id.text_herr_professor)
        galleryViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}