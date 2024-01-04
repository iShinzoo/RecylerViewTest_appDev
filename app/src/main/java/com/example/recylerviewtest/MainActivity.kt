package com.example.recylerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rev = findViewById<RecyclerView>(R.id.rev)

        val ContactListOf = mutableListOf<Contanct_Item>()
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image1,
                heading = "Krishna Thakur",
                Sub_heading = "This is a message by Krishna"
        )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image2,
                heading = "Abhay Maurya",
                Sub_heading = "Something Special by Abhay"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image3,
                heading = "Harmandeep Mavi",
                Sub_heading = "Chips Mang rha ha"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image1,
                heading = "Krishna Thakur",
                Sub_heading = "This is a message by Krishna"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image2,
                heading = "Abhay Maurya",
                Sub_heading = "Something Special by Abhay"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image3,
                heading = "Harmandeep Mavi",
                Sub_heading = "Chips Mang rha ha"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image1,
                heading = "Krishna Thakur",
                Sub_heading = "This is a message by Krishna"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image2,
                heading = "Abhay Maurya",
                Sub_heading = "Something Special by Abhay"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image3,
                heading = "Harmandeep Mavi",
                Sub_heading = "Chips Mang rha ha"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image1,
                heading = "Krishna Thakur",
                Sub_heading = "This is a message by Krishna"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image2,
                heading = "Abhay Maurya",
                Sub_heading = "Something Special by Abhay"
            )
        )
        ContactListOf.add(
            Contanct_Item (
                ImageRes = R.drawable.image3,
                heading = "Harmandeep Mavi",
                Sub_heading = "Chips Mang rha ha"
            )
        )

        // created Adapter
        val Adapter = contactListAdapter(ContactListOf)
        rev.layoutManager = LinearLayoutManager(this)
        rev.adapter = Adapter
    }
}