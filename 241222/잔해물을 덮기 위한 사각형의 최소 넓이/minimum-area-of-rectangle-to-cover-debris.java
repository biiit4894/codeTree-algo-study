import java.util.Scanner;

public class Main {
    public static final int N = 2;
    public static final int MAX_R = 2000;
    public static final int OFFSET = 1000;

    public static int[] x1 = new int[N];
    public static int[] y1 = new int[N];
    public static int[] x2 = new int[N];
    public static int[] y2 = new int[N];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < N; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;    
        }

        for(int i = 0; i < N; i++) {
            for(int x = x1[i]; x < x2[i]; x++) {
                for(int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = i + 1;
                }
            }
        }

        int x1 = 10000;
        int y1 = 10000;
        int x2 = -10000;
        int y2 = -10000;

        boolean flag = true; // 두 번째 직사각형이 첫 번째 직사각형을 감싸는지 여부
        for(int x = 0; x <= MAX_R; x++) {
            for(int y = 0; y <= MAX_R; y++) {
                if(checked[x][y] == 1) {
                    flag = false;
                    System.out.println("1");
                    if(x1 > x) {
                        x1 = x;
                    }
                    if(y1 > y) {
                        y1 = y;
                    }
                    if(x2 < x) {
                        x2 = x;
                    }
                    if(y2 < y) {
                        y2 = y;
                    }
                }
            }
        }
        if(!flag) {
            // 좌측하단 좌표 말고 우측상단 좌표는 +1 한 상태에서 넓이 계산해야 함
            System.out.println((x2 + 1 - x1) * (y2 + 1 - y1));
        } else {
            System.out.println(0);
        }
        

    }
}
