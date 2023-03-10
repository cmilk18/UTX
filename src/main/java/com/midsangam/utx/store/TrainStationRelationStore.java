package com.midsangam.utx.store;




import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;
import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;

import java.util.List;

public interface TrainStationRelationStore {

    public int createTrainStationRelation(TrainStationRelation train);
    public List<TrainStationRelation> findTrainStationRelationByTrainId(int trainId);
    public List<TrainStationRelationJpo> findTrainStationRelationByStation(StationJpo stationJpo);
    public List<TrainStationRelationJpo> findAllTrainStationRelationJpo();
    public void updateTrainStationRelation(TrainStationRelationJpo trainStationRelationJpo);
    public void deleteTrainStationRelation(int trainStationRelationId);
}
