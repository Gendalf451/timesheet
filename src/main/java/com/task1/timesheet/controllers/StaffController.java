package com.task1.timesheet.controllers;

import com.task1.timesheet.entities.TableEmployeeEntity;
import com.task1.timesheet.services.EmployeeService;
import com.task1.timesheet.services.PositionService;
import com.task1.timesheet.services.TableEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/main")
public class StaffController {

    @Autowired
    private TableEmployeeService tableEmployeeService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private PositionService positionService;

    @GetMapping("/")
    public String listStaff(Model model){
        model.addAttribute("staff", tableEmployeeService.listTableEmployee());
        return "staff";
    }

    @GetMapping("/add")
    public String addEmployee(Model model){
        model.addAttribute("employee", employeeService.listEmployee());
        model.addAttribute("position", positionService.listPosition());
        return "addEmployee";
    }

    @PostMapping("/add")
    public String addEmployee(@Valid TableEmployeeEntity tableEmployeeEntity){
        tableEmployeeService.addEmployee(tableEmployeeEntity);
        return "successfully";
    }

    @PostMapping ("filter")
    public String search(@RequestParam String employee, @RequestParam String absenceDate,Model model){
        model.addAttribute("staff", tableEmployeeService.searchEmployee(employee, absenceDate));
        return "staff";
    }

}
