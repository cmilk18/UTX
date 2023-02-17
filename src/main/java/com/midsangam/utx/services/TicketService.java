package com.midsangam.utx.services;

import com.midsangam.utx.model.Ticket;

import java.util.List;

public interface TicketService {
    public Ticket createTicket(Ticket ticket);

    public List<Ticket> readAllTickets();

    public Ticket readTicketById(Integer id);

    public Ticket updateTicket(Integer id, Ticket ticket);

    public boolean deleteTicket(Integer id);
}
