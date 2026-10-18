import java.util.Scanner;

public class IT23709348Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final int MIN_DATE = 1;
        final int MAX_DATE = 31;
        final double DISCOUNT_3_TO_4 = 10;
        final double DISCOUNT_5_OR_MORE = 20;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start date (day): ");
        int start = sc.nextInt();
        System.out.print("Enter end date (day): ");
        int end = sc.nextInt();

        if (start < MIN_DATE || start > MAX_DATE || end < MIN_DATE || end > MAX_DATE) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }
        if (start >= end) {
            System.out.println("Error: Start date should be less than the end date.");
            return;
        }

        int days = end - start;
        double total = days * ROOM_CHARGE_PER_DAY;
        double discountRate = 0;
        if (days >= 5) {
            discountRate = DISCOUNT_5_OR_MORE;
        } else if (days >= 3) {
            discountRate = DISCOUNT_3_TO_4;
        }
        double discount = total * discountRate / 100;
        double payable = total - discount;

        System.out.println("Number of days reserved: " + days);
        System.out.println("Total amount: Rs. " + total);
        System.out.println("Discount (" + discountRate + "%): Rs. " + discount);
        System.out.println("Amount to be paid: Rs. " + payable);
    }
}
