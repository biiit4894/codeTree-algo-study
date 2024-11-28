import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean isTimes(int n) {
        return n % 3 == 0;
    }

    public static boolean isMagicNumber(int n) {
        
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();

        boolean flag = false;;
        for(char c : arr) {
            if (c == '3' || c == '6' || c == '9') {
                flag = true;
                break;              
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for(int i = a; i <= b; i++) {
            if(isMagicNumber(i) || isTimes(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}