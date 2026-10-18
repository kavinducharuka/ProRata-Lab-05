import java.util.Scanner;

public class IT23709348Lab5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");
        int members = sc.nextInt();

        if (members < 0) {
            System.out.println("Invalid input! Number should be greater than or equal to 0.");
            return;
        }

        int key = members >= 5 ? 5 : members;
        switch (key) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Prize: Pen");
                break;
            case 2:
                System.out.println("Prize: Umbrella");
                break;
            case 3:
                System.out.println("Prize: Bag");
                break;
            case 4:
                System.out.println("Prize: Travelling Chair");
                break;
            default:
                System.out.println("Prize: Headphone");
        }
    }
}
