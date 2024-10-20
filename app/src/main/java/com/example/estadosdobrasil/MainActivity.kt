package com.example.estadosdobrasil

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var estados: List<Estados> = emptyList()
    private lateinit var adapter: EstadosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        estados = EstadosData.getEstados()

        adapter = EstadosAdapter(this, estados, onClickEstados())
        recyclerView.adapter = adapter
    }

    private fun onClickEstados(): EstadosAdapter.EstadosOnClickListener {
        return object : EstadosAdapter.EstadosOnClickListener {
            @SuppressLint("RestrictedApi")
            override fun onClickEstados(holder: EstadosAdapter.EstadosViewHolder?, idx: Int) {
                val estado = estados.getOrNull(idx) ?: return

                val intent = Intent(baseContext, EstadoActivity::class.java)
                val img: ImageView = holder!!.img
                intent.putExtra("imgEstado", estado.img)

                startActivity(intent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_exemplo_recycler_view, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_linear_layout -> {
                recyclerView.layoutManager = LinearLayoutManager(this)
                true
            }
            R.id.action_grid_layout -> {
                recyclerView.layoutManager = GridLayoutManager(this, 2)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}