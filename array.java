import java.util.Arrays;;

public class array {
    public static void main() {
        // array
        int[] marks = new int[3];
        marks[0] = 24;
        marks[1] = 25;
        marks[2] = 23;

        // System.out.println(marks); not print all element array
        System.out.println(marks[1]);
        System.out.println(marks.length);

        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
