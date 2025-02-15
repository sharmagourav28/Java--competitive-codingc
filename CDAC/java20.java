import java.util.Scanner;

public class java20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num % 3 == 0) {
            System.out.println("Three");
        } else if (num % 7 == 0) {
            System.out.println("Seven");
        } else if (num % 7 == 0 && num % 3 == 0) {
            System.out.println("Three & seven");
        }
        scan.close();
    }
}
