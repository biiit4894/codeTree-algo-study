import java.util.Scanner;

public class Main {

    public static int y, m, d;

    public static boolean judgeLunarYear() {
        if(y % 4 == 0) {
            return true;
        }
        if(y % 4 == 0 && y % 100 == 0) {
            return false;
        }
        if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int findDays() {
        if(judgeLunarYear()) {
            if(m == 2) {
                return 29;
            }
        } else if(m  == 2) {
            return 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } 
        return 31;

    }
    
    public static String findSeason() {
        if(d <= findDays()) {
            if(m >= 3 && m <= 5) {
                return "Spring";
            }
            if(m >= 6 && m <= 8) {
                return "Summer";
            }
            if(m >= 9 && m <= 11) {
                return "Fall";
            }
            if(m == 12 || m <= 2) {
                return "Winter";
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        System.out.println(findSeason());
    }
}