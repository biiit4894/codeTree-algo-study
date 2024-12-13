import java.util.Scanner;
// 해설
public class Main {
    public static final int MAX_N = 101;
    public static final int MAX_K = 101;

    public static int n, k;
    public static int[] a = new int[MAX_K + 1];
    public static int[] b = new int[MAX_K + 1];

    public static int[] blocks = new int [MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 1; i <= k; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for(int i = 1; i <= k; i++) {
            for(int j = a[i]; j <= b[i]; j++) {
                blocks[j]++;
            }
        }

        int max = 0;
        for(int i = 1; i <= n; i++) {
            if(blocks[i] > max) {
                max = blocks[i];
            }
        }
        
        System.out.print(max);
    }
}