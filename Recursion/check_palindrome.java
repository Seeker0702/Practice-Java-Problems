import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean result = check(0, str);
        if (result == true) {
            System.out.println("Palindorme");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean check(int i, String str) {

        if (i > str.length() / 2) {
            return true;
        }
        if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
            return check(i + 1, str);
        }
        return false;
    }
}
