import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 1000;
    public static int[] arr = new int[MAX_N];
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(i >= 1 && arr[i - 1] < arr[i]) {
                cnt++;
            } else {
                cnt = 1;
            }
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
}