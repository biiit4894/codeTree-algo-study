import java.util.Scanner;

public class Main {
    public static int n, t; // n행 n열 사이즈의 격자, 구슬은 t초간 이동
    public static int r, c; // 초기에 구슬은 r행 c열에 놓여 있음
    public static char d; // 초기에 구슬의 이동 방향

    public static final int MAX_N = 50;
    public static final int DIR_NUM = 4;
    public static int[][] board = new int[MAX_N + 1][MAX_N + 1];

    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{1, 0, 0, -1};


    public static int getDir(char a) {
        if(a == 'R') {
            return 0;
        } else if(a == 'D') {
            return 1;
        } else if(a == 'U') {
            return 2;
        } else {
            return 3;
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        n = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        d = sc.next().charAt(0);


        int moveDir = getDir(d);
        r--;
        c--;

        while(t > 0) {
            int nx = r + dx[moveDir];
            int ny = c + dy[moveDir];
            if(!inRange(nx, ny)) {
                moveDir = 3 - moveDir;
            } else {
                r += dx[moveDir];
                c += dy[moveDir];
            }
            
            t--;
        }

        System.out.println((r + 1) + " " + (c + 1));
        

    }
}
