import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        float a = 1.2f;
        float b = 0.9f;
        float multiplication = a * b;
        System.out.println("Static Value Output :"+multiplication);
        dynamicValue();
    }

    private static void dynamicValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        float dynamicA = scanner.nextFloat();
        System.out.println("Enter Secound Value : ");
        float dynamicB = scanner.nextFloat();
        float dynamicOutput = dynamicA*dynamicB;
        System.out.println("Dynamic Value Output : " +dynamicOutput);
    }
}
