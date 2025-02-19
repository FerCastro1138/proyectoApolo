package com.fesc.student_attention.persistence;

import com.fesc.student_attention.entities.Schedule;

import java.util.List;

public interface ScheduleDAO {
    List<Schedule> findAll();
    void save(Schedule schedule);
    void deleteById(int id);
    List<Schedule> findScheduleByAbailavility(boolean availability);
}
