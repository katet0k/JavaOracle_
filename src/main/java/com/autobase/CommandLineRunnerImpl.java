package com.autobase;

import com.autobase.model.Request;
import com.autobase.model.Trip;
import com.autobase.service.DispatchService;
import com.autobase.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private DispatchService dispatchService;

    @Autowired
    private LoggingService loggingService;

    @Override
    public void run(String... args) throws Exception {
        Request request = new Request();
        request.setDestination("Kyiv");
        request.setCargoWeight(1000);
        request.setCargoType("Electronics");

        Trip trip = dispatchService.assignTrip(request);
        loggingService.logTrip(trip);

        dispatchService.completeTrip(trip);
    }
}
