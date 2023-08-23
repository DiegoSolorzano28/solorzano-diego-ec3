package com.example.ec3_solorzano_diego.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ec3_solorzano_diego.AddCerveceriaActivity
import com.example.ec3_solorzano_diego.R
import com.example.ec3_solorzano_diego.RVListAdapterFirebase
import com.example.ec3_solorzano_diego.databinding.ActivityAddCerveceriaBinding
import com.example.ec3_solorzano_diego.databinding.FragmentFirebaseListBinding

class FirebaseListFragment : Fragment() {

    private lateinit var binding: FragmentFirebaseListBinding
    private lateinit var adapter: RVListAdapterFirebase
    private lateinit var viewModel: FirebaseViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirebaseListBinding.inflate(layoutInflater)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = RVListAdapterFirebase(emptyList()) { /* Handle item click here */ }
        viewModel = ViewModelProvider(this).get(FirebaseViewModel::class.java)

        binding.rvList.adapter = adapter
        binding.rvList.layoutManager =
            GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)

        viewModel.cervecerias.observe(viewLifecycleOwner, Observer { cervecerias ->
            adapter.updateData(cervecerias)
            adapter.notifyDataSetChanged()
        })

        viewModel.getFirebaseList()

        binding.fabAddCerveceria.setOnClickListener {
            val intent = Intent(requireContext(), AddCerveceriaActivity::class.java)
            startActivity(intent)
        }

    }
}