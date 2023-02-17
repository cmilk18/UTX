package com.midsangam.utx.store.jpastore.jpo;

import com.midsangam.utx.model.Train;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Train")
public class TrainJpo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String departureTime;
    private String arrivalTime;
    private String delayTime;

    public TrainJpo(){};

    public TrainJpo(Train train){
        this.name = train.getName();
        this.departureTime = train.getDepartureTime();
        this.arrivalTime = train.getArrivalTime();
        this.delayTime = train.getDelayTime();
    }
    public Train toDomain(){
        Train train = new Train();
        train.setId(id);
        train.setName(name);
        train.setDepartureTime(departureTime);
        train.setArrivalTime(arrivalTime);
        train.setDelayTime(delayTime);

        return train;
    }
}
