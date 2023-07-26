package com.example.ec3_solorzano_diego

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ec3_solorzano_diego.databinding.ItemFavoriteBinding
import com.example.ec3_solorzano_diego.model.Cerveceria

class RVFavoriteAdapter(var cervecerias: List<Cerveceria>): RecyclerView.Adapter<CerveceriaVH2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CerveceriaVH2 {
        val binding = ItemFavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CerveceriaVH2(binding)
    }


    override fun getItemCount(): Int = cervecerias.size

    override fun onBindViewHolder(holder: CerveceriaVH2, position: Int) {
        holder.bind(cervecerias[position])
    }

}


class CerveceriaVH2(private val binding: ItemFavoriteBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(c: Cerveceria) {
        binding.imageView.setImageResource(R.drawable.ic_beer)
        binding.txtName.text = c.name
        binding.txtBreweryType.text = c.brewery_type
        binding.txtCity.text = c.city
        binding.txtCountry.text = c.country
        binding.txtPhone.text = c.phone
        binding.txtWebsiteUrl.text = c.website_url


    }
}