package com.bootcoding.service.WeeklyScheduleService;

import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.repository.WeeklyScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyScheduleServiceImpl implements WeeklyScheduleService {

    @Autowired
    private WeeklyScheduleRepository weeklyScheduleRepository;

    @Override
    public List<WeeklySchedule> getAllWeeklySchedules() {
        return weeklyScheduleRepository.findAll();
    }

    @Override
    public WeeklySchedule getWeeklyScheduleById(int id) {
        return weeklyScheduleRepository.findById(id).orElse(null);
    }

    @Override
    public WeeklySchedule createWeeklySchedule(WeeklySchedule weeklySchedule) {
        return weeklyScheduleRepository.save(weeklySchedule);
    }

    @Override
    public WeeklySchedule updateWeeklySchedule(int id, WeeklySchedule updatedSchedule) {
        WeeklySchedule existingSchedule = weeklyScheduleRepository.findById(id).orElse(null);
        if (existingSchedule != null) {
            return weeklyScheduleRepository.save(existingSchedule);
        }
        return null; // Handle the case where the schedule doesn't exist
    }

    @Override
    public void deleteWeeklySchedule(int id) {
        weeklyScheduleRepository.deleteById(id);
    }
}

