package com.example.ec3_solorzano_diego.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ec3_solorzano_diego.R
import com.example.ec3_solorzano_diego.RVListAdapter
import com.example.ec3_solorzano_diego.databinding.FragmentListBinding
import com.example.ec3_solorzano_diego.model.getData
import okhttp3.internal.notify

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var viewModel: ListViewModel
    private lateinit var adapter: RVListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVListAdapter(listOf()){cerveceria ->
            val detailDirection = ListFragmentDirections.actionListFragmentToDetailFragment(cerveceria)
            findNavController().navigate(detailDirection)

        }
        binding.rvList.adapter = adapter
        binding.rvList.layoutManager = GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)

        viewModel. cerveceriaList.observe(viewLifecycleOwner){ cerveceria ->
            cerveceria?.let {
                adapter.cervecerias = it
                adapter.notifyDataSetChanged()
            }
        }
        viewModel.getCerveceriasFromService()

    }
}