import java.util.InputMismatchException;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        System.out.println("Select one operation: ");
        System.out.println("1. Decimal to Hexadecimal");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.print("Enter your choice (1-2): ");
        Scanner sc = new Scanner(System.in);
        int choice;
        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice! Please enter 1 or 2.");
            return;
        }
        switch (choice) {
            case 1 -> {
                System.out.print("\nEnter the number (decimal): ");
                long num;
                try {
                    num = sc.nextLong();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid decimal number! Please enter an integer.");
                    return;
                }
                boolean isNegative = num < 0;
                num = Math.abs(num);
                String hexStr = "";
                if (num == 0)
                    hexStr = "0";
                else {
                    while (num > 0) {
                        hexStr = switch ((int)(num % 16)) {
                            case 10 -> "A" + hexStr;
                            case 11 -> "B" + hexStr;
                            case 12 -> "C" + hexStr;
                            case 13 -> "D" + hexStr;
                            case 14 -> "E" + hexStr;
                            case 15 -> "F" + hexStr;
                            default -> (num % 16) + hexStr;
                        };
                        num /= 16;
                    }
                }
                if (isNegative) hexStr = "-" + hexStr;
                System.out.println("Hexadecimal: " + hexStr);
            }
            case 2 -> {
                System.out.print("\nEnter the number (hexadecimal): ");
                String hex = sc.next();
                if (hex.isEmpty()) {
                    System.out.println("Empty input! Please enter a valid hexadecimal number.");
                    return;
                }
                boolean isNegative = hex.startsWith("-");
                if (isNegative) {
                    hex = hex.substring(1);
                    if (hex.isEmpty()) {
                        System.out.println("Invalid input! '-' is not a number.");
                        return;
                    }
                }
                long decimal = 0;
                int power = 0;
                hex = hex.toUpperCase();
                for (int i = hex.length() - 1; i >= 0; i--) {
                    char c = hex.charAt(i);
                    int value;
                    if (c >= '0' && c <= '9')
                        value = c - '0';
                    else if (c >= 'A' && c <= 'F')
                        value = c - 'A' + 10;
                    else {
                        System.out.println("Invalid character '" + c + "' in hexadecimal input!");
                        return;
                    }
                    decimal += value * Math.pow(16, power);
                    power++;
                }
                if (isNegative) decimal = -decimal;
                System.out.println("Decimal: " + decimal);
            }

            default -> System.out.println("Invalid choice! Please run again.");
        }
        sc.close();
    }
}
