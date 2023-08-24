import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend = 25, divisor = 4;
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        dynamicvalue();
    }

    private static void dynamicvalue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of a :");
        int a = scanner.nextInt();
        System.out.println("Enter Value of b :");
        int b = scanner.nextInt();
        int cquotient = a/b;
        int dremainder = a%b;
        System.out.println("Quotient Dynamic"+cquotient);
        System.out.println("Remainder Dynamic"+dremainder);

    }
}
