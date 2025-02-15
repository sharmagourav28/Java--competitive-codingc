import java.util.Scanner;

public class java31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int special_sum = 0;
        while (num > 0) {
            int fact_sum = 1;
            int lastdigit = num % 10;
            while (lastdigit > 0) {
                fact_sum = fact_sum * lastdigit;
                lastdigit--;
            }
            special_sum = special_sum + fact_sum;
            num = num / 10;
        }
        System.out.print(special_sum);
        scan.close();
    }
}
