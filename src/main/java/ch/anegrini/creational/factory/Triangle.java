package ch.anegrini.creational.factory;

public class Triangle implements Shape {

    public Triangle() {}

    @Override
    public String getArea() {
        return "B * H / 2";
    }

}
