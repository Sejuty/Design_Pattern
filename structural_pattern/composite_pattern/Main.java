package structural_pattern.composite_pattern;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("oooooo","001");
        Developer dev2 = new Developer("pppppp","002");

        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.add(dev1);
        devDirectory.add(dev2);


        Manager m1 = new Manager("xxxxxxx","M01");
        Manager m2 = new Manager("yyyyyyy","M02");

        CompanyDirectory managerDirectory = new CompanyDirectory();
        managerDirectory.add(m1);
        managerDirectory.add(m2);


        CompanyDirectory directory = new CompanyDirectory();
        directory.add(managerDirectory);
        directory.add(devDirectory);

        //managerDirectory.showDetails();
        directory.showDetails();
    }
}
