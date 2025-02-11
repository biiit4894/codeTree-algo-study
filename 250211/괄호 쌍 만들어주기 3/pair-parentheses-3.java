import java.util.Scanner;

public class Main {
    public static final char START_C = '(';
    public static final char END_C = ')';

    public static final int MAX_A_LENGTH = 100;
    public static char[] arr = new char[MAX_A_LENGTH];
    
    public static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        int ans = 0;
        for(int i = 0; i < str.length() - 1; i++) {
            char start = str.charAt(i);
            for(int j = i + 1; j < str.length(); j++) {
                char end = str.charAt(j);
                if(start == START_C && end == END_C) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}