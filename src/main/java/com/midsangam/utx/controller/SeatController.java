package com.midsangam.utx.controller;

import com.midsangam.utx.model.Seat;
import com.midsangam.utx.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/seat")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @PostMapping("/create")
    public String createSeat(@RequestBody Seat seat){
        seatService.createSeat(seat);
        return "new seat add";
    }

    @GetMapping("/readAll")
    public List<Seat> readAllSeats(){
        return seatService.readAllSeats();
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Seat> readSeatById(@PathVariable("id")Integer id){
        Seat seat = null;
        seat = seatService.readSeatById(id);

        return ResponseEntity.ok(seat);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Seat> updateSeat(@PathVariable("id")Integer id,@RequestBody Seat seat){
        seat = seatService.updateSeat(id,seat);
        return ResponseEntity.ok(seat);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>>deleteSeat(@PathVariable("id")Integer id){
        boolean deleted = false;
        deleted = seatService.deleteSeat(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",deleted);
        return ResponseEntity.ok(response);
    }


}
