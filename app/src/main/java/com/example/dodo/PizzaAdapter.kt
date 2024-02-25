package com.example.dodo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PizzaAdapter(private val pizzas: MutableList<Pizza>, private val onClick: (Pizza) -> Unit) : RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>() {

    private var filteredPizzas: MutableList<Pizza> = pizzas.toMutableList()

    fun addItems(newItems: List<Pizza>) {
        val currentSize = pizzas.size
        val itemsToAdd = ArrayList<Pizza>().apply {
            addAll(pizzas)
            addAll(newItems)
        }
        pizzas.clear()
        pizzas.addAll(itemsToAdd)
        notifyItemRangeInserted(currentSize, newItems.size)
    }

    class PizzaViewHolder(view: View, val onClick: (Pizza) -> Unit) : RecyclerView.ViewHolder(view) {
        private val nameTextView: TextView = view.findViewById(R.id.textViewPizzaName)
        private val descriptionTextView: TextView = view.findViewById(R.id.textViewPizzaDescription)
        private val priceTextView: TextView = view.findViewById(R.id.textViewPizzaPrice)
        private val imageView: ImageView = view.findViewById(R.id.imageViewPizza)
        private var currentPizza: Pizza? = null

        init {
            view.setOnClickListener {
                currentPizza?.let {
                    onClick(it)
                }
            }
        }

        fun bind(pizza: Pizza, onClick: (Pizza) -> Unit) {
            nameTextView.text = pizza.name
            descriptionTextView.text = pizza.description
            priceTextView.text = itemView.context.getString(R.string.pizza_price, pizza.price)
            Glide.with(itemView.context).load(pizza.imageUrl).into(imageView)
            itemView.setOnClickListener { onClick(pizza) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pizza_item_view, parent, false)
        return PizzaViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        val actualPosition = position % filteredPizzas.size
        holder.bind(filteredPizzas[actualPosition], onClick)
    }

    override fun getItemCount() = Int.MAX_VALUE

    fun filter(query: String) {
        filteredPizzas = pizzas.filter {
            it.name.contains(query, ignoreCase = true) ||
                    it.description.contains(query, ignoreCase = true)
        }.toMutableList()
        notifyDataSetChanged()
    }
}