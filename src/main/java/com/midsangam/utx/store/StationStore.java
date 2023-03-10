package com.midsangam.utx.store.jpastore;

import com.midsangam.utx.model.Station;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;

import java.util.List;

public interface StationStore {

    public int createStation(Station station);
    public StationJpo findStationById(int stationId);
    public List<Station> findAllStation();
    public void updateStation(Station station);
    public void deleteStation(int stationId);
}
