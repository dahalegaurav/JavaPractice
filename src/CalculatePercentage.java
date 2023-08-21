import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        System.out.println("Hello Its Working");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter C Programming Marks: ");
        int cprogramming = scanner.nextInt();
        System.out.println("Enter JAVA Marks: ");
        int java = scanner.nextInt();
        System.out.println("Enter D.S.A. Marks: ");
        int dsa = scanner.nextInt();
        System.out.println("Enter Python Marks: ");
        int python = scanner.nextInt();
        System.out.println("Enter Ruby Marks: ");
        int ruby = scanner.nextInt();
        System.out.println("Enter Javascript Marks: ");
        int javascript = scanner.nextInt();
        int finalData = cprogramming+java+dsa+python+ruby+javascript;
        int outOffScore = 600;
        float percentage;
        float total_marks;
        float scored;
        scored = finalData;
        total_marks = outOffScore;
        percentage = (float)((scored / total_marks) * 100);
        System.out.println("Percentage ::"+ percentage);
    }
}
