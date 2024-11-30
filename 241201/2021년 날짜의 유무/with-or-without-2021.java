import java.util.Scanner;

public class Main {
    // 윤년이 아닐 때 m번째 달의 마지막 날을 반환하는 함수
    public static int lastDayNumber(int m) {
        if(m == 2) {
            return 28;
        }
        if(m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        return 31;
    }

    // 윤년이 아닐 (2월달이 28일까지 있음) m월 d일이 존재하는지 여부를 확인하는 함수
    public static boolean judgeDay(int m, int d) {
        if(m <= 12 && d <= lastDayNumber(m)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(judgeDay(m, d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}