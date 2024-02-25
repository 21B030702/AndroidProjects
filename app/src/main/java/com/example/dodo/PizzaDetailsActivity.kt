package com.example.dodo

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class PizzaDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_details)

        val pizzaId = intent.getIntExtra("PIZZA_ID", -1)
        val pizza = getPizzaById(pizzaId)

        pizza?.let {
            findViewById<TextView>(R.id.textViewPizzaName).text = it.name
            findViewById<TextView>(R.id.textViewPizzaDescription).text = it.description
            findViewById<TextView>(R.id.textViewPizzaPrice).text = getString(R.string.pizza_price, it.price)
            Glide.with(this).load(it.imageUrl).into(findViewById(R.id.pizzaImage))
        }
    }

    private fun getPizzaById(id: Int): Pizza? {
        val pizza = PizzaData.getPizzaList().find { it.id == id }
        Log.d("PizzaDetailsActivity", "Looking for pizza with ID: $id, found: $pizza")
        return pizza
    }
}