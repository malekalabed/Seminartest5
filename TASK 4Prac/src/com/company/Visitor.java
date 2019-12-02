package com.company;

public class Visitor {
    private String name;
    private String company;

    public Visitor(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
