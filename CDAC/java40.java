import java.util.Scanner;

public class java40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        System.out.println("The highest number is: " + highest);
        System.out.println("The second highest number is: " + secondHighest);

        scanner.close();
    }
}
