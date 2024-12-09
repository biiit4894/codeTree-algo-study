import java.util.Scanner;

public class Main {

    public static int MAX_NUM = 20, cnt = 0;
    public static int[] arr = new int[MAX_NUM];

    public static void convert(String n) {
        // 이진수 -> 십진수
        int decimal = 0;
        for(int i = 0; i < n.length(); i++) {
            decimal = decimal * 2 + (n.charAt(i) - '0');
        }

        decimal *= 17;

        // 십진수 -> 이진수
        while(true) {
            if(decimal < 2) {
                arr[cnt++] = decimal;
                break;
            }    
            arr[cnt++] = decimal % 2;
            decimal /= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        convert(n);

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}