package com.company;

import java.util.Random;

public class Baby implements Runnable{
int time;
String name;


    public Baby(String name) {
        this.name = name;
        Random rand = new Random();
        time = rand.nextInt(5000);
    }


    public void run() {

        try {
            System.out.println("My name is "+ name +" I am going to sleep for "+time);
            Thread.sleep(time);
            System.out.println("My name is, " + name+" I am awake, feed me!!! ");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
