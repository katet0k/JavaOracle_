package com.autobase.repository;

import com.autobase.model.RepairRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRequestRepository extends JpaRepository<RepairRequest, Long> {
    // Додаткові методи, якщо необхідно
}
