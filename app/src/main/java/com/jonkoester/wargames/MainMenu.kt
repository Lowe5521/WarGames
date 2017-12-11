package com.jonkoester.wargames

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotterknife.bindView

class MainMenu : AppCompatActivity() {

    val btnNumberWar: Button by bindView(R.id.number_war_btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        btnNumberWar.setOnClickListener {
            val intent = Intent(this, NumberWar::class.java)
            startActivity(intent)
        }
    }
}