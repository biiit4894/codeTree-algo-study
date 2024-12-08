import java.util.Scanner;

public class Main {
    public static int getTotalDays(int m, int d) {
        int[] days_of_month = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for(int i = 1; i < m - 1; i++) {
            totalDays += days_of_month[i];
        }
        totalDays += d;
        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int endDate = getTotalDays(m2, d2);
        int startDate = getTotalDays(m1, d1);

        if((endDate - startDate) % 7 != 0) {
            System.out.println((endDate - startDate) / 7 + 1);
        } else {
            System.out.println((endDate - startDate) / 7);
        }

    }
}