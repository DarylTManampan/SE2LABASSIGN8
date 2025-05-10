public class Client {
    public static void main(String[] args) {
    
    System.out.println("\t ----- New Era University -----\n");
     
        Teacher t1 = new Teacher("Professor X", "AutoCAD", 45000); 
        Teacher t2 = new Teacher("Professor Mojojojo", "Circuit Theory", 40000);
    
        Student s1 = new Student("Bubbles", "22-000", 35000); 
        Student s2 = new Student("Blossom", "22-004", 15000); 
        Student s3 = new Student("Buttercup", "22-001", 25000); 
        
        Department compEngDept = new Department("Computer Engineering");
        compEngDept.add(t1);
        compEngDept.add(s1);
        compEngDept.add(s2);
    
        Department electricEngDept = new Department("Electrical Engineering");
        electricEngDept.add(t2);
        electricEngDept.add(s3);
    
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.add(compEngDept);
        engineeringCollege.add(electricEngDept);
         
        engineeringCollege.displayDetails();
    
        System.out.println("\n\tTotal Students: " + engineeringCollege.getNumberofStudents()); 
        System.out.println("\tTotal Budget: " + engineeringCollege.getBudget());
    }
}