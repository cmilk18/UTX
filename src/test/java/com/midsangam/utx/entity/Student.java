package com.midsangam.utx.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Student {

    @Id
    public int id;

    public String name;

    public Student(String name){
        this.name = name;
    }
}
