package com.example.brandat.ui.fragments.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.example.brandat.R
import com.example.brandat.ui.ProductActivity

class HomeFragment : Fragment() {

    lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_home, container, false)

        button = view.findViewById(R.id.button)

        button.setOnClickListener {
            //findNavController().navigate(R.id.action_homeFragment_to_productDetailsFragment)

            var intent:Intent
            intent = Intent(requireActivity(), ProductActivity::class.java)
            startActivity(intent)

        }

        return view
    }

}