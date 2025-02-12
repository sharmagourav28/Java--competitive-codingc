public class logicalope {
    public static void main() {
        int a = 60;
        int b = 40;
        // &&
        if (a < 50 && b < 10) {
            System.out.println("Cannnot");
        }
        // ||
        if (a < 30 || b < 30) {
            System.out.println("Or opertor");
        }

        // !
        boolean isAdult = true;
        if (!isAdult) {
            System.out.print("Is Adlut");

        } else {
            System.out.println("Not true");
        }
    }
}
