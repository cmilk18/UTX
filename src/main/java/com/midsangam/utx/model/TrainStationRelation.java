package com.midsangam.utx.model;

import com.midsangam.utx.store.jpastore.jpo.StationJpo;
import com.midsangam.utx.store.jpastore.jpo.TrainJpo;
import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Builder
@ToString
public class TrainStationRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int station_id;

    private int train_id;

    private String arrival_time;

    private String departure_time;

    private String delay_time;

    private String stop_time;

}
