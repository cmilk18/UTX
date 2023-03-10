package com.midsangam.utx.store.jpastore.repository;


import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;
import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainStationRelationRepository extends JpaRepository<TrainStationRelationJpo, Integer> {
    List<TrainStationRelationJpo> findByStationJpo(StationJpo stationJpo);
}