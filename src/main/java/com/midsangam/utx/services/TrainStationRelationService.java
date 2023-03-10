package com.midsangam.utx.services;

import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;

import java.util.List;

public interface TrainStationRelationService {
    public int createTrainStationRelation(TrainStationRelation trainStationRelation);
    public List<TrainStationRelation> findTrainStationRelationByTrainId(int trainId);
    public List<TrainStationRelationJpo> findTrainStationRelationByStationId(int stationId);
    public List<TrainStationRelationJpo> findAllTrainStationRelationJpo();
    public void updateTrainStationRelation(int trainStationRelationId, TrainStationRelation trainStationRelation);
    public void deleteTrainStationRelation(int trainStationRelationId);
}
