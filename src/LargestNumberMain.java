import java.util.Scanner;

class LargestNumber {
    int a, b, c, largest;

    void readNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        a = sc.nextInt();

        System.out.print("Enter B: ");
        b = sc.nextInt();

        System.out.print("Enter C: ");
        c = sc.nextInt();
    }

    void findLargest() {
        if (a >= b && a >= c)
            largest = a;
        else if (b >= a && b >= c)
            largest = b;
        else
            largest = c;
    }

    void display() {
        System.out.println("Largest = " + largest);
    }
}

public class LargestNumberMain {
    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();

        obj.readNumbers();
        obj.findLargest();
        obj.display();
    }
}