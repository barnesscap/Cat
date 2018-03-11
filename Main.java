package com.igor.sch;

public class Main {
    public static void main(String[] args) {

        Cat catOne = new Cat("Tom", 6, 6.5, true);
        Cat catTwo = new Cat("Puma", 4, 5.5, false);
        Cat catThree = new Cat("Abra", 8, 6, false);

        System.out.println(catOne.toString());
        System.out.println(catTwo.toString());
        System.out.println(catThree.toString());
    }
}
