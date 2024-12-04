package com.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "bus_stations")
public class BusStation {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="departure_time")
    private LocalTime departureTime;

    @Column(name="order_number")
    private String orderNumber;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "stations_id")
    private Station station;

}