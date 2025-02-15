import java.util.Scanner;

public class java18 {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    int b = scanner.nextInt();

    // Method 1: Using Addition and Subtraction
    a=a+b;b=a-b;a=a-b;System.out.println("After swapping (Method 1): a = "+a+", b = "+b);

    // Reset values for demonstration
    System.out.print("Re-enter the first number: ");a=scanner.nextInt();System.out.print("Re-enter the second number: ");b=scanner.nextInt();

    // Method 2: Using Multiplication and Division
    a=a*b;b=a/b;a=a/b;System.out.println("After swapping (Method 2): a = "+a+", b = "+b);

    // Reset values for demonstration
    System.out.print("Re-enter the first number: ");a=scanner.nextInt();System.out.print("Re-enter the second number: ");b=scanner.nextInt();

    // Method 3: Using Bitwise XOR
    a=a^b;b=a^b;a=a^b;System.out.println("After swapping (Method 3): a = "+a+", b = "+b);

    scanner.close();
}
