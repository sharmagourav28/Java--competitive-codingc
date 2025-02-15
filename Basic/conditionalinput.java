import java.util.Scanner;

public class conditionalinput {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();
        if (cash < 109) {
            System.out.println("Cannot buy anythings");
        } else if (cash > 10 && cash < 40) {
            System.out.println("Cannot get 1 thing");
        } else {
            System.out.println("Can getboth");
        }
    }
}
