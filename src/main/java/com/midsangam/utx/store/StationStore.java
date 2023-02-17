package com.midsangam.utx.store.jpastore;

import com.midsangam.utx.model.Station;

import java.util.List;

public interface StationStore {

    public int createStation(Station station);
    public Station findStationById(int stationId);
    public List<Station> findAllStation();

    public void deleteStation(int stationId);
}
