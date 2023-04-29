package com.midsangam.utx.Dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    @Id
    private String id;
    private String password;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String level;
    private int point;
    private String cardName;
    private String cardNumber;

}
