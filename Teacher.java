public class Teacher implements NEUComponent{
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("\tTeacher: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }

    @Override
    public int getNumberofStudents() {
        return 0;
    }
    
    @Override
    public double getBudget() {
        return salary;
    }
}
