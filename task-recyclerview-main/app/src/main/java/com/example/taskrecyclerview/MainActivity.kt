package com.example.taskrecyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskrecyclerview.adapters.PersonAdapter
import com.example.taskrecyclerview.classes.Person
import com.example.taskrecyclerview.data.PeopleList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val peopleList: List<Person> = PeopleList.generatePeopleList()

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PersonAdapter(peopleList)
        recyclerView.adapter= adapter
    }
}
