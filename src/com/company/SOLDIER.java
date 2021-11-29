package com.company;

public class SOLDIER extends Person {
    private String alias;
    private int yearService;

    public SOLDIER(String name, int age) {
        super(name, age);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getYearService() {
        return yearService;
    }

    public void setYearService(int yearService) {
        this.yearService = yearService;
    }

    @Override
    public Person getCom() {
        return super.getCom();
    }

    @Override
    public void setCom(Person com) {
        super.setCom(com);
    }
}
