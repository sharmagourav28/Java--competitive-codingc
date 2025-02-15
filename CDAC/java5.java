import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float sum = a * b;
        System.out.println(sum);
        scan.close();

    }
}
