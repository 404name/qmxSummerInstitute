package com.qmx.work6;

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }

    @Override
    public void getAnimalName() {
        System.out.println("Dog");
    }
}
