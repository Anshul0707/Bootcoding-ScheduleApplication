package com.bootcoding.service.WeeklyScheduleService;


import com.bootcoding.model.WeeklySchedule;

import java.util.List;

public interface WeeklyScheduleService {
    List<WeeklySchedule> getAllWeeklySchedules();

    WeeklySchedule getWeeklyScheduleById(int id);

    WeeklySchedule createWeeklySchedule(WeeklySchedule weeklySchedule);

    WeeklySchedule updateWeeklySchedule(int id, WeeklySchedule weeklySchedule);

    void deleteWeeklySchedule(int id);
}
