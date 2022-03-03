package com.task1.timesheet.repositories;

import com.task1.timesheet.entities.TableEmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TableEmployeeRepository extends CrudRepository<TableEmployeeEntity, Long> {

    List<TableEmployeeEntity> findByEmployeeOrAbsenceDate(String name, String date);
    List<TableEmployeeEntity> findByEmployeeContainingOrAbsenceDate(String name, String date);
}
