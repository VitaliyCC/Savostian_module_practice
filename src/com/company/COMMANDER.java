package com.company;

public class COMMANDER extends Person {
    private String headquarters;
    private int comm;

    public COMMANDER(String name, int age) {
        super(name, age);
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public COMMANDER() {
        super();
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
