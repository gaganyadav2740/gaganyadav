package com.crm.service;

import com.crm.entity.Bus;
import com.crm.entity.Station;
import com.crm.repository.BusRepository;
import com.crm.repository.BusStationRepository;
import com.crm.repository.StationRepository;
import org.springframework.stereotype.Service;

@Service
public class BusStationService {

    private BusStationRepository busStationRepository;
    private BusRepository busRepository;
    private StationRepository stationRepository;

    public BusStationService(BusStationRepository busStationRepository, BusRepository busRepository, StationRepository stationRepository) {
        this.busStationRepository = busStationRepository;
        this.busRepository = busRepository;
        this.stationRepository = stationRepository;
    }

////    public void addBusDetails(BusStations bsStations,long bid,long sid){
//        Bus bus= busRepository.findById(bid).get();
//        Station station = stationRepository.findById(sid).get();
//
//        bsStations.setBus(bus);
//        bsStations.setStations(station);
//
//        busStationRepository.save(bsStations);
//    }
}
