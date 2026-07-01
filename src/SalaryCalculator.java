import java.util.Scanner;

class Employee {
    double basicSalary;
    double da, hra, grossSalary;

    void calculate() {
        da = basicSalary * 0.10;
        hra = basicSalary * 0.15;
        grossSalary = basicSalary + da + hra;
    }

    void display() {
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        emp.calculate();
        emp.display();

        sc.close();
    }
}