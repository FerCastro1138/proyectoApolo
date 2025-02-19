package com.fesc.student_attention.persistence.Impl;


import com.fesc.student_attention.entities.Schedule;
import com.fesc.student_attention.persistence.ScheduleDAO;
import com.fesc.student_attention.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScheduleDAOImpl implements ScheduleDAO {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public List<Schedule> findAll() {
        return (List<Schedule>) scheduleRepository.findAll();
    }

    @Override
    public void save(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    @Override
    public void deleteById(int id) {
        scheduleRepository.deleteById(id);
    }

    @Override
    public List<Schedule> findScheduleByAbailavility(boolean availability) {
        return scheduleRepository.findScheduleByAbailavility(availability);
    }
}
