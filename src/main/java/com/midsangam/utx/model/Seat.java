package com.midsangam.utx.model;

<<<<<<< Updated upstream
import com.midsangam.utx.store.jpastore.jpo.TrainJpo;

import javax.persistence.*;
=======
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> Stashed changes

@Entity
@NoArgsConstructor
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //호차
<<<<<<< Updated upstream
    @ManyToOne
    private TrainJpo trainId;
=======
    private String trainNumber;
    private int trainId;
>>>>>>> Stashed changes
    private String level;
    private String seatNumber;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Seat(int id){
        this.id = id;
    }

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
