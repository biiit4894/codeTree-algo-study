import java.util.Scanner;
import java.util.List;

public class Main {
    public static final int MAX_N = 100;

    public static int n1, n2;
    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];

    public static boolean isSame(int n) {
        for(int i = 0; i < n2; i++) {
            if(a[i + n] != b[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isContinuousPartialSequence() {
        for(int i = 0; i <= n1 - n2; i++) {
            if(isSame(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        if(isContinuousPartialSequence()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}