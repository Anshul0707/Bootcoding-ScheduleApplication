package com.bootcoding.controller;


import com.bootcoding.model.DailySchedule;
import com.bootcoding.service.DailyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/daily-schedule")
public class DailyScheduleController {

    @Autowired
    private DailyScheduleService dailyScheduleService;

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


