import java.util.Scanner;

public class Main {
    public static final int MAX_N = 20;
    public static int[][] board = new int[MAX_N + 1][MAX_N + 1];

    public static final int[] dx = new int[]{1, 0, 0, -1};
    public static final int[] dy = new int[]{0, 1, -1, 0};

    public static int n, t, r, c;
    public static char d;

    public static int dirNum;

    public static boolean isRange(int x, int y) {
        return 1 <= x && x <= n && 1 <= y && y <= n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        n = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        d = sc.next().charAt(0);

        if(d == 'D') {
            dirNum = 0;
        } else if(d == 'R') {
            dirNum = 1;
        } else if(d == 'L') {
            dirNum = 2;
        } else {
            dirNum = 3;
        }

        for(int i = 0; i < t; i++) {
            int nx = r + dx[dirNum];
            int ny = c + dy[dirNum];
            
            if(!isRange(nx, ny)) {
                dirNum = 3 - dirNum;
            } else {
                r += dx[dirNum];
                c += dy[dirNum];
            }
        }

        System.out.println(r + " " + c);

    }
}