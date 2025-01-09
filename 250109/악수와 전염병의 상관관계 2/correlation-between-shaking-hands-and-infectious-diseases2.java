import java.util.Scanner;
import java.util.Arrays;

class HandShake implements Comparable<HandShake> {
    int sec, x, y;

    public HandShake(int sec, int x, int y) {
        this.sec = sec;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(HandShake handShake) {
        return this.sec - handShake.sec;
    }
}

public class Main {
    public static int n, k, p, t;
    public static final int POSITIVE = 1;
    public static final int NEGATIVE = 0; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1명의 개발자가 처음 이 전염병을 옮긴 후
        n = sc.nextInt();  // n명의 개발자가 있음
        k = sc.nextInt();  // k번의 악수 동안 전염병을 옮기고
        p = sc.nextInt();  // 처음 전염병에 걸려 있는 개발자의 번호 p
        t = sc.nextInt();  // T번에 걸쳐 t초에 x개발자가 y개발자와 악수를 나눈 정황이 주어짐

        int[] infection = new int[n + 1]; // 개발자들의 감염 여부
        int[] infectionNum = new int[n + 1]; // 개발자들의 감염 횟수
        HandShake[] handShakes = new HandShake[t]; // 개발자들이 악수를 나눈 정황

        infection[p] = POSITIVE;
        infectionNum[p]++;

        
        for(int i = 0; i < t; i++) {
            // t초에 x개발자가 y개발자와 악수를 나눈다
            // t 값은 모두 다르다
            // x, y 값은 항상 다르게 주어진다
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            handShakes[i] = new HandShake(t, x, y);
        }

        Arrays.sort(handShakes);

        for(int i = 0; i < handShakes.length; i++) {
            int x = handShakes[i].x;
            int y = handShakes[i].y;

            if(infection[x] == 1 && infection[y] == 0) {
                if(infectionNum[x] <= k) {
                    infection[y] = 1; 
                    infectionNum[x]++;
                    infectionNum[y]++;
                }
            } else if(infection[x] == 0 && infection[y] == 1) {
                if(infectionNum[y] <= k) {
                    infection[x] = 1;
                    infectionNum[x]++;
                    infectionNum[y]++;
                }
            } else if(infection[x] == 1 && infection[y] == 1) {
                if(infectionNum[x] <= k) {
                    infectionNum[x]++;
                }
                if(infectionNum[y] <= k) {
                    infectionNum[y]++;
                }
            }
        }
        
        // 모든 악수를 진행한 후에 최종적으로 누가 전염병에 걸렸는지 알아내기
        for(int i = 1; i < n + 1; i++) {
            System.out.print(infection[i]);
        }
    }
}