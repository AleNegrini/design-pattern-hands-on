package ch.anegrini.creational.factory;

public class ShapeFactory {

    public Shape getShape(int numberOfSides) {
        switch (numberOfSides) {
            case 3:
                return new Triangle();
            case 4:
                return new Square();
        }
        return null;
    }

}
