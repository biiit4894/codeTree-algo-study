import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];
        int count = 0;

        while(true) {
            if(n < 2) {
                arr[count++] = n;
                break;
            }
            arr[count++] = n % 2;
            n /= 2;
        }

        for(int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}