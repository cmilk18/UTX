package com.midsangam.utx.services;

import com.midsangam.utx.model.TrainStationRelation;

import java.util.List;

public interface TrainStationRelationService {
    public int createTrainStationRelation(TrainStationRelation trainStationRelation);
    public List<TrainStationRelation> findTrainStationRelationByTrainId(int trainId);
    public List<TrainStationRelation> findTrainStationRelationByStationId(int stationId);
    public List<TrainStationRelation> findAllTrainStationRelation();
    public void updateTrainStationRelation(TrainStationRelation trainStationRelation);
    public void deleteTrainStationRelation(int trainStationRelationId);
}
