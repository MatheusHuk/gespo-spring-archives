package com.gespo.gespospringarchives.models.gespo;

import java.util.Date;

public class WorkSchedule {

    private Integer id;
    private Date creationDate;
    private Double amountHours;
    private String dsWork;
    private Employee employee;
    private Project project;

    public WorkSchedule(Integer id, Date creationDate, Double amountHours, String dsWork, Employee employee, Project project) {
        this.id = id;
        this.creationDate = creationDate;
        this.amountHours = amountHours;
        this.dsWork = dsWork;
        this.employee = employee;
        this.project = project;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Double getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(Double amountHours) {
        this.amountHours = amountHours;
    }

    public String getDsWork() {
        return dsWork;
    }

    public void setDsWork(String dsWork) {
        this.dsWork = dsWork;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
