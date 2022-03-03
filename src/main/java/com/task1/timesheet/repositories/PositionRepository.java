package com.task1.timesheet.repositories;

import com.task1.timesheet.entities.PositionEntity;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<PositionEntity, Long> {
}
