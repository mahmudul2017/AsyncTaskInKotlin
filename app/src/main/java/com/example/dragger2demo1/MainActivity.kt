package com.example.dragger2demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dragger2demo1.component.DaggerTicketComponent
import com.example.dragger2demo1.repository.TicketRepository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var ticketRepository: TicketRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ticketRepository = DaggerTicketComponent.create().getTicket()
        Toast.makeText(applicationContext, "...."+ ticketRepository.getTicket(), Toast.LENGTH_LONG).show()
    }
}
