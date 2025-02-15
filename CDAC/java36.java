import java.util.Scanner;

public class java36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min_num = scan.nextInt();
        int max_num = scan.nextInt();
        for (int i = min_num; i < max_num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        scan.close();
    }
}
