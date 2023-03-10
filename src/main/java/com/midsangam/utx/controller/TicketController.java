package com.midsangam.utx.controller;

import com.midsangam.utx.model.Seat;
import com.midsangam.utx.model.Ticket;
import com.midsangam.utx.Dto.TicketDto;
import com.midsangam.utx.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/create")
    public String createTicket(@RequestBody TicketDto ticketDto){
        //Seat seat = new Seat(ticketDto.getSeat_id());
        Seat seat = Seat.builder()
                .id(ticketDto.getSeat_id())
                .build();
        Ticket ticket = new Ticket(ticketDto);
        ticket.setSeat(seat);
        ticketService.createTicket(ticket);
        System.out.println(ticket.getSeat().getSeatNumber());
        return "new ticket created";
    }

    @GetMapping("/readAll")
    public List<Ticket> readAllTickets(){
        return ticketService.readAllTickets();
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Ticket> readTicketById(@PathVariable("id")Integer id){
        Ticket ticket = null;
        ticket = ticketService.readTicketById(id);

        return ResponseEntity.ok(ticket);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Ticket> updateTicket(@PathVariable("id")Integer id, @RequestBody Ticket ticket){
        ticket = ticketService.updateTicket(id,ticket);
        return ResponseEntity.ok(ticket);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteTicket(@PathVariable("id") Integer id){
        boolean deleted = false;
        deleted = ticketService.deleteTicket(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",deleted);
        return ResponseEntity.ok(response);
    }


}
