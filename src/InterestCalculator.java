import java.util.Scanner;

class Interest {
    double principal, rate, time, simpleInterest, amount;

    void calculate() {
        simpleInterest = (principal * rate * time) / 100;
        amount = principal + simpleInterest;
    }

    void display() {
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Amount = " + amount);
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Interest i = new Interest();

        System.out.print("Enter Principal: ");
        i.principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        i.rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        i.time = sc.nextDouble();

        i.calculate();
        i.display();

        sc.close();
    }
}