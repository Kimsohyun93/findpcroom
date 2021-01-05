package com.example.findpcroom.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.findpcroom.R
import com.example.findpcroom.databinding.FragmentListBinding
import com.example.findpcroom.databinding.FragmentMapBinding

class ListFragment : Fragment() {

    lateinit var binding: FragmentListBinding
    private lateinit var ListViewModel: ListViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        ListViewModel =
                ViewModelProvider(this).get(ListViewModel::class.java)
        binding = FragmentListBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}