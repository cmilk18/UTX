package com.midsangam.utx.Dto;

import lombok.*;

import javax.persistence.Id;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {

    @Id
    private String id;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;

}
