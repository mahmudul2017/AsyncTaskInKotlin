package com.example.dragger2demo1.module

import com.example.dragger2demo1.repository.TicketRepository
import dagger.Module
import dagger.Provides

@Module
class TicketModule {

    @Provides
    public fun getTicketRepo(): TicketRepository {
        return TicketRepository()
    }
}