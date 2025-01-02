import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_D = 1000000;
    public static final int OFFSET = 100;

    public static int[] posA = new int[2 * MAX_D + 1];
    public static int[] posB = new int[2 * MAX_D + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        // A의 움직임 입력
        int timeA = 1;
        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L') {
                for(int j = t; j > 0; j--) {
                    posA[timeA] = posA[timeA - 1] - 1 + OFFSET;
                    timeA++;
                }
            } else if(d == 'R') {
                for(int j = t; j > 0; j--) {
                    posA[timeA] = posA[timeA - 1] + 1 + OFFSET;
                    timeA++;
                }
            }
        }

        // B의 움직임 입력
        int timeB = 1;
        for(int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L') {
                for(int j = t; j > 0; j--) {
                    posB[timeB] = posB[timeB - 1] - 1 + OFFSET;
                    timeB++;
                }
            } else if(d == 'R') {
                for(int j = t; j > 0; j--) {
                    posB[timeB] = posB[timeB - 1] + 1 + OFFSET;
                    timeB++;
                }
            }
        }

        boolean isSamePos = false;
        int answer = 0;
        int time = 0;

        // A가 B보다 오랜 시간 이동한 경우
        if(timeA > timeB) {
            time = timeA;
            for(int i = timeB; i <= timeA; i++) {
                posB[i] = posB[i - 1] + OFFSET; // 차이 나는 시간만큼 B의 시간별 위치를 오프셋 값만 계속 더해서(그동안 이동하고 있는 A는 오프셋이 계속 증가하기 때문에) 그대로 채워주기
            }
        } else { // B가 A보다 오랜 시간 이동한 경우
            time = timeB;
            for(int i = timeA; i <= timeB; i++) {
                posA[i] = posA[i - 1] + OFFSET; // 차이 나는 시간 만큼 A의 시간별 위치를 오프셋 값만 계속 더해서(그동안 이동하고 있는 B는 오프셋이 계속 증가하기 때문에) 그대로 채워주기
            }
        }

        // 바로 직전에 다른 위치에 있다가 그 다음번에 같은 위치에 오게 될 때만 answer 증가
        for(int i = 1; i < time; i++) {
            if(posA[i] == posB[i] && i != 1) {
                if(!isSamePos) {
                    answer++;
                }
                isSamePos = true;
            } else {
                isSamePos = false;
            }
        }
        System.out.print(answer);

    }
}