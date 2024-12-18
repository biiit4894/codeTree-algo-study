import java.util.Scanner;

public class Main {
    public static int MAX_K = 100000;

    public static int[] checked = new int[2 * MAX_K + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cur = MAX_K;

        for(int i = 0; i < n; i++) {
            int dis = sc.nextInt();
            char dir = sc.next().charAt(0);

            if(dir == 'L') {
                while(dis > 0) {
                    checked[cur] = 1;
                    cur--;
                    dis--;
                }
                cur++; // cur값 보정 필요

            } else if(dir == 'R') {
                while(dis > 0) {
                    checked[cur] = 2;
                    cur++;
                    dis--;
                }
                cur--; // cur값 보정 필요
            }
        }
        
        int white = 0;
        int black = 0;
        for(int i = 0; i <= 2 * MAX_K; i++) {
            if(checked[i] == 1) {
                white++;
            } else if(checked[i] == 2) {
                black++;
            }
        }

        System.out.print(white + " " + black);
    }
}