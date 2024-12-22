import java.util.Scanner;

public class Main {
    public static int n, t;
    public static final int MAX_N = 1000;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0, max = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > t) {
                cnt++;
            } else {
                cnt = 0;
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);

    }
}