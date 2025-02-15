import java.util.Scanner;

public class java29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int past_number = num;
        int final_num = 0;
        while (num > 0) {
            int rem = num % 10;
            final_num = rem + final_num * 10;
            num = num / 10;
        }
        if (past_number == final_num) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
        scan.close();
    }
}
