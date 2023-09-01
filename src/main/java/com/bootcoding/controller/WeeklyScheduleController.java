package com.bootcoding.controller;

import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.service.WeeklyScheduleService.WeeklyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weekly-schedule")
public class WeeklyScheduleController {

    @Autowired
    private WeeklyScheduleService weeklyScheduleService;

    @GetMapping
    public List<WeeklySchedule> getAllWeeklySchedules() {
        return weeklyScheduleService.getAllWeeklySchedules();
    }


    @GetMapping("/{id}")
    public WeeklySchedule getWeeklyScheduleById(@PathVariable int id) {
        return weeklyScheduleService.getWeeklyScheduleById(id);
    }

    @PostMapping
    public WeeklySchedule createWeeklySchedule(@RequestBody WeeklySchedule weeklySchedule) {
        return weeklyScheduleService.createWeeklySchedule(weeklySchedule);
    }

    @PutMapping("/{id}")
    public WeeklySchedule updateWeeklySchedule(@PathVariable int id, @RequestBody WeeklySchedule updatedSchedule) {
        return weeklyScheduleService.updateWeeklySchedule(id, updatedSchedule);
    }

    @DeleteMapping("/{id}")
    public void deleteWeeklySchedule(@PathVariable int id) {
        weeklyScheduleService.deleteWeeklySchedule(id);
    }
}

