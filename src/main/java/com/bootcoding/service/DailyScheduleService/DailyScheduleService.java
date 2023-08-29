package com.bootcoding.service.DailyScheduleService;

import com.bootcoding.model.DailySchedule;
import java.util.List;

public interface DailyScheduleService {
    List<DailySchedule> getAllDailySchedules();
    DailySchedule getDailyScheduleById(int id);
    DailySchedule createDailySchedule(DailySchedule dailySchedule);
    DailySchedule updateDailySchedule(int id, DailySchedule updatedSchedule);
    void deleteDailySchedule(int id);
}


