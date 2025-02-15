import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = str1 + str2;
        System.out.println(str3);
        scanner.close();
    }
}
