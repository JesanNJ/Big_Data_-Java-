import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double mark;

    // Constructor
    Student(String name, int rollNo, double mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Mark      : " + mark);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Mark: ");
        double mark = sc.nextDouble();

        Student s1 = new Student(name, rollNo, mark);

        s1.displayDetails();

        sc.close();
    }
}