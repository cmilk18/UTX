package com.midsangam.utx.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@NoArgsConstructor
@Entity
public class School {

    @Id
    @Column(name = "id")
    public int id;
    @Column(name = "name")
    public String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_id")
    public Collection<Student> students;

    public School(String name){
        this.name = name;
    }
}
