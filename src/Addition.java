import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int a = 22;
        int b = 22;
        int sum = a+b;
        System.out.println("Sum Of Static Value"+sum);
        dynamicvaue();
    }

    private static void dynamicvaue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value Of A");
        int dynamicA = scanner.nextInt();
        System.out.println("Enter Value Of B");
        int dynamicB = scanner.nextInt();
        int dynamicSum = dynamicA+dynamicB;
        System.out.println("Sum Of Dynamic Value"+dynamicSum);
    }
}
