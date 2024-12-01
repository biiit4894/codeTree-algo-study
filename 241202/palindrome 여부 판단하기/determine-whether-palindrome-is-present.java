import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(isPalindrome(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}