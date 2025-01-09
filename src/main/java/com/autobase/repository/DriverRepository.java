package com.autobase.repository;

import com.autobase.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    // Додаткові методи, якщо необхідно
}
