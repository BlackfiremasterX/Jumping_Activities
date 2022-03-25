package com.example.jumping_activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.jumping_activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            buttonOpenDrawer.setOnClickListener {mainDrawer.openDrawer(GravityCompat.END)}

            buttonFirst.setOnClickListener { startActivity(Intent(this@MainActivity,FirstScreen::class.java)) }
            buttonSecond.setOnClickListener { startActivity(Intent(this@MainActivity,SecondScreen::class.java)) }
            buttonThird.setOnClickListener { startActivity(Intent(this@MainActivity,ThirdScreen::class.java)) }

        }

    }
}