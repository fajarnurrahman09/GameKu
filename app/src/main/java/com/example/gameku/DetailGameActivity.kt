package com.example.gameku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_game)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val game = intent.getParcelableExtra<Game>(MainActivity.INTENT_PARCELABLE)

        val imgGame = findViewById<ImageView>(R.id.img_item_photo)
        val nameGame = findViewById<TextView>(R.id.tv_item_name)
        val descGame = findViewById<TextView>(R.id.tv_item_description)

        imgGame.setImageResource(game?.imgGame!!)
        nameGame.text = game.nameGame
        descGame.text = game.descGame
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}