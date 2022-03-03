package com.task1.timesheet.services;

import com.task1.timesheet.entities.EmployeeEntity;
import com.task1.timesheet.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<EmployeeEntity> listEmployee(){
        return employeeRepository.findAll();
    }
}
