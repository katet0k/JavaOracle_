package com.autobase.repository;

import com.autobase.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // Додаткові методи, якщо необхідно
}
