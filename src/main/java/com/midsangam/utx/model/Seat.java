package com.midsangam.utx.model;

import com.midsangam.utx.store.jpastore.jpo.TrainJpo;

import javax.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //호차
    @ManyToOne
    private TrainJpo trainId;
    private String level;
    private String seatNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainId() {
        return trainId.getId();
    }

    public void setTrainId(int trainId) {
        this.trainId.setId(trainId);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
