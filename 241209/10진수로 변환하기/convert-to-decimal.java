import java.util.Scanner;

public class Main {
    public static int MAX_INT = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int[] arr = new int[MAX_INT];
        int answer = 0;

        for(int i = 0; i < binary.length(); i++) {
            arr[i] = binary.charAt(i) - '0'; // (char -> int 자동형변환 시 '0'은 48, '1'은 49로 ... 치환됨) - 48
            answer = answer * 2 + arr[i];
        }

        System.out.println(answer); 
    }
}