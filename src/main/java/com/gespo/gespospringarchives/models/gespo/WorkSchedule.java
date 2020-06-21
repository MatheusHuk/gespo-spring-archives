package com.gespo.gespospringarchives.models.gespo;

import java.util.Date;

public class WorkSchedule {

    private Integer id;
    private Date creationDate;
    private Date lastupdateDate;
    private Double amountHours;
    private String dsWork;
    private Project project;
    private Employee employee;

    public WorkSchedule(Integer id, Date creationDate, Date lastupdateDate, Double amountHours,
                        String dsWork, Project project, Employee employee) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastupdateDate = lastupdateDate;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastupdateDate() {
        return lastupdateDate;
    }

    public void setLastupdateDate(Date lastupdateDate) {
        this.lastupdateDate = lastupdateDate;
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
