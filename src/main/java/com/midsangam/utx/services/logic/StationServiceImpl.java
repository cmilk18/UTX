package com.midsangam.utx.services.logic;

import com.midsangam.utx.model.Station;
import com.midsangam.utx.services.StationService;
import com.midsangam.utx.store.jpastore.StationJpaStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    StationJpaStore stationJpaStore;
    @Override
    public Station findStationById(int stationId) {
        Station station = stationJpaStore.findStationById(stationId);
        return station;
    }

    @Override
    public int createStation(Station station) {
        return stationJpaStore.createStation(station);
    }

    @Override
    public String updateStation() {
        return null;
    }

    @Override
    public void deleteStation(int stationId) {
        stationJpaStore.deleteStation(stationId);
    }

    @Override
    public List<Station> findAllStation() {
        return stationJpaStore.findAllStation();
    }
}
