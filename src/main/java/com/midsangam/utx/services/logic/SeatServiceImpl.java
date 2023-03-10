package com.midsangam.utx.services.logic;

import com.midsangam.utx.model.Seat;
import com.midsangam.utx.repository.SeatRepository;
import com.midsangam.utx.services.SeatService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public Seat createSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> readAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat readSeatById(Integer id) {
        Seat seat1 = seatRepository.findById(id).get();
        Seat seat = new Seat();
        BeanUtils.copyProperties(seat1,seat);
        return seat;
    }

    @Override
    public Seat updateSeat(Integer id, Seat seat) {
        Seat seat1 = seatRepository.findById(id).get();

        seat1.setTrain(seat.getTrain());
        seat1.setLevel(seat.getLevel());
        seat1.setSeatNumber(seat.getSeatNumber());

        seatRepository.save(seat1);
        return null;
    }

    @Override
    public boolean deleteSeat(Integer id) {
        Seat seat1 = seatRepository.findById(id).get();
        seatRepository.delete(seat1);
        return true;
    }
}
