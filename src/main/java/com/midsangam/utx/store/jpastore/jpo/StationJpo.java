package com.midsangam.utx.store.jpastore.jpo;

import com.midsangam.utx.model.Station;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Station")
public class StationJpo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public StationJpo(Station station){
        this.name = station.getName();
    }

    public Station toDomain(){
        Station station = new Station();
        station.setId(id);
        station.setName(name);

        return station;
    }
}
