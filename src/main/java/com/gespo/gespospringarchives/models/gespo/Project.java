package com.gespo.gespospringarchives.models.gespo;

public class Project {

    private String name;
    private String dsProject;
    private String manager;
    private Integer isDone = 0;
    private CostCenter costCenter;

    public Project(String name, String dsProject, String manager, Integer isDone, CostCenter costCenter) {
        this.name = name;
        this.dsProject = dsProject;
        this.manager = manager;
        this.isDone = isDone;
        this.costCenter = costCenter;
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
