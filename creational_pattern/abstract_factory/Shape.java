package creational_pattern.abstract_factory;

interface Furniture {
    void use();
}

class Chair implements Furniture {
    @Override
    public void use() {
        System.out.println("To sit on");
    }
}

class Table implements Furniture {
    @Override
    public void use() {
        System.out.println(" For Coffee");
    }
}

class Sofa implements Furniture {
    @Override
    public void use() {
        System.out.println("To sleep");
    }
}

interface Type {
    void type();
}

class Modern implements Type {
    @Override
    public void type() {
        System.out.println("Modern Type");
    }
}

class Victorian implements Type {
    @Override
    public void type() {
        System.out.println("Victorian Type");
    }
}

class Classic implements Type {
    @Override
    public void type() {
        System.out.println("Classic Type");
    }
}

interface AbstractFactory {
    Furniture getFurniture(String f);
    Type getType(String f);
}

class FurnitureFactory implements AbstractFactory {
    @Override
    public Furniture getFurniture(String f) {
        if (f == null)
            return null;
        if (f.equalsIgnoreCase("Chair"))
            return new Chair();
        else if (f.equalsIgnoreCase("Table"))
            return new Table();
        else if (f.equalsIgnoreCase("Sofa"))
            return new Sofa();
        return null;
    }

    @Override
    public Type getType(String f) {
        return null;
    }
}

class typeFactory implements AbstractFactory {
    @Override
    public Furniture getFurniture(String f) {
        return null;
    }

    @Override
    public Type getType(String f) {
        if (f == null)
            return null;
        if (f.equalsIgnoreCase("Modern"))
            return new Modern();
        else if (f.equalsIgnoreCase("Classic"))
            return new Classic();
        else if (f.equalsIgnoreCase("Victorian"))
            return new Victorian();
        return null;
    }
}
class FactoryCreator{

    public static AbstractFactory getFactory( String factory) {
        if(factory.equalsIgnoreCase("Furniture"))
            return new FurnitureFactory();
        else if(factory.equalsIgnoreCase("Type"))
            return new typeFactory();
        return null;
    }
}
class Test{
    public static void main(String[] args) {
        AbstractFactory furnitureFactory = FactoryCreator.getFactory("Furniture");
        AbstractFactory typeFactory = FactoryCreator.getFactory("Type");
        Furniture f =  furnitureFactory.getFurniture("Chair");
        Type t =  typeFactory.getType("Modern");
        f.use();
        t.type();
    }
}
