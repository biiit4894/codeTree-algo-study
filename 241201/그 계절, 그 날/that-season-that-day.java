import java.util.Scanner;

public class Main {

    public static boolean isLeapYear(int y) {
        // 4의 배수가 아니라면 윤년이 확실히 아님.
        if(y % 4 != 0) {
            return false;
        }

        // 여기까지 온 이상 4의 배수임을 가정해도 됨
        // 그 중 100의 배수가 아니라면 확실히 윤년
        if(y % 100 != 0) {
            return true;
        }

        // 여기까지 온 이상 100의 배수임을 가정해도 됨
        // 그 중 400의 배수라면 확실히 윤년
        if(y % 400 == 0) {
            return true;
        }

        // 여기까지 온 이상 100의 배수이지만 400의 배수가 아님
        // 따라서 확실히 윤년이 아님
        return false;
    }

    public static boolean isExistDay(int y, int m, int d) {
        int[] numOfDays = new int[]{0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 0~12월

        numOfDays[2] = isLeapYear(y) ? 29 : 28;

        return d <= numOfDays[m];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        // y년 m월 d일이 존재하지 않는다면 -1을 출력
        if(!isExistDay(y, m ,d)) {
            System.out.println("-1");
        }

        // y년 m월 d일이 존재한다면 달에 맞는 계절을 출력
        if(3 <= m && m <= 5) {
            System.out.print("Spring");
        } else if (6 <= m && m <= 8) {
            System.out.print("Summer");
        } else if(9 <= m && m <= 11) {
            System.out.print("Fall");
        } else {
            System.out.print("Winter");
        }
    }
}