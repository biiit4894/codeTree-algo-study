import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 11, hour = 11, mins = 11;

        int a = sc.nextInt(); // 일
        int b = sc.nextInt(); // 시
        int c = sc.nextInt(); // 분

        int elapsedTime = 0;

        if(day > a) {
            elapsedTime = -1;
        } else if(day == a && (hour > b) ) {
            elapsedTime = -1;
        } else if(hour == b && (mins > c)) {
            elapsedTime = -1;
        } else {

            while(true) {
                if(day == a && hour == b && mins == c) {
                    break;
                }

                elapsedTime++;
                mins++;

                if(mins == 60) {
                    mins = 0;
                    hour++;
                }
                if(hour == 24) {
                    hour = 0;
                    day++;
                }
            }
        }
        
        System.out.println(elapsedTime);

    }
}