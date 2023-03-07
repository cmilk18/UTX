package com.midsangam.utx.store.jpastore.jpo;

import com.midsangam.utx.model.Station;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
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
