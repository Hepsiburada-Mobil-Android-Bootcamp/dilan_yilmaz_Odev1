package com.example.hepsiburadaodev1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburadaodev1.R
import com.example.hepsiburadaodev1.models.RWOneModel

class Adapterrw(
    private val mList: List<RWOneModel>,
    private val itemClickListener: ItemClickListener
) : RecyclerView.Adapter<Adapterrw.ViewHolder>() {

    interface ItemClickListener {
        fun onItemClicked(adapterrw: RWOneModel)
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rw1_card, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]
        // sets the image to the imageview from our itemHolder class

        holder.imageButton.setImageResource(ItemsViewModel.productImage)
        holder.imageButton.setOnClickListener {
            itemClickListener.onItemClicked(mList[position])
        }

        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.productName
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageButton: ImageView = itemView.findViewById(R.id.rw1_image)
        val textView: TextView = itemView.findViewById(R.id.rw1_image_name)

    }

}




