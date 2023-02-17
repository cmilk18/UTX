package com.midsangam.utx.services.logic;

import com.midsangam.utx.model.Train;
import com.midsangam.utx.services.TrainService;
import com.midsangam.utx.store.jpastore.TrainJpaStore;
import com.midsangam.utx.store.jpastore.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainJpaStore trainJpaStore;

    @Override
    public int createTrain(Train train) {
        return trainJpaStore.createTrain(train);
    }
    @Override
    public Train findTrainById(int trainId) {
        Train train = trainJpaStore.findTrainById(trainId);
        return train;
    }

    @Override
    public List<Train> findAllTrain() {
        List<Train> trains = trainJpaStore.findAllTrain();
        return trains;
    }

    @Override
    public String updateTrain() {
        return null;
    }

    @Override
    public void deleteTrain(int trainId) {
        trainJpaStore.deleteTrain(trainId);
    }
}
