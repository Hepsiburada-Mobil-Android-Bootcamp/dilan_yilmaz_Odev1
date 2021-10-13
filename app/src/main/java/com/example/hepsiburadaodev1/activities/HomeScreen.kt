package com.example.hepsiburadaodev1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburadaodev1.R
import com.example.hepsiburadaodev1.models.RWOneModel
import com.example.hepsiburadaodev1.adapters.Adapterrw
import com.example.hepsiburadaodev1.adapters.Adapterrw2
import com.example.hepsiburadaodev1.models.RWTwoModel

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


    // getting the recyclerview by its id

        val recyclerview2 = findViewById<RecyclerView>(R.id.rw_2)

        // this creates a vertical layout Manager
        recyclerview2.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        // ArrayList of class ItemsViewModel
        val data2 = ArrayList<RWTwoModel>()

        // the image with the count of view

        data2.add(RWTwoModel(R.drawable.ic_group_43,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_44,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_45,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_46,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_43,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_44,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_45,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_46,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_43,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_44,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_45,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))
        data2.add(RWTwoModel(R.drawable.ic_group_46,"Conrad food","4.6 •","Pizza •","15 min","15 min" ))

        // This will pass the ArrayList to our Adapter
        val adapter2 = Adapterrw2(data2)

        // Setting the Adapter with the recyclerview
        recyclerview2.adapter = adapter2


    }
}