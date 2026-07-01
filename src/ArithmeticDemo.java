import java.util.Scanner;

class Arithmetic {
    int a, b;

    void readValues() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    void calculate() {
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}

public class ArithmeticDemo {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        obj.readValues();
        obj.calculate();
    }
}