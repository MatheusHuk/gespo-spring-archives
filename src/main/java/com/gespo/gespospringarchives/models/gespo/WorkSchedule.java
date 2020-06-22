package com.gespo.gespospringarchives.models.gespo;

import java.time.LocalDate;
import java.util.Date;

public class WorkSchedule {

    private Integer id;
    private LocalDate creationDate;
    private Date lastUpdateDate;
    private Double amountHours;
    private String dsWork;
    private Project project;
    private Employee employee;

    public WorkSchedule(Integer id, LocalDate creationDate, Date lastUpdateDate, Double amountHours,
                        String dsWork, Project project, Employee employee) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.amountHours = amountHours;
        this.dsWork = dsWork;
        this.project = project;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastupdateDate() {
        return lastUpdateDate;
    }

    public void setLastupdateDate(Date lastupdateDate) {
        this.lastUpdateDate = lastupdateDate;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
