package com.bootcoding.repository;

import com.bootcoding.model.WeeklySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklyScheduleRepository extends JpaRepository<WeeklySchedule, Integer> {
}

