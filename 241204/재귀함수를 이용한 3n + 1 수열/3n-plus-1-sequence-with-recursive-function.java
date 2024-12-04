import java.util.Scanner;

public class Main {
    public static int divideOrMultiply(int n) {
        if(n == 1) {
            return 0;
        }

        if(n % 2 == 0) {
            return divideOrMultiply(n / 2) + 1;
        } else {
            return divideOrMultiply(n * 3 + 1) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(divideOrMultiply(n));
    }
}