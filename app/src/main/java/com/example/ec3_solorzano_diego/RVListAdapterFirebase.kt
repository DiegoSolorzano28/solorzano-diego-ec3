package com.example.ec3_solorzano_diego

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ec3_solorzano_diego.databinding.ItemResourceBinding
import com.example.ec3_solorzano_diego.model.CerveceriaFirebase

class RVListAdapterFirebase(var cervecerias: List<CerveceriaFirebase>, private val onClick: (CerveceriaFirebase) -> Unit) : RecyclerView.Adapter<RVListAdapterFirebase.ClotheViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClotheViewHolder {
        val binding = ItemResourceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClotheViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClotheViewHolder, position: Int) {
        holder.bind(cervecerias[position])
    }

    override fun getItemCount(): Int = cervecerias.size

    inner class ClotheViewHolder(private val binding: ItemResourceBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(cerveceria: CerveceriaFirebase) {
            Glide
                .with(binding.root.context)
                .load(cerveceria.imgUrl)
                .into(binding.imageView)

            binding.txtName.text= cerveceria.name
            binding.txtBreweryType.text = cerveceria.tipo
            binding.txtCity.text = cerveceria.city
            binding.txtPhone.text = cerveceria.phone
            binding.root.setOnClickListener { onClick(cerveceria) }
        }
    }

    fun updateData(newClothes: List<CerveceriaFirebase>) {
        cervecerias = newClothes
        notifyDataSetChanged()
    }

}