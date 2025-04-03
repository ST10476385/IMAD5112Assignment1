package com.example.imad5112assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to UI elements
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val textDisplay = findViewById<TextView>(R.id.textDisplay)

        // Button click listener for meal suggestion
        btnSuggest.setOnClickListener {

            // Check meal suggestion based on time
            val suggestion = when (editTextTime.text.toString().trim().lowercase()) {
                "morning" -> "Smashed Avo & Poached Egg Toast – Creamy avocado on toasted sourdough, topped with a perfectly poached egg, cherry tomatoes, and a sprinkle of feta."
                "mid morning" -> "Berry Dairy Smoothie – A refreshing blend of blueberries, raspberries, strawberries, banana, frozen yogurt, honey, and milk."
                "afternoon" -> "Grilled Chicken & Quinoa Power Bowl – Juicy grilled chicken with fluffy quinoa, roasted butternut, baby spinach, feta, and a tangy balsamic drizzle."
                "mid afternoon" -> "Tropical Chia Pudding – Creamy coconut milk chia pudding topped with diced mango, passion fruit, and toasted coconut flakes."
                "dinner" -> "Herb-Crusted Sirloin Steak – Tender, juicy sirloin steak grilled to perfection, coated in a flavorful herb crust. Served with roasted garlic baby potatoes, honey-glazed carrots & grilled asparagus."
                "after dinner" -> "Ultimate Chocolate Fudge Brownie – Warm, gooey dark chocolate brownie topped with a scoop of velvety vanilla bean ice cream, drizzled with melted chocolate and sprinkled with toasted macadamia nuts."
                else -> "Please enter a valid time of day (e.g., Morning, Afternoon, Dinner)."
            }

            // Display suggestion
            textDisplay.text = suggestion
        }

        // Reset button click listener
        btnReset.setOnClickListener {
            editTextTime.text.clear()
            textDisplay.text = ""
        }
    }
}