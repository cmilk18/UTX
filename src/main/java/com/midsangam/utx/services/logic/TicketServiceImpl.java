package com.midsangam.utx.services.logic;

import com.midsangam.utx.model.Ticket;
import com.midsangam.utx.repository.TicketRepository;
import com.midsangam.utx.services.TicketService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket createTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> readAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket readTicketById(Integer id) {
        Ticket ticket1 = ticketRepository.findById(id).get();
        Ticket ticket = new Ticket();
        BeanUtils.copyProperties(ticket1,ticket);
        return ticket;
    }

    @Override
    public Ticket updateTicket(Integer id,Ticket ticket){
        Ticket ticket1 = ticketRepository.findById(id).get();
        ticket1.setDepartureTime(ticket.getDepartureTime());
        ticket1.setDepartureStation(ticket.getDepartureStation());
        ticket1.setArrivalTime(ticket.getArrivalTime());
        ticket1.setArrivalStation(ticket.getArrivalStation());
        ticket1.setPrice(ticket.getPrice());
        ticket1.setRequiredTime(ticket.getRequiredTime());

        ticket1.setPurchaseStatus(ticket.getPurchaseStatus());

        ticketRepository.save(ticket1);
        return ticket;
    }

    @Override
    public boolean deleteTicket(Integer id) {
        Ticket ticket1 = ticketRepository.findById(id).get();
        ticketRepository.delete(ticket1);
        return true;

    }
}
