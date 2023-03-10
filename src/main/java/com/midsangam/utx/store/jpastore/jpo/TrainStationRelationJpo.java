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
    private StationJpo stationJpo;

    @ManyToOne
    @JoinColumn(name="train_id")
    private TrainJpo trainJpo;

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

        System.out.println(stationJpo.toString());

        this.stationJpo = stationJpo;
        this.trainJpo = trainJpo;
        arrival_time = trainStationRelation.getArrival_time();
        departure_time = trainStationRelation.getDeparture_time();
        delay_time = trainStationRelation.getDelay_time();
        stop_time = trainStationRelation.getStop_time();
    }

    public TrainStationRelation toDomain(){
        TrainStationRelation trainStationRelation = TrainStationRelation.builder()
                .id(id)
                .station_id(stationJpo.getId())
                .train_id(trainJpo.getId())
                .arrival_time(arrival_time)
                .departure_time(departure_time)
                .delay_time(delay_time)
                .stop_time(stop_time)
                .build();
        return trainStationRelation;
    }
}
