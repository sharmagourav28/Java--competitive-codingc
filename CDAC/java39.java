import java.util.Scanner;

public class java39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low = 0;
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();

            if (low < num) {
                low = num;
            }
        }
        System.out.println(low);
        scan.close();
    }
}
