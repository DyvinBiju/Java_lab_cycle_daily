import java.util.Scanner;

class MultiplicationTable {
    int number;

    void readNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void displayTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class MultiplicationTableMain {
    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();

        obj.readNumber();
        obj.displayTable();
    }
}