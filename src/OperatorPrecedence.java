import java.util.Scanner;

class Expression {
    int a, b, c, d, e, result;

    void readValues() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.print("Enter c: ");
        c = sc.nextInt();

        System.out.print("Enter d: ");
        d = sc.nextInt();

        System.out.print("Enter e: ");
        e = sc.nextInt();
    }

    void calculate() {
        result = a + b * c - d / e;
    }

    void display() {
        System.out.println("Result = " + result);
    }
}

public class OperatorPrecedence {
    public static void main(String[] args) {
        Expression obj = new Expression();

        obj.readValues();
        obj.calculate();
        obj.display();
    }
}