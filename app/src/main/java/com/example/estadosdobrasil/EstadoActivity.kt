package com.example.estadosdobrasil

import android.os.Bundle
import android.view.MenuItem
import android.view.Window
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class EstadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estados)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val imgEstado = intent.getIntExtra("imgEstado", 0)
        if (imgEstado > 0) {
            val img = findViewById<ImageView>(R.id.img)
            img.setImageResource(imgEstado)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                supportFinishAfterTransition()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}