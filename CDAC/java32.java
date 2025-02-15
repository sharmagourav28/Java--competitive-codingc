import java.util.Scanner;

public class java32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int past_number = num;
        int armnumber = 0;
        while (num > 0) {
            int rem = num % 10;
            int get_num = rem * rem * rem;
            num = num / 10;
            armnumber = armnumber + get_num;
        }
        System.out.print(armnumber);
        if (armnumber == past_number) {
            System.out.print("ArmStrong Number");
        } else {
            System.out.print("Not armstrong number");
        }
        scan.close();

    }
}
