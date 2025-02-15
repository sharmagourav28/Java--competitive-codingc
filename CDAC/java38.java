import java.util.Scanner;

public class java38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int largest = 0;
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();

            if (largest < num) {
                largest = num;
            }
        }
        System.out.println(largest);
        scan.close();
    }
}
