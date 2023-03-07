package com.midsangam.utx.services.logic;

import com.midsangam.utx.model.Train;
import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.services.TrainStationRelationService;
import com.midsangam.utx.store.jpastore.TrainStationRelationJpaStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainStationRelationServiceImpl implements TrainStationRelationService {

    @Autowired
    private TrainStationRelationJpaStore trainStationRelationJpaStore;

    @Override
    public int createTrainStationRelation(TrainStationRelation trainStationRelation) {
        return trainStationRelationJpaStore.createTrainStationRelation(trainStationRelation);
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
