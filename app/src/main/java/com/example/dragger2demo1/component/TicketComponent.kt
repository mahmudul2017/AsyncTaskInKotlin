package com.example.dragger2demo1.component

import com.example.dragger2demo1.MainActivity
import com.example.dragger2demo1.module.TicketModule
import com.example.dragger2demo1.repository.TicketRepository
import dagger.Component

@Component(modules = [TicketModule::class])
public interface TicketComponent {

    public fun inject(mainActivity: MainActivity)

    public fun getTicket(): TicketRepository
}