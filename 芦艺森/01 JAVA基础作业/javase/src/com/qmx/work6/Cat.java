package com.qmx.work6;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }

    @Override
    public void getAnimalName() {
        System.out.println("Cat");
    }
}
