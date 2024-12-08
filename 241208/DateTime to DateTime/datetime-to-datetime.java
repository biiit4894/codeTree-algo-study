import java.util.Scanner;
// 더 간단한 풀이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 11, hour = 11, mins = 11;

        int a = sc.nextInt(); // 일
        int b = sc.nextInt(); // 시
        int c = sc.nextInt(); // 분

        int endTime = (a - 1) * 24 * 60 + b * 60 + c;
        int startTime = (day - 1) * 24 * 60 + hour * 60 + mins;

        if(startTime > endTime) {
            System.out.println(-1);
        } else {
            System.out.println(endTime - startTime);
        }

    }
}