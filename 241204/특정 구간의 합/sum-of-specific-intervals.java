import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] arr1;
    public static int[][] arr2;

    public static void getArraySum() {
        for(int i = 0; i < m; i++) {
            int sum = 0;
            int startIdx = arr2[i][0];
            int endIdx = arr2[i][1];

            for(int j = startIdx; j <= endIdx; j++) {
                sum += arr1[j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr1 = new int[n + 1];
        arr2 = new int[m][2];

        for(int i = 1; i <= n; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        getArraySum();
    }
}