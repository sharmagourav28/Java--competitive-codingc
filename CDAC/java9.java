import java.util.Scanner;

public class java9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a & 1);
        scanner.close();
    }
}
