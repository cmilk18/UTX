package com.midsangam.utx.Dto;


import com.midsangam.utx.store.jpastore.jpo.TrainJpo;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeatDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //호차

    private int trainId;

    private String trainNumber;


    private String level;
    private String seatNumber;
}
