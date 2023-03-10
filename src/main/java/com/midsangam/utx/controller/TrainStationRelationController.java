package com.midsangam.utx.controller;

import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.services.TrainStationRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainstationrelation")
public class TrainStationRelationController {

    @Autowired
    TrainStationRelationService trainStationRelationService;

    @PostMapping
    public String create(@RequestBody TrainStationRelation trainStationRelation){
        trainStationRelationService.createTrainStationRelation(trainStationRelation);
        return "New Created!";
    }

    @GetMapping("/all")
    public List<TrainStationRelation> findAll(){
        return trainStationRelationService.findAllTrainStationRelation();
    }

    // 업데이트
    @PutMapping
    public String update(){

        return null;
    }

    @DeleteMapping("{trainStationRelationId}")
    public String delete(@PathVariable int trainStationRelationId){
        trainStationRelationService.deleteTrainStationRelation(trainStationRelationId);
        return "Deleted!";
    }
}
