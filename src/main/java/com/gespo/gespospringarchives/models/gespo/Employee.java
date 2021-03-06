package com.gespo.gespospringarchives.models.gespo;

import java.util.Date;

public class Employee {

    private Integer id;
    private Date creationDate;
    private Date lastUpdateDate;
    private String cpf;
    private String name;
    private String password;
    private String email;
    private Double hourValue;
    private String office;
    private Date dtBirth;
    // private Team team;
    private Category category;
    // private Permission permission;

    public Employee(Integer id, Date creationDate, Date lastUpdateDate, String cpf, String name, String password,
                    String email, Double hourValue, String office, Date dtBirth, Category category) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.cpf = cpf;
        this.name = name;
        this.password = password;
        this.email = email;
        this.hourValue = hourValue;
        this.office = office;
        this.dtBirth = dtBirth;
        // this.team = team;
        this.category = category;
        // this.permission = permission;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getHourValue() {
        return hourValue;
    }

    public void setHourValue(Double hourValue) {
        this.hourValue = hourValue;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Date getDtBirth() {
        return dtBirth;
    }

    public void setDtBirth(Date dtBirth) {
        this.dtBirth = dtBirth;
    }

    /*
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
     */

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    /*
    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
     */

}
