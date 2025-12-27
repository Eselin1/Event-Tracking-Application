package com.example.eventtrackingapp

import EventEntity
import EventViewModel
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class AddEventActivity : AppCompatActivity() {

    private val viewModel: EventViewModel by viewModels()
    private lateinit var editTitle: EditText
    private lateinit var editDescription: EditText
    private lateinit var datePicker: android.widget.DatePicker
    private lateinit var timePicker: android.widget.TimePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event)

        editTitle = findViewById(R.id.editEventTitle)
        editDescription = findViewById(R.id.editEventDescription)
        datePicker = findViewById(R.id.datePicker)
        timePicker = findViewById(R.id.timePicker)
        timePicker.setIs24HourView(true)

        val btnSave = findViewById<Button>(R.id.btnSaveEvent)
        val btnCancel = findViewById<Button>(R.id.btnCancelEvent)

        btnSave.setOnClickListener {
            val title = editTitle.text.toString().trim()

            if (title.isEmpty()) {
                Toast.makeText(this, "Please enter an event title.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val calendar = Calendar.getInstance()
            calendar.set(
                datePicker.year,
                datePicker.month,
                datePicker.dayOfMonth,
                timePicker.hour,
                timePicker.minute
            )
            val time = SimpleDateFormat("MMM dd, yyyy h:mm a", Locale.getDefault()).format(calendar.time)

            viewModel.insert(EventEntity(title = title, time = time))

            Toast.makeText(this, "Event added!", Toast.LENGTH_SHORT).show()
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }
    }
}
