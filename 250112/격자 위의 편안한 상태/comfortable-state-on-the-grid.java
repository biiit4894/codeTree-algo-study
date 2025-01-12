import java.util.Scanner;

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_N = 100;
    public static int[][] board = new int[MAX_N + 1][MAX_N + 1];
    public static final int[] dx = new int[]{0, 1, 0, -1};
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static int n, m, ans;
    
    public static boolean isRange(int x, int y) {
        return (1 <= x && x <= n && 1 <= y && y <= n);
    }

    public static boolean isComfortable(int x, int y) {
        int cnt = 0;
        for(int i = 0; i < DIR_NUM; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(isRange(nx, ny) && board[nx][ny] == 1) {
                cnt++;
            }
        }
        if(cnt == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int ans;
        for(int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            board[r][c] = 1;
            if(isComfortable(r, c)) {
                ans = 1;
            } else {
                ans = 0;
            }
            System.out.println(ans);
        }
    }
}