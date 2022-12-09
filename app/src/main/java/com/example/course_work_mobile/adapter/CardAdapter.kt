package com.example.course_work_mobile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.course_work_mobile.R
import com.example.course_work_mobile.data.Card

class CardAdapter(Context: Context,
                     private val cards: List<Card>,
                     private val clickListener: (position: Int) -> Unit
) : RecyclerView.Adapter<CardAdapter.ViewHolder> () {

    private val inflater: LayoutInflater = LayoutInflater.from(Context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_card, parent, false), clickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = cards.size

    private fun getItem(position: Int) : Card = cards[position]

    class ViewHolder(
        itemView: View,
        listener: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        private val name: TextView = itemView.findViewById(R.id.name)
        private val alternativeNames: TextView = itemView.findViewById(R.id.alternativeNames)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener(position)
                }
            }
        }

        fun bind(card: Card) {
            name.text = card.name
            alternativeNames.text = card.alternativeNames
        }
    }

}