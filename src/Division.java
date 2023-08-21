import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int substraction = a / b;
        System.out.println("Static Value Output :"+substraction);
        dynamicValue();
    }

    private static void dynamicValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int dynamicA = scanner.nextInt();
        System.out.println("Enter Secound Value : ");
        int dynamicB = scanner.nextInt();
        int dynamicOutput = dynamicA/dynamicB;
        System.out.println("Dynamic Value Output : " +dynamicOutput);
    }
}
