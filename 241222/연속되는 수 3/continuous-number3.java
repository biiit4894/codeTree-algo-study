import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 1000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0 || arr[i - 1] * arr[i] > 0) {
                cnt++;
            } else {
                cnt = 1;
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}