import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        float first = 1.20f, second = 2.45f;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        dynamicdata();
    }

    private static void dynamicdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Assign Value To A :");
        int a = scanner.nextInt();
        System.out.println("Assigned Value of A is :"+a);
        System.out.println("Assign Value To B :");
        int b = scanner.nextInt();
        System.out.println("Assigned Value of B is :"+b);
        System.out.println("After Swap Value");
        int c = a;
        a = b;
        b =c;
        System.out.println("Final Value Of A is "+a);
        System.out.println("Final Value Of B is "+b);

    }
}
