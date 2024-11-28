import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0) { 
                return false;
            }
        }
        return true;
    }
    public static void sum(int a, int b) {
        int sum = 0;
        if()
        for(int i = a; i <= b; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
    }
}