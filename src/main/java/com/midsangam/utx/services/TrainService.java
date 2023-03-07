package com.midsangam.utx.services;

import com.midsangam.utx.model.Train;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TrainService {


    public int createTrain(Train train);
    public Train findTrainById(int trainId);
    public List<Train> findAllTrain();
    public void updateTrain(Train train);

    public void deleteTrain(int trainId);
}
