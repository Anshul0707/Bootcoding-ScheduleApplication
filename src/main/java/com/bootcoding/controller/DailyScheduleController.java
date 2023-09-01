package com.bootcoding.controller;


import com.bootcoding.model.DailySchedule;
import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.service.DailyScheduleService.DailyScheduleService;
import com.bootcoding.service.WeeklyScheduleService.WeeklyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/daily-schedule")
public class DailyScheduleController {

    @Autowired
    private DailyScheduleService dailyScheduleService;


    @Autowired
    private WeeklyScheduleService weeklyScheduleService;

    @GetMapping
    public List<DailySchedule> getAllDailySchedules() {
        return dailyScheduleService.getAllDailySchedules();
    }

    @GetMapping("/{id}")
    public DailySchedule getDailyScheduleById(@PathVariable int id) {
        return dailyScheduleService.getDailyScheduleById(id);
    }

    @PostMapping
    public DailySchedule createDailySchedule(@RequestBody DailySchedule dailySchedule) {
        // Get the associated WeeklySchedule by its ID
        WeeklySchedule associatedWeeklySchedule = weeklyScheduleService.getWeeklyScheduleById(dailySchedule.getWeeklySchedule().getId());

        // Set the associated WeeklySchedule for the DailySchedule
        dailySchedule.setWeeklySchedule(associatedWeeklySchedule);

        // Save the DailySchedule
        return dailyScheduleService.createDailySchedule(dailySchedule);
    }

    @PutMapping("/{id}")
    public DailySchedule updateDailySchedule(@PathVariable int id, @RequestBody DailySchedule updatedSchedule) {
        return dailyScheduleService.updateDailySchedule(id, updatedSchedule);
    }

    @DeleteMapping("/{id}")
    public void deleteDailySchedule(@PathVariable int id) {
        dailyScheduleService.deleteDailySchedule(id);
    }
}


