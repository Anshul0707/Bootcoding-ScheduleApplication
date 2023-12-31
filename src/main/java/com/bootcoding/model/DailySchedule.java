package com.bootcoding.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "daily_schedule")
public class DailySchedule {
    @Id
    @GeneratedValue
    private int id;
    private int dayNumber;
    private String title;
    private String description;
    private String courseTopic;
    private String category;
    private String active;
    private Date createDate;
    private String createBy;
    private Date modifiedDate;
    private String modifiedBy;

    @ManyToOne
    @JoinColumn(name = "week_schedule_id")
    private WeeklySchedule weeklySchedule;
}
