package com.niyongcheng.anonymous;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){

        Animal animal = new Animal() {
            public void run() {
                System.out.println("run");
            }

            public void canRun() {
                System.out.println("true");
            }
        };

        Bird bird = new Bird() {
            @Override
            void fly() {
                System.out.println("fly");
            }

            @Override
            boolean canRun() {
                return false;
            }
        };

        List<Object> a = new ArrayList<Object>(8);
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());
        a.add(new Object());

        a.forEach(System.out::println);
        //a.forEach(System.out::print);
    }
}
