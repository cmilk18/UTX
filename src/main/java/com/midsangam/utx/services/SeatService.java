package com.midsangam.utx.services;

import com.midsangam.utx.Dto.SeatDto;
import com.midsangam.utx.model.Seat;

import java.util.List;

public interface SeatService {
    public Seat createSeat(SeatDto seatDto);

    public List<Seat> readAllSeats();

    public Seat readSeatById(Integer id);

    public Seat updateSeat(Integer id,Seat seat);

    public boolean deleteSeat(Integer id);
}
