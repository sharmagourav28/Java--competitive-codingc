import java.util.Scanner;

public class java25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num = num - 1;
        }
        System.out.print(fact);
        scan.close();
    }
}
