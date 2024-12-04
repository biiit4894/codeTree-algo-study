import java.util.Scanner;

public class Main {
    public static int getDigitsSum(int n) {
        if(n < 10) {
            return n;
        }
        return getDigitsSum(n / 10) + (n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        for(int i = 0; i < 3; i++) {
            n *= sc.nextInt();
        }
        System.out.println(getDigitsSum(n));
    }
}