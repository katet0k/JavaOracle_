package com.autobase.service;

import com.autobase.model.Trip;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class LoggingService {

    private final String logFilePath = "trip_logs.txt";

    public void logTrip(Trip trip) {
        try (FileWriter writer = new FileWriter(logFilePath, true)) {
            writer.append("Trip ID: " + trip.getId())
                  .append(" Driver: " + trip.getDriver().getName())
                  .append(" Vehicle: " + trip.getVehicle().getModel())
                  .append(" Destination: " + trip.getRequest().getDestination())
                  .append(" Status: " + trip.getTripStatus())
                  .append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
