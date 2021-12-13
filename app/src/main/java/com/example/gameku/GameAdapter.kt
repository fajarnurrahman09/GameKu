package com.example.gameku

import android.content.Context
import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class GameAdapter (private val context: Context, private val game: List<Game>, val listener: (Game) -> Unit)
    :RecyclerView.Adapter<GameAdapter.GameViewHolder>(){

    class GameViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgGame = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameGame = view.findViewById<TextView>(R.id.tv_item_name)
        val desGame = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(game: Game, listener: (Game) -> Unit ){
            imgGame.setImageResource(game.imgGame)
            nameGame.text = game.nameGame
            desGame.text = game.descGame

            itemView.setOnClickListener{
                listener(game)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        return GameViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_row_game, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.bindView(game[position], listener)
    }

    override fun getItemCount(): Int = game.size

}
