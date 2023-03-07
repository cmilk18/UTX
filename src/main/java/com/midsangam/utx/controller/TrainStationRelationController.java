package com.midsangam.utx.controller;

import com.midsangam.utx.model.TrainStationRelation;
import com.midsangam.utx.services.TrainStationRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainstationrelation")
public class TrainStationRelationController {

    @Autowired
    TrainStationRelationService trainStationRelationService;

    @PostMapping
    public String create(@RequestBody TrainStationRelation trainStationRelation){
        int a = trainStationRelationService.createTrainStationRelation(trainStationRelation);
        System.out.println(a);
//        System.out.println(trainStationRelation.toString());
        return "New Created!";
    }
}
