package creational_pattern.singleton_pattern;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    //it can't be instantiate anymore
    private SingleObject() {}

    public static SingleObject getInstance()
    {
        return instance;
    }
    void message()
    {
        System.out.println("I am single...ALWAYS!");
    }
}
