import java.util.Scanner;

public class Main {

    public static void findGCM(int n, int m) {
        int gcm = 0, gcd = 1; // 최소공배수, 최대공약수
        int a = 1, b = 1;
        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i; 
                // a = n / i; // n을 최대공약수로 나눈 값
                // b = m / i; // m을 최대공약수로 나눈 값
            }
        }
        // gcm = gcd * a * b; // 최대공약수 * (n을 최대공약수로 나눈 값) * (m을 최대공약수로 나눈 값)
        gcm = n * m * gcd; // 위 풀이를 연산하면 이 풀이와 사실상 똑같음
        System.out.println(gcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        findGCM(n, m);
    }
}