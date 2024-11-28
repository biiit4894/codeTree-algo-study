import java.util.Scanner;

public class Main {
    public static int findMin(int a, int b, int c) {
        
        int min = 0;
        // a < b < c
        // a < c < b

        // b < a < c
        // b < c < a

        // c < a < b
        // c < b < a
        if((a <= b && b <= c) || (a <= c && c <= b)) {
            min = a;
        } else if((b <= a && a <= c) || (b <= c && c <= a)) {
            min = b;
        } else if((c <= a && a <= b) || (c <= b && b <= a)) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(findMin(a, b, c));
    }
}