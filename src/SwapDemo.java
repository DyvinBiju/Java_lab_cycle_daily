import java.util.Scanner;

class SwapNumbers {
    int a, b;

    void readValues() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        a = sc.nextInt();

        System.out.print("Enter B: ");
        b = sc.nextInt();
    }

    void swapUsingTemp() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swap (Using Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    void swapWithoutTemp() {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swap (Without Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

public class SwapDemo {
    public static void main(String[] args) {
        SwapNumbers obj = new SwapNumbers();

        obj.readValues();

        System.out.println("\nBefore Swap");
        System.out.println("A = " + obj.a);
        System.out.println("B = " + obj.b);

        obj.swapUsingTemp();

        // Swap again to restore original values
        obj.swapWithoutTemp();
    }
}