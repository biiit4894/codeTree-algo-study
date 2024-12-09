import java.util.Scanner;

public class Main {
    public static int MAX_INT = 201;
    public static int OFFSET = 100;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[MAX_INT];
        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int j = x1; j <= x2 - 1; j++) {
                arr[j + OFFSET]++;
            }
        }
        int max = 0;
        for(int i = -OFFSET; i <= OFFSET; i++) {
            if(max < arr[i + OFFSET]) {
                max = arr[i + OFFSET];
            }
        }
        System.out.println(max);
    }
}