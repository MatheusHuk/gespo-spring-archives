package com.gespo.gespospringarchives.models.gespo;

import java.util.Date;

public class Category {

    private Integer id;
    private Date creationDate;
    private Date lastUpdateDate;
    private String dsCategory;

    public Category(Integer id, Date creationDate, Date lastUpdateDate, String dsCategory) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.dsCategory = dsCategory;
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

    public String getDsCategory() {
        return dsCategory;
    }

    public void setDsCategory(String dsCategory) {
        this.dsCategory = dsCategory;
    }

}
