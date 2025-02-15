import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        // using third var;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("using third varible");
        System.out.println(a);
        System.out.println(b);
        scan.close();

    }
}
