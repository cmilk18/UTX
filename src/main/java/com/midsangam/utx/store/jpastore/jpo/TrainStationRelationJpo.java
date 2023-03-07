package com.midsangam.utx.store.jpastore.jpo;

import com.midsangam.utx.model.TrainStationRelation;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"station_id","train_id"})
@Table(name = "TrainStationRelation")
public class TrainStationRelationJpo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="station_id")
    private StationJpo station;

    @ManyToOne
    @JoinColumn(name="train_id")
    private TrainJpo train;

    private String arrival_time;

    private String departure_time;

    private String delay_time;

    private String stop_time;


    public TrainStationRelationJpo(TrainStationRelation trainStationRelation){

        StationJpo stationJpo = StationJpo.builder()
                .id(trainStationRelation.getStation_id())
                .build();

        TrainJpo trainJpo = TrainJpo.builder()
                .id(trainStationRelation.getTrain_id())
                .build();

        station = stationJpo;
        train = trainJpo;
        arrival_time = trainStationRelation.getArrival_time();
        departure_time = trainStationRelation.getDeparture_time();
        delay_time = trainStationRelation.getDelay_time();
        stop_time = trainStationRelation.getStop_time();
    }

    public TrainStationRelationJpo toDomain(TrainStationRelationJpo trainStationRelation){
        TrainStationRelationJpo trainStationRelationJpo = new TrainStationRelationJpo();
        return null;
    }
}
