package com.midsangam.utx.store;

import com.midsangam.utx.model.Station;
import com.midsangam.utx.model.Train;

import java.util.List;

public interface TrainStore {

    public int createTrain(Train train);
    public Train findTrainById(int trainId);
    public List<Train> findAllTrain();
    public void updateTrain(Train train);
    public void deleteTrain(int trainId);
}
