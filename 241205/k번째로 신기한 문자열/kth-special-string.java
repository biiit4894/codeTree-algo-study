import java.util.Scanner;
import java.util.Arrays;

// 해설

public class Main {
    public static final int MAX_N = 100;
    public static int n, k;
    public static String t;
    public static int cnt;

    public static String[] str = new String[MAX_N];
    public static String[] words = new String[MAX_N];

    // a가 b로 시작하는지를 확인하기(startsWith를 직접 구현)
    public static boolean startsWith(String a, String b) {
        // b의 길이가 더 길 수는 없음
        if(a.length() < b.length()) {
            return false;
        }

        // b의 길이만큼 살펴보며, a와 문자열이 완전히 동일한지 확인
        for(int i = 0; i < b.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        t = sc.next();

        for(int i = 0; i < n; i++) {
            str[i] = sc.next();

            if(startsWith(str[i], t)) {
                words[cnt++] = str[i];
            }
        }

        Arrays.sort(words, 0, cnt);

        System.out.println(words[k - 1]);

        
    }
}