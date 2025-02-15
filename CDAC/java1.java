import java.util.Scanner;

// accept two number from the user and print remainder of it
public class java1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a % b);
    }
}