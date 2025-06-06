import java.util.ArrayList;
import java.util.List;

public class Department implements NEUComponent {
    private String name;
    private List<NEUComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(NEUComponent component) {
        components.add(component);
    }

    public void removeUnit(NEUComponent component) {
        components.remove(component);
    }


    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (NEUComponent component : components) {
            component.displayDetails();
        }
    }

    @Override
    public int getNumberofStudents() {
        int totalStudents = 0;
        for (NEUComponent component : components) {
            totalStudents += component.getNumberofStudents();
        }
        return totalStudents;
    }

    @Override
    public double getBudget() {
        double totalBudget = 0.0;
        for (NEUComponent component : components) {
            totalBudget += component.getBudget();
        }
        return totalBudget;
    }
}
