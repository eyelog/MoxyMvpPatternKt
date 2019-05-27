package ru.eyelog.moxymvppatternkt.utils

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ru.eyelog.moxymvppatternkt.R

class RVAdapter (data : List<DataClass>) : RecyclerView.Adapter<RVAdapter.ValListHolder>(){

    var data : List<DataClass>

    init {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ValListHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv, parent, false)
        return ValListHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ValListHolder, position: Int) {
        val item = data.get(position)

        holder.itemTitle.text = item.title
        holder.itemSubTitle.text = item.subTitle
    }

    class ValListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemTitle : TextView
        var itemSubTitle : TextView

        init {
            itemTitle = itemView.findViewById(R.id.title)
            itemSubTitle = itemView.findViewById(R.id.subtitle)
        }
    }
}