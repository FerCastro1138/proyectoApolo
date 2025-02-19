package com.fesc.student_attention.repositories;

import com.fesc.student_attention.entities.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Integer> {
    List<Schedule> findScheduleByAbailavility(boolean availability);
}
