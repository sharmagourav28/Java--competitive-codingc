import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= 75) {
            System.out.print("Grade A");
        } else if (number >= 55) {
            System.out.println("Grade B");
        } else if (number >= 35) {
            System.out.println("Grede C");
        } else {
            System.out.print("Fail");
        }
        scan.close();
    }
}