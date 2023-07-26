package com.example.ec3_solorzano_diego.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ec3_solorzano_diego.R
import com.example.ec3_solorzano_diego.RVFavoriteAdapter
import com.example.ec3_solorzano_diego.RVListAdapter
import com.example.ec3_solorzano_diego.databinding.FragmentFavoriteBinding
import com.example.ec3_solorzano_diego.databinding.FragmentListBinding
import com.example.ec3_solorzano_diego.model.getData

class FavoriteFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvFavorite.adapter = RVFavoriteAdapter(getData())
        binding.rvFavorite.layoutManager = GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)
        }
}