import java.util.Scanner;

public class java24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            sum = sum + num;
        }
        System.out.print(sum);
        scan.close();
    }
}
