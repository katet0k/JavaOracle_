package com.autobase.repository;

import com.autobase.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
    // Додаткові методи, якщо необхідно
}
