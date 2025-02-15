import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
        scan.close();
    }
}
