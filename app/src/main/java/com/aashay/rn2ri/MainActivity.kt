package com.aashay.rn2ri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing the button and text view from the layout file
        val mButton = findViewById<Button>(R.id.button)
        val mTextView = findViewById<TextView>(R.id.textView)

        // Fetching the id of the button (resource
        val resourceId = mButton.id

        // Getting the name of the resource
        val resourceName = resources.getResourceName(resourceId)

        // When button is clicked, the text view will display the value of resourceName
        mButton.setOnClickListener {
            mTextView.text = resourceName.toString()
        }
    }
}