package com.oiyio.recyclerviewmultipleviewtype

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val postList : List<Post>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val VH1 = 1
    private val VH2 = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        return if (viewType == VH1) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewholder_1, parent, false)
            ViewHolder1(view)
        }
        else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewholder_2, parent, false)
            ViewHolder2(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val post = postList[position]

        if (holder.itemViewType == VH1) {
            val viewHolder = holder as ViewHolder1
            viewHolder.bind(post)
        }
        else {
            val viewHolder = holder as ViewHolder2
            viewHolder.bind(post)
        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (postList[position].isLiked)
            VH1
        else
            VH2
    }
}