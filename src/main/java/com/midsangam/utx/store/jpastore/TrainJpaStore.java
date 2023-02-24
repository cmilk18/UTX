package com.midsangam.utx.store.jpastore;

import com.midsangam.utx.model.Station;
import com.midsangam.utx.model.Train;
import com.midsangam.utx.store.TrainStore;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;
import com.midsangam.utx.store.jpastore.jpo.TrainJpo;
import com.midsangam.utx.store.jpastore.repository.StationRepository;
import com.midsangam.utx.store.jpastore.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class TrainJpaStore implements TrainStore {

    @Autowired
    private TrainRepository trainRepository;

//    public TrainJpaStore(TrainRepository trainRepository){
//        this.trainRepository = trainRepository;
//    }
    @Override
    public int createTrain(Train train) {
        TrainJpo trainJpo = new TrainJpo(train);
        trainRepository.save(trainJpo);
        return train.getId();
    }

    @Override
    public Train findTrainById(int trainId) {
        Optional<TrainJpo> trainJpo = trainRepository.findById(trainId);
        Train train = trainJpo.get().toDomain();

        return train;
    }

    @Override
    public List<Train> findAllTrain() {
        List<TrainJpo> trainJpos = trainRepository.findAll();
        return trainJpos.stream().map(trainJpo -> trainJpo.toDomain()).collect(Collectors.toList());
    }

    @Override
    public void updateTrain(Train train) {
        trainRepository.save(new TrainJpo(train));
    }

    @Override
    public void deleteTrain(int trainId) {
        trainRepository.deleteById(trainId);
    }
}
