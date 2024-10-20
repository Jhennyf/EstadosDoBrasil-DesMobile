package com.example.estadosdobrasil

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstadosAdapter(
    private val context: Context,
    private val estados: List<Estados>,
    private val onClickListener: EstadosOnClickListener
) : RecyclerView.Adapter<EstadosAdapter.EstadosViewHolder>() {

    interface EstadosOnClickListener {
        fun onClickEstados(holder: EstadosViewHolder?, idx: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadosViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_estado, parent, false)
        return EstadosViewHolder(view)
    }

    override fun getItemCount(): Int = estados.size

    override fun onBindViewHolder(holder: EstadosViewHolder, position: Int) {
        val estado = estados!![position]

        holder.tNome.text = estado.nome
        holder.tCapital.text = estado.capital
        holder.tPopulacao.text = estado.populacao
        holder.tRegiao.text = estado.regiao
        holder.img.setImageResource(estado.img)

        holder.itemView.setOnClickListener {
            onClickListener.onClickEstados(holder, position)
        }
    }

    class EstadosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tNome = itemView.findViewById(R.id.nome) as TextView
        var tCapital = itemView.findViewById(R.id.capital) as TextView
        var tPopulacao = itemView.findViewById(R.id.populacao) as TextView
        var tRegiao = itemView.findViewById(R.id.regiao) as TextView
        var img = itemView.findViewById(R.id.img) as ImageView

    }
}