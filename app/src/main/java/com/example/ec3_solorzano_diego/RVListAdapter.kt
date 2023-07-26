package com.example.ec3_solorzano_diego

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ec3_solorzano_diego.databinding.ItemResourceBinding
import com.example.ec3_solorzano_diego.model.Cerveceria

class RVListAdapter(var cervecerias: List<Cerveceria>): RecyclerView.Adapter<CerveceriaVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CerveceriaVH {
        val binding = ItemResourceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CerveceriaVH(binding)
    }


    override fun getItemCount(): Int = cervecerias.size

    override fun onBindViewHolder(holder: CerveceriaVH, position: Int) {
        holder.bind(cervecerias[position])
    }

}
class CerveceriaVH(private val binding: ItemResourceBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(c: Cerveceria) {
        binding.imageView.setImageResource(R.drawable.ic_logo)
        binding.txtName.text = c.name
        binding.txtBreweryType.text = c.brewery_type
        binding.txtCity.text = c.city
        binding.txtWebsiteUrl.text = c.website_url

    }
}