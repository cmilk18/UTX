package com.midsangam.utx.model;

import com.midsangam.utx.store.jpastore.jpo.TrainJpo;
import lombok.NoArgsConstructor;

import javax.persistence.*;


import com.midsangam.utx.store.jpastore.jpo.TrainJpo;

import javax.persistence.*;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //호차

    @ManyToOne
    private TrainJpo train;

    private String trainNumber;
    private String level;
    private String seatNumber;
}
