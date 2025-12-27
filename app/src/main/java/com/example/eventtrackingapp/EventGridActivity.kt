package com.example.eventtrackingapp

import EventViewModel
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class EventGridActivity : AppCompatActivity() {

    private lateinit var viewModel: EventViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var fabAddEvent: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_grid)

        viewModel = ViewModelProvider(this)[EventViewModel::class.java]
        recyclerView = findViewById(R.id.recyclerViewEvents)
        fabAddEvent = findViewById(R.id.fabAddEvent)

        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.allEvents.observe(this) { events ->
            recyclerView.adapter = EventAdapter(events) { eventToDelete ->
                viewModel.delete(eventToDelete)
            }
        }

        fabAddEvent.setOnClickListener {
            startActivity(Intent(this, AddEventActivity::class.java))
        }
    }
}
