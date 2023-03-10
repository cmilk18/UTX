package com.midsangam.utx.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Builder
@Getter
@Setter
@ToString
public class TicketDto {

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

    private int seat_id;
}
