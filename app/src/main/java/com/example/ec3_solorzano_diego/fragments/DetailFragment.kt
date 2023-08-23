package com.example.ec3_solorzano_diego.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.ec3_solorzano_diego.R
import com.example.ec3_solorzano_diego.databinding.FragmentDetailBinding
import com.example.ec3_solorzano_diego.model.Cerveceria


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    val args: DetailFragmentArgs by navArgs()
    private lateinit var cerveceria: Cerveceria
    private lateinit var viewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cerveceria = args.cerveceria
        viewModel = ViewModelProvider(requireActivity()).get(DetailViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgCoupon.setImageResource(R.drawable.ic_logo)
        binding.txtNameStore.text = cerveceria.name
        binding.txtDetail.text = cerveceria.brewery_type
        binding.txtCity.text = cerveceria.city
        binding.txtPhone.text = cerveceria.phone
        binding.btnAddFavorite.apply {
            visibility = if (cerveceria.isFavorite) View.GONE else View.VISIBLE
        }
        binding.btnAddFavorite.setOnClickListener {
            cerveceria.isFavorite = true
            viewModel.addFavorite(cerveceria)
            Toast.makeText(context, "Se agrego a favorito", Toast.LENGTH_SHORT).show()
        }
        binding.btnRemoveFavorite.apply {
            visibility = if (cerveceria.isFavorite) View.VISIBLE else View.GONE
        }
        binding.btnRemoveFavorite.setOnClickListener {
            cerveceria.isFavorite = false
            viewModel.removeFavorite(cerveceria)
            Toast.makeText(context, "Se eliminó de favorito", Toast.LENGTH_SHORT).show()
        }

    }

}