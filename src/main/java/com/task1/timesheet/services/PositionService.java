package com.task1.timesheet.services;

import com.task1.timesheet.entities.PositionEntity;
import com.task1.timesheet.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public Iterable<PositionEntity> listPosition(){
        return positionRepository.findAll();
    }

}
