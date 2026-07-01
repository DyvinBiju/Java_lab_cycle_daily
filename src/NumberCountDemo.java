import java.util.Scanner;

class NumberCounter {
    int[] arr;
    int n;
    int positive = 0, negative = 0, zero = 0;

    void readArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void countNumbers() {
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                positive++;
            else if (arr[i] < 0)
                negative++;
            else
                zero++;
        }
    }

    void display() {
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}

public class NumberCountDemo {
    public static void main(String[] args) {
        NumberCounter obj = new NumberCounter();

        obj.readArray();
        obj.countNumbers();
        obj.display();
    }
}