package com.bootcoding.service;

import com.bootcoding.model.DailySchedule;
import com.bootcoding.repository.DailyScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DailyScheduleServiceImpl implements DailyScheduleService {

    @Autowired
    private DailyScheduleRepository dailyScheduleRepository;

    @Override
    public List<DailySchedule> getAllDailySchedules() {
        return dailyScheduleRepository.findAll();
    }

    @Override
    public DailySchedule getDailyScheduleById(int id) {
        return dailyScheduleRepository.findById(id).orElse(null);
    }

    @Override
    public DailySchedule createDailySchedule(DailySchedule dailySchedule) {
        return dailyScheduleRepository.save(dailySchedule);
    }

    @Override
    public DailySchedule updateDailySchedule(int id, DailySchedule updatedSchedule) {
        DailySchedule existingSchedule = dailyScheduleRepository.findById(id).orElse(null);
        if (existingSchedule != null) {
            // Update fields of existingSchedule with those from updatedSchedule
            // Then save the existingSchedule
            return dailyScheduleRepository.save(existingSchedule);
        }
        return null; // Handle the case where the schedule doesn't exist
    }

    @Override
    public void deleteDailySchedule(int id) {
        dailyScheduleRepository.deleteById(id);
    }
}


