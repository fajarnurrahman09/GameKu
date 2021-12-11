package com.example.gameku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameList = listOf<Game>(
            Game(
                R.drawable.valorant,
                nameGame = "Valorant",
                descGame = "lorem lorem lorem"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_game)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = GameAdapter(this, gameList){

        }

    }
}