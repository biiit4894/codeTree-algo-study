import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_D = 1000000;
    public static final int OFFSET = 100;

    public static int[] posA = new int[MAX_D + 1];
    public static int[] posB = new int[MAX_D + 1];

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
                    posA[timeA] = posA[timeA - 1] - 1;
                    timeA++;
                }
            } else if(d == 'R') {
                for(int j = t; j > 0; j--) {
                    posA[timeA] = posA[timeA - 1] + 1;
                    timeA++;
                }
            }
        }

        // 움직임이 끝난 후에도 A의 위치 유지하기
        for(int i = timeA; i < MAX_D + 1; i++) {
            posA[i] = posA[i - 1];
        }

        // B의 움직임 입력
        int timeB = 1;
        for(int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L') {
                for(int j = t; j > 0; j--) {
                    posB[timeB] = posB[timeB - 1] - 1;
                    timeB++;
                }
            } else if(d == 'R') {
                for(int j = t; j > 0; j--) {
                    posB[timeB] = posB[timeB - 1] + 1;
                    timeB++;
                }
            }
        }

        // 움직임이 끝난 후에도 B의 위치 유지하기
        for(int i = timeB; i < MAX_D + 1; i++) {
            posB[i] = posB[i - 1];
        }

        //int beforeSame = 0;
        boolean isSamePos = false;
        int answer = 0;


        // 바로 직전에 다른 위치에 있다가 그 다음번에 같은 위치에 오게 될 때만 answer 증가
        for(int i = 1; i < MAX_D + 1; i++) {
            if(posA[i] == posB[i]) {
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