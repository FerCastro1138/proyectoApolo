package com.fesc.student_attention.services.Impl;

import com.fesc.student_attention.entities.Schedule;
import com.fesc.student_attention.persistence.ScheduleDAO;
import com.fesc.student_attention.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleDAO scheduleDAO;

    @Override
    public List<Schedule> findAll() {
        return scheduleDAO.findAll();
    }

    @Override
    public void save(Schedule schedule) {
        scheduleDAO.save(schedule);
    }

    @Override
    public void deleteById(int id) {
        scheduleDAO.deleteById(id);
    }

    @Override
    public List<Schedule> findScheduleByAbailavility(boolean availability) {
        return scheduleDAO.findScheduleByAbailavility(availability);
    }
}
