package designPattern.singleton;

public class Singleton {

    private static final Singleton singleton = new Singleton();
    public int a;
    public static Singleton getInstance() {
        return singleton;
    }
    private Singleton(){}
}
