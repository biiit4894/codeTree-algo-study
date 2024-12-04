import java.util.Scanner;

public class Main {
    public static void printDescAsc(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDescAsc(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDescAsc(n);
    }
}