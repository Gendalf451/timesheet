package com.task1.timesheet.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;

    @Column(name = "FULL_NAME")
    private String fullName;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public EmployeeEntity() {
    }
}
