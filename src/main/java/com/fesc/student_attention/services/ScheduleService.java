package com.fesc.student_attention.services;

import com.fesc.student_attention.entities.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> findAll();
    void save(Schedule schedule);
    void deleteById(int id);
    List<Schedule> findScheduleByAbailavility(boolean availability);
}
