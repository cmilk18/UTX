package com.midsangam.utx.store.jpastore.jpo;

import com.midsangam.utx.model.Station;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "station")
public class StationJpo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
//    private List<Train> departureTrainList;
//    private List<Train> arrivalTrainList;
//    public List<Train> getDepartureTrainList(){
//        return departureTrainList;
//    }

    public StationJpo(){};

    public StationJpo(Station station){
        this.name = station.getName();
    }

    public Station toDomain(){
        Station station = new Station();
        station.setId(this.id);
        station.setName(this.name);

        return station;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(String name) {
//        this.name = name;
//    }

//    public void setDepartureTrainList(List<Train> departureTrainList){
//        this.departureTrainList = departureTrainList;
//    }
//
//    public List<Train> getArrivalTrainList(){
//        return arrivalTrainList;
//    }
//
//    public void setArrivalTrainList(List<Train> arrivalTrainList){
//        this.arrivalTrainList = arrivalTrainList;
//    }
}
