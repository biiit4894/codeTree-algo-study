import java.util.Scanner;

public class Main {
    static int gcd = 0;

    public static void findGCD(int n, int m) {
        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        findGCD(n, m);
        System.out.println(gcd);
    }
}