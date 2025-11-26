class Student {
    String name;
    int age;
    char grade;
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.grade = 'A';
        
        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 19;
        student2.grade = 'B';
        System.out.println("=== Student 1 ===");
        student1.displayInfo();
        System.out.println("\n=== Student 2 ===");
        student2.displayInfo();
    }
}