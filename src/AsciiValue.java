import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        char a = 'c';
        int ascii = a;
        System.out.println("Ascii (Decimal) Value Of a is :"+ascii);
        int castAscii = (int) a;
        System.out.println("Cast Ascii valur of a is :"+castAscii);
        dynamicvalue();
    }
    private static void dynamicvalue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character");
//        there's a small issue in your code snippet. The next() method
//        of the Scanner class returns a string, not a character. Therefore,
//        you should use scanner.next() to read a string and then extract
//        the first character from it.
        String input = scanner.next();
        char dynamicA = input.charAt(0);
        int dynamicAscii = dynamicA;
        System.out.println("Dynamic Ascii Valur Of "+input+" is : "+dynamicAscii);
    }
}
