package ch.anegrini.creational.singleton;

public class NaiveSingleton {

    private static NaiveSingleton instance;
    private String value;

    private NaiveSingleton(String value) {
        this.value = value;
    }

    public static NaiveSingleton getInstance(String value) {
        if( instance == null ) {
            instance = new NaiveSingleton(value);
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }
}
