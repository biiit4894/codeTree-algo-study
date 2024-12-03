import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int[] arr;

    public static int minusOrDivide() {
        int sum = 0;
        while(m >= 1) {
            sum += arr[m - 1];
            if(m % 2 != 0) {
                m -= 1;
            } else {
                m /= 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minusOrDivide());
    }
}
