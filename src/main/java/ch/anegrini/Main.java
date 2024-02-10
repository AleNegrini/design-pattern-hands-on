package ch.anegrini;

import ch.anegrini.creational.NaiveSingleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("[NAIVE SINGLETON] If you see the same value, the singleton pattern works as expected");
        NaiveSingleton objectOne = NaiveSingleton.getInstance("Foo");
        NaiveSingleton objectTwo = NaiveSingleton.getInstance("Bar");

        System.out.println(objectOne.getValue());
        System.out.println(objectTwo.getValue());

    }
}