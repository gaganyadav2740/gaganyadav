package com.crm.service;

import com.crm.entity.Station;
import com.crm.repository.StationRepository;
import org.springframework.stereotype.Service;

@Service
public class StationService {
    private StationRepository stationRepository;

    public StationService(StationRepository stationRepository){
        this.stationRepository = stationRepository;
    }
    public void createStations(Station station){
        stationRepository.save(station);
    }
}
