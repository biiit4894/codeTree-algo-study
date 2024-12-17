import java.util.Scanner;

public class Main {
    public static final int MAX_R = 100000;
    
    public static int[] whiteCount = new int[2 * MAX_R + 1];
    public static int[] blackCount = new int[2 * MAX_R + 1];

    public static final char[] checked = new char[2 * MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cur = MAX_R;
        for(int i = 0; i < n; i++) {
            int dis = sc.nextInt();
            char dir = sc.next().charAt(0);

            if(dir == 'L') {
                while(dis > 0) {
                    checked[cur] = 'w';
                    whiteCount[cur]++;
                    cur--;
                    dis--;
                } 
                cur++; // 마지막 위치 보정
            } else {                
                while(dis > 0) {
                    checked[cur] = 'b';
                    blackCount[cur]++;
                    cur++;
                    dis--;
                }
                cur--; // 마지막 위치 보정
            }
            
        }

        int white = 0;
        int black = 0;
        int gray = 0;
    
        for(int i = 0; i < 2 * MAX_R + 1; i++) {
            if(whiteCount[i] >= 2 && blackCount[i] >= 2) {
                gray++;
            } else if(checked[i] == 'w') {
                white++;
            } else if(checked[i] == 'b') {
                black++;
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}