import java.util.Scanner;

public class Main {
    public static int[] arr;

    public static int temp = Integer.MIN_VALUE;

    public static int getMax(int x) {

        if(x < 1) {
            return temp;
        }
        if(temp < arr[x]) {
            temp = arr[x];
        }
        return getMax(x - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getMax(n));
    }
}