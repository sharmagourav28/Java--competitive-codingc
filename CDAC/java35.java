import java.util.Scanner;

public class java35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = num + 1; i <= num + num; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}
