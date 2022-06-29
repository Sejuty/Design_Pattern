package structural_pattern.composite_pattern;

public class Developer implements Employee {
    String name;
    String employeeID;

    public Developer(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
    @Override
    public void showDetails() {
        System.out.println("Name: "+name+"\nID: "+employeeID);
    }
}
