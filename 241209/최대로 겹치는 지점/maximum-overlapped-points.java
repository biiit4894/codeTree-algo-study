import java.util.Scanner;

public class Main {
    public static final int MAX_INT = 100;
    public static int[] arr = new int[MAX_INT + 1];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int j = x1; j <= x2; j++) {
                arr[j]++;
            }
        }

        int max = 0;
        for(int i = 0; i <= MAX_INT; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}