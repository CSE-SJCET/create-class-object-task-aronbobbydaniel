class Student {
    String name;
    int rollNumber;
    char grade;

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Aron";
        student.rollNumber = 26;
        student.grade = 'A';
        student.displayDetails();
    }
}
