package com.gespo.gespospringarchives.models.gespo;

import java.util.Date;

public class Project {

    private Integer id;
    private Date creationDate;
    private Date lastUpdateDate;
    private String name;
    private String dsProject;
    private String manager;
    private Integer isDone;
    private CostCenter costCenter;

    public Project(Integer id, Date creationDate, Date lastUpdateDate, String name, String dsProject, String manager,
                   Integer isDone, CostCenter costCenter) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.dsProject = dsProject;
        this.manager = manager;
        this.isDone = isDone;
        this.costCenter = costCenter;
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

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsProject() {
        return dsProject;
    }

    public void setDsProject(String dsProject) {
        this.dsProject = dsProject;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getIsDone() {
        return isDone;
    }

    public void setIsDone(Integer isDone) {
        this.isDone = isDone;
    }

    public CostCenter getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(CostCenter costCenter) {
        this.costCenter = costCenter;
    }

}
