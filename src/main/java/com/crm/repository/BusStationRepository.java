package com.crm.repository;

import com.crm.entity.BusStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusStationRepository extends JpaRepository<BusStation, Long> {
}