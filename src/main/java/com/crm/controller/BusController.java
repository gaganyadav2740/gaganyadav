package com.crm.controller;
import com.crm.entity.Bus;
import com.crm.repository.BusRepository;
import com.crm.service.BusService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    private BusRepository busRepository;
    private  BusService busService;

    public BusController(BusService busService,BusRepository busRepository){
        this.busService = busService;
        this.busRepository = busRepository;

    }

    @PostMapping("/add")
    public String createBus(
            @RequestBody Bus bus) {

        Bus bus1 = busService.createBus(bus);
        return "Bus Created successfully";

    }



}
