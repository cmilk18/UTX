package com.midsangam.utx.store.jpastore.repository;


import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainStationRelationRepository extends JpaRepository<TrainStationRelationJpo, Integer> {
}