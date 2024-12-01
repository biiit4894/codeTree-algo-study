import java.util.Scanner;

public class Main {

    public static int y, m, d;

    public static boolean judgeLeapYear() {
        
        // 문제에서 주어진 윤년의 조건을 그대로 옮기면 될까? 잘 생각해보자
        if(y % 400 == 0) {
            return true;
        }
        if(y % 100 == 0) {
            return false;
        }
        if(y % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int findDays() {
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } 
        if(judgeLeapYear()) {
            if(m == 2) {
                return 29;
            }
        } else if(m == 2) {
            return 28;
        } 
        return 31;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        if(d <= findDays()) {
            if(m >= 3 && m <= 5) {
                System.out.println("Spring");
            }
            if(m >= 6 && m <= 8) {
                System.out.println("Summer");

            }
            if(m >= 9 && m <= 11) {
                System.out.println("Fall");
            }
            if(m == 12 || m <= 2) {
                System.out.println("Winter");
            }
        } else {
            System.out.println(-1);
        }
    }
}