import java.util.Scanner;

// accept a number from the user and do % 2 on input
public class java3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // int b = scan.nextInt();
        // System.out.println(a%b);
        System.out.println(a % 2);
        scan.close();

    }
}
