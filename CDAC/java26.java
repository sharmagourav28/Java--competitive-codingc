import java.util.Scanner;

public class java26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int postive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            if (num > 0) {
                postive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.print("postive " + postive + " negative " + negative + " zero " + zero);
        scan.close();
    }
}
