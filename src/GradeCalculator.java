import java.util.Scanner;

class Grade {
    int marks;
    char grade;

    void readMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void calculateGrade() {
        if (marks >= 90 && marks <= 100)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else
            grade = 'D';
    }

    void display() {
        System.out.println("Grade = " + grade);
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        Grade obj = new Grade();

        obj.readMarks();
        obj.calculateGrade();
        obj.display();
    }
}