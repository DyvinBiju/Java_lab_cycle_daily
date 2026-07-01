import java.util.Scanner;

class EvenOdd {
    int number;

    void readNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void checkEvenOdd() {
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }
}

public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();

        obj.readNumber();
        obj.checkEvenOdd();
    }
}