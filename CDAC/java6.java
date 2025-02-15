import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Enter the second character: ");
        char char2 = scanner.next().charAt(0);

        int sum = char1 + char2;
        System.out.println("The sum of the ASCII values is: " + sum);

        scanner.close();
    }
}
