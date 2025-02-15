import java.util.Scanner;

public class java33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int num = scan.nextInt();
            if (num == 0) {
                break;
            } else {
                sum = sum + num;
            }
        }
        System.out.print(sum);
        scan.close();
    }
}
