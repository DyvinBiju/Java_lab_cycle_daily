import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;
    double percentage;

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        s.rollNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Course: ");
        s.course = sc.nextLine();

        System.out.print("Enter Percentage: ");
        s.percentage = sc.nextDouble();

        s.display();

        sc.close();
    }
}