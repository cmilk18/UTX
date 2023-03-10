package com.midsangam.utx.services;

import com.midsangam.utx.model.Station;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;

import java.util.List;

public interface StationService {

    public StationJpo findStationById(int stationId);

    public int createStation(Station station);

    public void updateStation(Station station);

    public void deleteStation(int stationId);

    public List<Station> findAllStation();
}
