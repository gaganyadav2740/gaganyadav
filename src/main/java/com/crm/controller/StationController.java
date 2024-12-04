package com.crm.controller;

import com.crm.entity.Station;
import com.crm.repository.StationRepository;
import com.crm.service.StationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stations")
public class StationController {

   private StationRepository stationRepository;
   private StationService stationService;

   public StationController(StationRepository stationRepository, StationService stationService) {
       this.stationRepository = stationRepository;
       this.stationService = stationService;
   }

   @PostMapping("/add")
    public String createStation(@RequestBody Station station) {
       stationService.createStations(station);
       return "station successfully";
   }


}
