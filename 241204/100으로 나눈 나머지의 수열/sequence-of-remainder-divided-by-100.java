import java.util.Scanner;

public class Main {
    public static int getRemainder(int n) {
        if(n == 1) {
            return 2;
        } 
        if(n == 2) {
            return 4;
        }
        return getRemainder(n - 1) * getRemainder(n - 2) % 100;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getRemainder(n));
    }
}