package com.midsangam.utx.store.jpastore.jpo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@ToString(exclude = {"station_id","train_id"})
public class TrainStationRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="station_id")
    private StationJpo station_id;

    @ManyToOne
    @JoinColumn(name="train_id")
    private TrainJpo train_id;

    private String arrival_time;

    private String departure_time;

    private String delay_time;

    private String stop_time;
}
