package com.oiyio.recyclerviewmultipleviewtype

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_post_header.view.*

class ViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textViewProfileName = itemView.textViewProfileName
    val textViewIsLiked = itemView.textViewIsLiked

    fun bind(post: Post){
        textViewProfileName.text = post.userName
        textViewIsLiked.text = post.isLiked.toString()
        itemView.setOnClickListener {
            Toast.makeText(itemView.context, "ViewHolder 1", Toast.LENGTH_SHORT).show()
        }
    }


}