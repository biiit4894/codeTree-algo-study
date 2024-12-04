import java.util.Scanner;

public class Main {
    public static int getSum(int n) {
        if(n == 1 || n == 0) {
            return n;
        }
        return getSum(n - 2) + n;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));
    }
}