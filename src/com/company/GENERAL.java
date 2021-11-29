package com.company;

import java.util.ArrayList;
import java.util.List;

public class GENERAL extends Person {
    private List<COMMANDER> soldiers = new ArrayList<>(2);
    private int sal;

    public GENERAL(String name, int age) {
        super(name, age);
    }
}
