package com.crm.controller;


import com.crm.repository.BusStationRepository;
import com.crm.service.BusStationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/controller")
public class BusStationController {

    private BusStationService busStationService;
    private BusStationRepository busStationRepository;

    public BusStationController(BusStationService busStationService, BusStationRepository busStationRepository) {
        this.busStationService = busStationService;
        this.busStationRepository = busStationRepository;
    }
    //{{url}}/api/v1/controller/add/1/2
    @PostMapping("/add/{bid}/{sid}")
    public ResponseEntity<String> addBusDetail(RequestBody BusStations, @PathVariable long bid, @PathVariable long sid) {

//        busStationService.addBusDetails(stations, bid,sid);
        return new ResponseEntity<>("added BusDetail", HttpStatus.CREATED);
    }

}
