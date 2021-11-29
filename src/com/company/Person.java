package com.company;

public class Person implements CAPABLE_FOR_FIGHTING_ACTIONS {
    private String name;
    private int age;
    private Person com;

    public Person() {
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getCom() {
        return com;
    }

    public void setCom(Person com) {
        this.com = com;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void I_CAN_FIGHT() throws IllegalArgumentException  {
        if (age<18)
           throw  new IllegalArgumentException("Minors cannot be military!");

        if (age > 60)
            System.out.println("I can't fight because of my age! But I can command!");
        else System.out.println("I can fight!");
    }

    @Override
    public void REPORT() throws IllegalArgumentException {
        System.out.println("I am " + name + ".");
        System.out.println("I am " + age + "years old.");
        if(com!=null)
        System.out.println("My commander "+com.getName());
        else System.out.println("I am GENERAL.");
        I_CAN_FIGHT();
    }
}
