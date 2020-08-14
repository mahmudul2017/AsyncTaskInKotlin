package com.example.dragger2demo1.repository

import javax.inject.Inject

class TicketRepository {

    @Inject
    constructor()

    public fun getTicket(): String {
        return "This is Ticket"
    }
}