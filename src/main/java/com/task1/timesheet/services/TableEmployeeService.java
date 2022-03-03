package com.task1.timesheet.services;

import com.task1.timesheet.entities.TableEmployeeEntity;
import com.task1.timesheet.repositories.TableEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TableEmployeeService {

    @Autowired
    private TableEmployeeRepository tableEmployeeRepository;

    public Iterable<TableEmployeeEntity> listTableEmployee(){
        return tableEmployeeRepository.findAll();
    }

    public List<TableEmployeeEntity> searchEmployee(String name, String date){
        if(name.equals("")) return tableEmployeeRepository.findByEmployeeOrAbsenceDate(name, date);
        else return tableEmployeeRepository.findByEmployeeContainingOrAbsenceDate(name, date);
    }

    public void addEmployee(TableEmployeeEntity tableEmployeeEntity){
        tableEmployeeRepository.save(tableEmployeeEntity);
    }
}
