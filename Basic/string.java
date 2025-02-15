public class string {
    public static void main() {
        // String
        // concatenate

        String name1 = "api";
        String name2 = "tum";
        String chnam = name1 + name2;
        System.out.println(chnam);

        System.out.println(chnam.charAt(1));

        System.out.println(chnam.length());

        String newstr = chnam.replace('t', 'z');
        System.out.println(newstr);

        String name3 = "aman and aku";
        System.out.println(name3.substring(2, 7));
    }
}
