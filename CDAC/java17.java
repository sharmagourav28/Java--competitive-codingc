import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        // using third var;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("not using third variable");
        System.out.println(a);
        System.out.println(b);
        scan.close();

    }
}
