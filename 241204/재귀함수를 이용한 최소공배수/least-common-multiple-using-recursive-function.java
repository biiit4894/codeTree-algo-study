import java.util.Scanner;

public class Main {
    public static final int MAX_N = 10;

    public static int[] arr = new int[MAX_N + 1];
    public static int n;

    // 두 수간의 최소공배수를 구하기
    public static int lcm(int a, int b) {
        int gcd = 1; // 최소공배수, 최대공약수
        for(int j = 1; j <= Math.min(a, b); j++) {
            if(a % j == 0 && b % j == 0) {
                gcd = j;
            }
        }
   
        return a * b / gcd;
    }

    // index번째까지 인덱스의 숫자 중에서 가장 큰 값을 반환
    public static int getLCMAll(int index) {

        // 남은 원소가 1개라면 그 자신이 답이 된다
        if(index == 1) {
            return arr[1];
        }

        // 1번째 ~ index - 1번째 원소의 최소공배수를 구한 결과와
        // 현재 index 원소의 최소공배수를 구해 반환한다.
        return lcm(getLCMAll(index - 1), arr[index]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // 모든 수의 최소공배수를 구한다.
        System.out.println(getLCMAll(n));

    }
}