package com.midsangam.utx.services.logic;

import com.midsangam.utx.Dto.SeatDto;
import com.midsangam.utx.model.Seat;
import com.midsangam.utx.repository.SeatRepository;
import com.midsangam.utx.services.SeatService;
import com.midsangam.utx.store.jpastore.jpo.TrainJpo;
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
    public Seat createSeat(SeatDto seatDto) {
        TrainJpo trainJpo = TrainJpo.builder()
                .id(seatDto.getTrainId())
                .build();

        Seat seat = Seat.builder()
                .id(seatDto.getId())
                .trainNumber(seatDto.getTrainNumber())
                .level(seatDto.getLevel())
                .seatNumber(seatDto.getSeatNumber())
                .train(trainJpo)
                .build();

        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> readAllSeats() {
        List<Seat> seats = seatRepository.findAll();
        for(Seat seat: seats){
            System.out.println(seat.getTrain());
        }
        return seats;
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
