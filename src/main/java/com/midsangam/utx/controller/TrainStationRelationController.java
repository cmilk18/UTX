package com.midsangam.utx.controller;

import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.services.TrainStationRelationService;
import com.midsangam.utx.store.jpastore.jpo.TrainStationRelationJpo;
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

    @GetMapping("/{stationId}")
    public List<TrainStationRelationJpo> findTrainStationRelationJpoByStationId(@PathVariable int stationId){
        return trainStationRelationService.findTrainStationRelationByStationId(stationId);
    }

    @GetMapping("/all")
    public List<TrainStationRelationJpo> findAll(){
        return trainStationRelationService.findAllTrainStationRelationJpo();
    }

    // 업데이트
    @PutMapping("{trainStationRelationId}")
    public String update(@PathVariable int trainStationRelationId, @RequestBody TrainStationRelation trainStationRelation){
        trainStationRelationService.updateTrainStationRelation(trainStationRelationId, trainStationRelation);
        return null;
    }

    @DeleteMapping()
    public String delete(@PathVariable int trainStationRelationId){
        trainStationRelationService.deleteTrainStationRelation(trainStationRelationId);
        return "Deleted!";
    }
}
