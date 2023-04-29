package com.midsangam.utx.model;

import com.midsangam.utx.Dto.TicketDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "seat")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String departureTime;
    private String departureStation;
    private String arrivalTime;
    private String arrivalStation;
    private String price;
    private String requiredTime;

    private String purchaseStatus;

    @ManyToOne
    private Seat seat;

    @ManyToOne
    private Customer customer;

    public Ticket(TicketDto ticketDto){
        departureTime = ticketDto.getDepartureTime();
        departureStation = ticketDto.getDepartureStation();
        arrivalTime = ticketDto.getArrivalTime();
        arrivalStation = ticketDto.getArrivalStation();
        price = ticketDto.getPrice();
        requiredTime = ticketDto.getRequiredTime();
        purchaseStatus = ticketDto.getPurchaseStatus();
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRequiredTime() {
        return requiredTime;
    }

    public void setRequiredTime(String requiredTime) {
        this.requiredTime = requiredTime;
    }


}
