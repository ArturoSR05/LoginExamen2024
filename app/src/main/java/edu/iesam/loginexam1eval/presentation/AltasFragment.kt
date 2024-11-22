package edu.iesam.loginexam1eval.presentation

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.iesam.loginexam1eval.databinding.ActivityMainBinding
import edu.iesam.loginexam1eval.domain.User

class AltasFragment: Fragment() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ActivityMainBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}