package com.midsangam.utx.store;




import com.midsangam.utx.model.TrainStationRelation;

import java.util.List;

public interface TrainStationRelationStore {

    public int createTrainStationRelation(TrainStationRelation train);
    public List<TrainStationRelation> findTrainStationRelationByTrainId(int trainId);
    public List<TrainStationRelation> findTrainStationRelationByStationId(int stationId);
    public List<TrainStationRelation> findAllTrainStationRelation();
    public void updateTrainStationRelation(TrainStationRelation trainStationRelation);
    public void deleteTrainStationRelation(int trainStationRelationId);
}
