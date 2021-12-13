package com.example.gameku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameList = listOf<Game>(
            Game(
                R.drawable.valorant,
                nameGame = "Valorant",
                descGame = "lorem lorem lorem lorem lorem"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_game)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = GameAdapter(this, gameList){
            val intent = Intent (this,DetailGameActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}