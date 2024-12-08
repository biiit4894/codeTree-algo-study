import java.util.Scanner;
// 간단한 풀이 - 해설
public class Main {
    public static int numOfDays(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        int totalDays = 0;

        for(int i = 1; i < m; i++) {
            totalDays += days[i];
        }
        totalDays += d;

        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, d1, m2, d2;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();   

        System.out.println(numOfDays(m2, d2) - numOfDays(m1, d1) + 1);
    }
}