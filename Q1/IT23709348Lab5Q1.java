import java.util.Scanner;

public class IT23709348Lab5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter third integer: ");
        int c = sc.nextInt();

        int smallest = a;
        int largest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
