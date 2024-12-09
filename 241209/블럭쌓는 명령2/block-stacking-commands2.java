import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        int k = sc.nextInt();

        for(int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a ; j <= b; j++) {
                arr[j]++;
                
            }
        }

        int max = 0;
        for(int i = 1; i <= n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}