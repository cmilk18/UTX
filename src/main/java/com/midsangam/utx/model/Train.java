package com.midsangam.utx.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

//@Getter
//@Setter
public class Train{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String departureTime;
    private String arrivalTime;
    private String delayTime;
//    private List<Seat> seatList;
//    private List<Station> stationList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    public String getDelayTime(){
        return delayTime;
    }

    public void setDelayTime(String delayTime){
        this.delayTime = delayTime;
    }

//    public List<Seat> getSeatList(){
//        return seatList;
//    }
//
//    public void setSeatList(List<Seat> seatList){
//        this.seatList = seatList;
//    }
//
//    public List<Station> getStationList(){
//        return stationList;
//    }
//
//    public void setStationList(List<Station> stationList){
//        this.stationList = stationList;
//    }

}
