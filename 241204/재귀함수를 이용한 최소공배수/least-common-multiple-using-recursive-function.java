import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static int n;

    // 두 수간의 최소공배수를 구하기
    public static int getLeastCommonMultiple(int a, int b) {
        int gcd = 1; // 최소공배수, 최대공약수
        for(int j = 1; j <= Math.min(a, b); j++) {
            if(a % j == 0 && b % j == 0) {
                gcd = j;
            }
        }
   
        return a * b / gcd;
    }

    // 
    public static int getLeastCommonMultipleAll(int index) {
        if(index == 1) {
            return arr[1];
        }
        return getLeastCommonMultiple(getLeastCommonMultipleAll(index - 1), arr[index]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getLeastCommonMultipleAll(n));

    }
}