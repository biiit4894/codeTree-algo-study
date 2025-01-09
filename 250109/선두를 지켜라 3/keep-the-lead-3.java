import java.util.Scanner;

public class Main {
    public static final int MAX_V = 1000;
    public static final int MAX_T = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] posA = new int[MAX_V * MAX_T + 1];
        int[] posB = new int[MAX_V * MAX_T + 1];

        int timeA = 1;
        for(int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;
        for(int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }

        int leader = 0, answer = 0;
        for(int i = 1; i < timeA; i++) {
            if(posA[i] > posB[i]) {
                if(leader != 1) {
                    answer++;
                }
                leader = 1;
            }

            if(posA[i] < posB[i]) {
                if(leader != 2) {
                    answer++;
                }
                leader = 2;
            }

            if(posA[i] == posB[i]) {
                if(leader != 3) {
                    answer++;
                }
                leader = 3;
            }
        }
        System.out.println(answer);
    }
}