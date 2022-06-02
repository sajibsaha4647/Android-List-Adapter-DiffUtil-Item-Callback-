package com.example.listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.programminglistid)

        val adapter = ProgrammingAdapter()


        val p1 = ProgrammingItem(1,"j","java")
        val p2 = ProgrammingItem(1,"S","java Script")
        val p3 = ProgrammingItem(1,"k","Kotlin")
        adapter.submitList(listOf(p1,p2,p3))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed(Runnable{

            val p1 = ProgrammingItem(1,"F","Flutter")
            val p2 = ProgrammingItem(1,"N","Native Script")
            val p3 = ProgrammingItem(1,"k","Kotlin")
            adapter.submitList(listOf(p1,p2,p3))

        },4000)

    }
}