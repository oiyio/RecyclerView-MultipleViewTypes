package com.oiyio.recyclerviewmultipleviewtype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timelineRecyclerViewAdapter = MyAdapter(getPostDataList())
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = timelineRecyclerViewAdapter
    }

    private fun getPostDataList(): List<Post> {
        val postList = mutableListOf<Post>()
        postList.add(Post(userName = "User 1", isLiked = true))
        postList.add(Post(userName = "User 2", isLiked = false))
        postList.add(Post(userName = "User 3", isLiked = false))
        postList.add(Post(userName = "User 4", isLiked = true))
        postList.add(Post(userName = "User 5", isLiked = false))
        return postList
    }
}
