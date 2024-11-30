import java.util.Scanner;
public class Main {

    public static boolean isSumEvenNumber(int num) {
        // 1 <= a, b <= 100 이 문제 조건이니 이런 풀이도 가능
        int digitSum = (num / 100) + ((num / 10) % 10) + (num % 10);
        if(digitSum % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isMagicNumber(int num) {
        return isPrime(num) && isSumEvenNumber(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if(isMagicNumber(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}