import java.util.Scanner;

class DigitSum {
    int number, sum = 0;

    void readNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void calculateSum() {
        int temp = number;

        while (temp > 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
    }

    void display() {
        System.out.println("Sum of digits = " + sum);
    }
}

public class SumOfDigits {
    public static void main(String[] args) {
        DigitSum obj = new DigitSum();

        obj.readNumber();
        obj.calculateSum();
        obj.display();
    }
}