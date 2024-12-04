import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);

        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);

        String newStr1 = new String(chars1);
        String newStr2 = new String(chars2);
        
        if(newStr1.equals(newStr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}