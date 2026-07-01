import java.util.Scanner;

class Average {
    int num1, num2, num3;
    double avg;

    void calculate() {
        avg = (num1 + num2 + num3) / 3.0; // Use 3.0 to get a decimal result
    }

    void display() {
        System.out.println("Average = " + avg);
    }
}

public class AverageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Average a = new Average();

        System.out.print("Enter first number: ");
        a.num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        a.num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        a.num3 = sc.nextInt();

        a.calculate();
        a.display();

        sc.close();
    }
}