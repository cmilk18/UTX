package com.midsangam.utx.store.jpastore;

import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.store.TrainStationRelationStore;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;
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

        trainStationRelationRepository.save(trainStationRelationJpo);
        return trainStationRelation.getId();
    }

    @Override
    public List<TrainStationRelation> findTrainStationRelationByTrainId(int trainId) {
        return null;
    }

    @Override
    public List<TrainStationRelationJpo> findTrainStationRelationByStation(StationJpo stationJpo) {
        List<TrainStationRelationJpo> trainStationRelationJpos = trainStationRelationRepository.findByStationJpo(stationJpo);
        return trainStationRelationJpos;
    }

    @Override
    public List<TrainStationRelationJpo> findAllTrainStationRelationJpo() {
        List<TrainStationRelationJpo> trainStationRelationJpos = trainStationRelationRepository.findAll();
        return trainStationRelationJpos;
    }

    @Override
    public void updateTrainStationRelation(TrainStationRelationJpo trainStationRelationJpo) {
        trainStationRelationRepository.save(trainStationRelationJpo);
    }

    @Override
    public void deleteTrainStationRelation(int trainStationRelationId) {
        trainStationRelationRepository.deleteById(trainStationRelationId);
    }
}
