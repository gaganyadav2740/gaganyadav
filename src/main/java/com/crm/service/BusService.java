package com.crm.service;

import com.crm.entity.Bus;
import com.crm.entity.Station;
import com.crm.repository.BusRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class BusService {


   private BusRepository busRepository;

   public BusService(BusRepository busRepository){
       this.busRepository = busRepository;

   }
   public Bus createBus( Bus bus){

       Bus save = busRepository.save(bus);
          return save;

   }

}
