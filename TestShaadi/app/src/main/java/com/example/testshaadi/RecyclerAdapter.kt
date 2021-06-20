package com.example.testshaadi

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testshaadi.database.Results

class RecyclerAdapter(var context: Context, private val userList: List<Results>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPhoto(userList[position])
    }

    override fun getItemCount(): Int {
        Log.e("RecyclerAdapter", "users " + userList.size)
        return userList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var userImage: ImageView = view.findViewById(R.id.icon)
        var fullname: TextView = view.findViewById(R.id.tv_fullname)
        var ageHeight: TextView = view.findViewById(R.id.tv_age_height)
        var gender: TextView = view.findViewById(R.id.tv_gender)
        var name: TextView = view.findViewById(R.id.tv_fullname1)
        var description: TextView = view.findViewById(R.id.tv_description)
        var latlng: TextView = view.findViewById(R.id.tv_latlng)

        fun bindPhoto(userList: Results) {

            val fullNameStr = "${userList.name.title} ${userList.name.first} ${userList.name.last}"
            fullname.setText(fullNameStr)

            val ageHeightStr = "${userList.dob.age} yrs, Date of Birth ${userList.dob.date}"
            ageHeight.setText(ageHeightStr)

            val genderStr = userList.gender
            gender.setText(genderStr)

            val fullNameStr1 =
                "About ${userList.name.title} ${userList.name.first} ${userList.name.last}"
            fullname.setText(fullNameStr1)

            val desc =
                "Street - ${userList.location.street.name} ${userList.location.street.number} /n" +
                        "Country - ${userList.location.country} City - ${userList.location.city}"
            description.setText(desc)

            val latlngStr =
                "Latitude - ${userList.location.coordinates.latitude} Longitude - ${userList.location.coordinates.longitude}"
            latlng.setText(latlngStr)

            Glide.with(itemView)
                .load(userList.picture.large)
                .into(userImage)
        }

    }

}