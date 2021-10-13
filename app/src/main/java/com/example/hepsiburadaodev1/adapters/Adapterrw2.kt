package com.example.hepsiburadaodev1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburadaodev1.R
import com.example.hepsiburadaodev1.models.RWTwoModel

class Adapterrw2 (private val nList:List<RWTwoModel>): RecyclerView.Adapter<Adapterrw2.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view2 = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rw2_card, parent, false)

        return MyViewHolder(view2)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val myViewModel2 = nList[position]

        // sets the image to the imageview from our itemHolder class
        holder.image.setImageResource(myViewModel2.image)

        // sets the text to the textview from our itemHolder class
        holder.pname.text = myViewModel2.product_name
        holder.name.text = myViewModel2.name
        holder.score.text = myViewModel2.score
        holder.min.text = myViewModel2.minute
        holder.discount.text = myViewModel2.discount
    }

    override fun getItemCount(): Int {
        return nList.size
    }
    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val image: ImageView = itemView.findViewById(R.id.rw2_image)
        val pname: TextView = itemView.findViewById(R.id.rw2_item_productname2)
        val score: TextView = itemView.findViewById(R.id.rw2_item_score)
        val name: TextView = itemView.findViewById(R.id.rw2_item_name)
        val min: TextView = itemView.findViewById(R.id.rw2_item_min)
        val discount: TextView = itemView.findViewById(R.id.rw2_item_dicount)


    }


}
