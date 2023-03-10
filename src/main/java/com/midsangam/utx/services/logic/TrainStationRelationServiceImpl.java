package com.midsangam.utx.services.logic;

import com.midsangam.utx.model.Station;
import com.midsangam.utx.model.Train;
import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.services.TrainStationRelationService;
import com.midsangam.utx.store.jpastore.StationJpaStore;
import com.midsangam.utx.store.jpastore.TrainStationRelationJpaStore;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;
import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainStationRelationServiceImpl implements TrainStationRelationService {

    @Autowired
    private TrainStationRelationJpaStore trainStationRelationJpaStore;

    @Autowired
    private StationJpaStore stationJpaStore;

    @Override
    public int createTrainStationRelation(TrainStationRelation trainStationRelation) {
        return trainStationRelationJpaStore.createTrainStationRelation(trainStationRelation);
    }

    @Override
    public List<TrainStationRelation> findTrainStationRelationByTrainId(int trainId) {
        return null;
    }

    @Override
    public List<TrainStationRelationJpo> findTrainStationRelationByStationId(int stationId) {
        StationJpo stationJpo = stationJpaStore.findStationById(stationId);
        List<TrainStationRelationJpo> trainStationRelationJpos = trainStationRelationJpaStore.findTrainStationRelationByStation(stationJpo);
        return trainStationRelationJpos;
    }

    @Override
    public List<TrainStationRelationJpo> findAllTrainStationRelationJpo() {
        return trainStationRelationJpaStore.findAllTrainStationRelationJpo();
    }

    @Override
    public void updateTrainStationRelation(int trainStationRelationId, TrainStationRelation trainStationRelation) {
        TrainStationRelationJpo trainStationRelationJpo = new TrainStationRelationJpo(trainStationRelation);
        trainStationRelationJpo.setId(trainStationRelationId);
        trainStationRelationJpaStore.updateTrainStationRelation(trainStationRelationJpo);
    }

    @Override
    public void deleteTrainStationRelation(int trainStationRelationId) {
        trainStationRelationJpaStore.deleteTrainStationRelation(trainStationRelationId);
    }
}
