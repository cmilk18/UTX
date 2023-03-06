package com.midsangam.utx.controller;

import com.midsangam.utx.model.Train;
import com.midsangam.utx.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @PostMapping
    public String create(@RequestBody Train train){
        trainService.createTrain(train);
        return "new Train Created";
    }

    @GetMapping("/{trainId}")
    public Train read(@PathVariable int trainId){
        Train train = trainService.findTrainById(trainId);
        return train;
    }

    @GetMapping("/all")
    public List<Train> readAll(){
        List<Train> trains= trainService.findAllTrain();
        return trains;
    }

    @PutMapping("/{trainId}")
    public String update(@PathVariable int trainId,@RequestBody Train train){
        train.setId(trainId);
        trainService.updateTrain(train);
        return "Train Updated";
    }

    @DeleteMapping("/{trainId}")
    public String delete(@PathVariable int trainId){
        trainService.deleteTrain(trainId);
        return "Train Deleted";
    }
}
