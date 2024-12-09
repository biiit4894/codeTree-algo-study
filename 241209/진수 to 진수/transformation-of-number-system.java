import java.util.Scanner;

public class Main {

    public static int MAX_INT = 20;
    public static int[] arr = new int[MAX_INT];
    public static int a, b, cnt;
    public static String n;

    public static void ADecimalToBDecimal() {
        int decimal = 0;
        // A진수 -> 10진수
        for(int i = 0; i < n.length(); i++) {
            decimal = decimal * a + (n.charAt(i) - '0');
        }

        cnt = 0;
        // 10진수 => B진수
        while(true) {
            if(decimal < b) {
                arr[cnt++] = decimal;
                break;
            }
            arr[cnt++] = decimal % b;
            decimal /= b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.next();

        ADecimalToBDecimal();

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}