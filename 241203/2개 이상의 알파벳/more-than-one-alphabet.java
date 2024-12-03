import java.util.Scanner;

public class Main {
    public static boolean isDifferentAlphabetMoreThan2(String a) {
        for(int i = 0; i < a.length() - 1; i++) {
            if(a.charAt(i) != a.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(isDifferentAlphabetMoreThan2(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}