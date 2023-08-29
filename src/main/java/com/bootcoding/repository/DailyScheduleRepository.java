package com.bootcoding.repository;

import com.bootcoding.model.DailySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyScheduleRepository extends JpaRepository<DailySchedule, Integer> {
}

