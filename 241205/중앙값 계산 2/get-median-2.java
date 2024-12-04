import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int MAX_INT = 100;
    public static int n;
    public static int[] arr = new int[MAX_INT];

    public static void findMedian(int i) {
        Arrays.sort(arr, 1, i+1);
        if(i == 1) {
            System.out.print(arr[i] + " ");
        } else {
            System.out.print(arr[(i + 1) / 2] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            
        }
        

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                findMedian(i);
            }
        }
    }
}