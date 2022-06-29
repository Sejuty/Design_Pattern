package creational_pattern.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        SingleObject ob = SingleObject.getInstance();
        ob.message();
    }
}
