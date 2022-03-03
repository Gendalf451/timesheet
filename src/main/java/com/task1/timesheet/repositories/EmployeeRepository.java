package com.task1.timesheet.repositories;

import com.task1.timesheet.entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
