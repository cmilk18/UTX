package com.midsangam.utx.model;

import com.midsangam.utx.Dto.CustomerDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public
class Customer {

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

    public Customer(CustomerDto customerDto){
        id = customerDto.getId();
        password = customerDto.getPassword();
        name = customerDto.getName();
        age = customerDto.getAge();
        email = customerDto.getEmail();
        phoneNumber = customerDto.getPhoneNumber();
        level = customerDto.getLevel();
        point = customerDto.getPoint();
        cardName = customerDto.getCardName();
        cardNumber = customerDto.getCardNumber();
    }

}
