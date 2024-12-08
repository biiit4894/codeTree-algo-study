import java.util.Scanner;

public class Main {

    public static int getTotalDays(int m, int d) {
        int[] days_of_month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for(int i = 1; i <= m - 1; i++) {
            totalDays += days_of_month[i];
        }
        totalDays += d;
        return totalDays;
    }

    public static void main(String[] args) {
        String[] days_of_week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int startDate = getTotalDays(m1, d1);
        int endDate = getTotalDays(m2, d2);
        int diff = (endDate - startDate) % 7;
        
        if(diff < 0) {
            System.out.println(days_of_week[7 + diff]);
        } else {
            System.out.println(days_of_week[diff]);
        }
    }
}