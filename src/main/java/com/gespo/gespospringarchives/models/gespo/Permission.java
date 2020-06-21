package com.gespo.gespospringarchives.models.gespo;

import java.util.Date;

public class Permission {

    private Integer id;
    private Date creationDate;
    private Date lastUpdateDate;
    private String dsPermission;

    public Permission(Integer id, Date creationDate, Date lastUpdateDate, String dsPermission) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.dsPermission = dsPermission;
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

    public String getDsPermission() {
        return dsPermission;
    }

    public void setDsPermission(String dsPermission) {
        this.dsPermission = dsPermission;
    }

}
