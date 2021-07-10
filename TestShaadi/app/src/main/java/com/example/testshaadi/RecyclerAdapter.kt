package com.example.testshaadi

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testshaadi.database.Results
import com.example.testshaadi.databinding.TextRowItemBinding

class RecyclerAdapter(var context: Context, private val userList: List<Results>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val adapterRecyclerBinding: TextRowItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.text_row_item, parent, false)
        return ViewHolder(adapterRecyclerBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPhoto(userList[position])
    }

    override fun getItemCount(): Int = userList.size

    class ViewHolder(val binding: TextRowItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindPhoto(userList: Results) {

            binding.apply {

                tvFullname.text =
                    "${userList.name.title} ${userList.name.first} ${userList.name.last}"

                tvAgeHeight.text = "${userList.dob.age} yrs, Date of Birth ${userList.dob.date}"

                tvGender.text = userList.gender

                tvDescription.text =
                    "Street - ${userList.location.street.name} ${userList.location.street.number} /n" +
                            "Country - ${userList.location.country} City - ${userList.location.city}"

                tvLatlng.text =
                    "Latitude - ${userList.location.coordinates.latitude} Longitude " +
                            "- ${userList.location.coordinates.longitude}"

                Glide.with(itemView)
                    .load(userList.picture.large)
                    .into(icon)

            }

        }

    }

}