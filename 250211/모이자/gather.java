import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N + 1];

    public static int n;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int minSum = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++) {
            int sumDiff = 0;
            for(int j = 1; j <= n; j++) {
                sumDiff += (arr[j] * Math.abs(j - i));
            }
            minSum = Math.min(sumDiff, minSum);

        }

        System.out.println(minSum);

    }
}

