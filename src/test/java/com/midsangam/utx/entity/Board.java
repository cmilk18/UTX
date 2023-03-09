package com.midsangam.utx.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Board {

    @Id
    private String email;
    private String password;
    private String name;

    @ManyToOne
    private Member writer;
}
