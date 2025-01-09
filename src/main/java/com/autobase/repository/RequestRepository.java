package com.autobase.repository;

import com.autobase.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
    // Додаткові методи, якщо необхідно
}
