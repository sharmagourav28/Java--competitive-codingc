import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println(age);

        // string
        String name = sc.next(); // string input class only take token single word
        String name1 = sc.nextLine();// it take entire line
        System.out.println(name);
        System.out.println(name1);

        // comparsion opertor
        // a == b
        // a!=b
        // a<b
        // a>b
        // a>=b
        // a<=b
    }
}
