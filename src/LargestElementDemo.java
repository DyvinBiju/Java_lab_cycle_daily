import java.util.Scanner;

class ArrayOperations {
    int[] arr;
    int n;
    int largest;

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

    void findLargest() {
        largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
    }

    void display() {
        System.out.println("Largest element = " + largest);
    }
}

public class LargestElementDemo {
    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();

        obj.readArray();
        obj.findLargest();
        obj.display();
    }
}