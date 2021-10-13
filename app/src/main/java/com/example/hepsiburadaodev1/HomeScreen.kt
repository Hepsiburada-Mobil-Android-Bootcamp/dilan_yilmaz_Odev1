package com.example.hepsiburadaodev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.rw_1)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL, false
        )

        // ArrayList of class ItemsViewModel
        val data = ArrayList<RWOneModel>()

        // the image with the count of view

        data.add(RWOneModel(R.drawable.ic_ion_fast_food_outline, "All "))
        data.add(RWOneModel(R.drawable.ic_ion_pizza_outline, "Pizza "))
        data.add(RWOneModel(R.drawable.ic_bx_bx_drink, "Beverages "))
        data.add(RWOneModel(R.drawable.ic_fe_rice_cracker, "Asian "))
        data.add(RWOneModel(R.drawable.ic_fe_rice_cracker, "Asian "))
        // This will pass the ArrayList to our Adapter
        val adapter = Adapterrw(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}