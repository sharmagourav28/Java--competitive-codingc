import java.util.Scanner;

public class java28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int final_num = 0;
        while (num > 0) {
            int rem = num % 10;
            final_num = rem + final_num * 10;
            num = num / 10;

        }
        System.out.print(final_num);
        scan.close();
    }
}
