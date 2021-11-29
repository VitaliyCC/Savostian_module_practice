package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> headquarters = new ArrayList<>(9);
        headquarters.add(new SOLDIER("Іван Максаков1", 14));
        headquarters.add(new SOLDIER("Іван Максаков2", 29));
        headquarters.add(new SOLDIER("Іван Максаков3", 39));
        headquarters.add(new SOLDIER("Іван Максаков4", 49));
        headquarters.add(new SOLDIER("Іван Максаков5", 69));
        headquarters.add(new SOLDIER("Іван Максаков6", 79));
        headquarters.add(new COMMANDER("Петро Іванов", 79));
        headquarters.add(new COMMANDER("Макси Петров", 59));
        headquarters.add(new GENERAL("Віталій Савостян", 20));
        for (int i = 0; i < 3; i++) {
            headquarters.get(i).setCom(headquarters.get(6));
        }
        for (int i = 3; i < 6; i++) {
            headquarters.get(i).setCom(headquarters.get(7));
        }
        for (int i = 6; i <= 7; i++) {
            headquarters.get(i).setCom(headquarters.get(8));
        }

        for (Person person : headquarters) {
            try{
            person.REPORT();
            }
            catch (IllegalArgumentException e){System.out.println(e);}
        }
    }
}
