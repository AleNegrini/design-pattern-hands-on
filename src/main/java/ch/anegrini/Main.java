package ch.anegrini;

import ch.anegrini.creational.factory.Shape;
import ch.anegrini.creational.factory.ShapeFactory;
import ch.anegrini.creational.singleton.NaiveSingleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("[NAIVE SINGLETON] If you see the same value, the singleton pattern works as expected");
        NaiveSingleton objectOne = NaiveSingleton.getInstance("Foo");
        NaiveSingleton objectTwo = NaiveSingleton.getInstance("Bar");

        System.out.println(objectOne.getValue());
        System.out.println(objectTwo.getValue());

        System.out.println("[FACTORY]");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeOne = shapeFactory.getShape(3);
        Shape shapeTwo = shapeFactory.getShape(4);

        System.out.println(shapeOne.getArea());
        System.out.println(shapeTwo.getArea());

    }
}