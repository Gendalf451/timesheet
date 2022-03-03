package com.task1.timesheet.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tstaff")
public class TableEmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;

    @Column(name = "EMPLOYEE")
    @NotBlank
    private String employee;

    @Column(name = "POSITION")
    @NotBlank
    private String position;

    @Column(name = "ABSENCE_DATE")
    @NotBlank
    private String absenceDate;

    @Column(name = "ABSENCE_TIME")
    @NotBlank
    private String absenceTime;

    @Column(name = "ABSENCE_REASON")
    @NotBlank
    private String absenceReason;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAbsenceDate() {
        return absenceDate;
    }

    public void setAbsenceDate(String absenceDate) {
        this.absenceDate = absenceDate;
    }

    public String getAbsenceTime() {
        return absenceTime;
    }

    public void setAbsenceTime(String absenceTime) {
        this.absenceTime = absenceTime;
    }

    public String getAbsenceReason() {
        return absenceReason;
    }

    public void setAbsenceReason(String absenceReason) {
        this.absenceReason = absenceReason;
    }

    public TableEmployeeEntity(){
    }

    public TableEmployeeEntity(String employee, String position, String absenceDate, String absenceTime, String absenceReason) {
        this.employee = employee;
        this.position = position;
        this.absenceDate = absenceDate;
        this.absenceTime = absenceTime;
        this.absenceReason = absenceReason;
    }
}
