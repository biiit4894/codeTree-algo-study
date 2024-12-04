import java.util.Scanner;

public class Main {
    public static int facto(int n) {
        if(n == 0) { // 사실상 이렇게만 해도 팩토리얼
            return 1;
        }
        return facto(n - 1) * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(facto(n));
    }
}