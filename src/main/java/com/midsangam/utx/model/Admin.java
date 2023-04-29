package com.midsangam.utx.model;

import com.midsangam.utx.Dto.AdminDto;
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
class Admin {

    @Id
    private String id;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;

    public Admin(AdminDto adminDto){
        id = adminDto.getId();
        password = adminDto.getPassword();
        name = adminDto.getName();
        email = adminDto.getEmail();
        phoneNumber = adminDto.getPhoneNumber();
    }

}
