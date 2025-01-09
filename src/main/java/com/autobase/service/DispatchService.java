package com.autobase.service;

import com.autobase.model.Driver;
import com.autobase.model.Request;
import com.autobase.model.Trip;
import com.autobase.model.Vehicle;
import com.autobase.repository.DriverRepository;
import com.autobase.repository.RequestRepository;
import com.autobase.repository.TripRepository;
import com.autobase.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispatchService {

    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private RequestRepository requestRepository;

    public Trip assignTrip(Request request) {
        Driver driver = driverRepository.findById(1L).orElseThrow(); // Логіка вибору водія
        Vehicle vehicle = vehicleRepository.findById(1L).orElseThrow(); // Логіка вибору автомобіля

        Trip trip = new Trip();
        trip.setRequest(request);
        trip.setDriver(driver);
        trip.setVehicle(vehicle);
        trip.setTripStatus("assigned");
        return tripRepository.save(trip);
    }

    public void completeTrip(Trip trip) {
        trip.setTripStatus("completed");
        trip.setPayment(1000); // Розрахунок виплат
        tripRepository.save(trip);

        Vehicle vehicle = trip.getVehicle();
        vehicle.setCondition("available");
        vehicleRepository.save(vehicle);
    }
}
