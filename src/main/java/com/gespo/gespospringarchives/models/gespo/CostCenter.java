package com.gespo.gespospringarchives.models.gespo;

public class CostCenter {

    private String cnpj;
    private String name;

    public CostCenter(String cnpj, String name) {
        this.cnpj = cnpj;
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
