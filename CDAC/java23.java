import java.util.Scanner;

public class java23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int r = scan.nextInt();
        int t = scan.nextInt();
        float si = (float) ((p * r * t) / 100);
        System.out.print(si);
        scan.close();
    }
}
