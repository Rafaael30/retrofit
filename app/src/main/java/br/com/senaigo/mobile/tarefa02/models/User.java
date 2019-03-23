package br.com.senaigo.mobile.tarefa02.models;

import android.location.Address;

import java.util.List;

public class User {

    private Integer id;

    private String name;

    private String username;

    private String email;

    private List<Address> adrresses;

    private String phone;

    private String website;

    private List<Company> company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAdrresses() {
        return adrresses;
    }

    public void setAdrresses(List<Address> adrresses) {
        this.adrresses = adrresses;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }
}
