package com.midsangam.utx.store.jpastore;

import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.store.TrainStationRelationStore;
import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;
import com.midsangam.utx.store.jpastore.repository.TrainStationRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainStationRelationJpaStore implements TrainStationRelationStore {

    @Autowired
    private TrainStationRelationRepository trainStationRelationRepository;

    @Override
    public int createTrainStationRelation(TrainStationRelation trainStationRelation) {
        TrainStationRelationJpo trainStationRelationJpo = new TrainStationRelationJpo(trainStationRelation);

        System.out.println(trainStationRelationJpo.toString());

        trainStationRelationRepository.save(trainStationRelationJpo);
        return trainStationRelation.getId();
    }

    @Override
    public List<TrainStationRelation> findTrainStationRelationByTrainId(int trainId) {
        return null;
    }

    @Override
    public List<TrainStationRelation> findTrainStationRelationByStationId(int stationId) {
        return null;
    }

    @Override
    public List<TrainStationRelation> findAllTrainStationRelation() {
        return null;
    }

    @Override
    public void updateTrainStationRelation(TrainStationRelation trainStationRelation) {

    }

    @Override
    public void deleteTrainStationRelation(int trainStationRelationId) {

    }
}
