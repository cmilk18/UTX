package com.midsangam.utx.store.jpastore;

import com.midsangam.utx.model.Station;
import com.midsangam.utx.store.jpastore.jpo.StationJpo;
import com.midsangam.utx.store.jpastore.repository.StationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class StationJpaStore implements com.midsangam.utx.store.jpastore.StationStore {

    private StationRepository stationRepository;

    public StationJpaStore(StationRepository stationRepository){
        this.stationRepository = stationRepository;
    }

    @Override
    public int createStation(Station station) {
        stationRepository.save(new StationJpo(station));
        return station.getId();
    }

    @Override
    public Station findStationById(int stationId) {
        Optional<StationJpo> stationJpo = stationRepository.findById(stationId);
        return stationJpo.get().toDomain();
    }

    @Override
    public List<Station> findAllStation() {
        List<StationJpo> stationJpos = stationRepository.findAll();
        return stationJpos.stream().map(stationJpo -> stationJpo.toDomain()).collect(Collectors.toList());
    }

    @Override
    public void updateStation(Station station) {
        stationRepository.save(new StationJpo(station));
    }

    @Override
    public void deleteStation(int stationId) {
        stationRepository.deleteById(stationId);
    }


}
