package com.midsangam.utx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Station{

    private int id;
    private String name;
//    private List<Train> departureTrainList;
//    private List<Train> arrivalTrainList;


    public int getId() {
        return id;
    }

    public void setId(int idx) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Train> getDepartureTrainList(){
//        return departureTrainList;
//    }
//
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
