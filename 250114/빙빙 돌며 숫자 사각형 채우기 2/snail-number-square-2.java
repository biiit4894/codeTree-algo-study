import java.util.Scanner;
public class Main {
    public static final int MAX_N = 100;
    public static final int[] dx = new int[]{0, 1, 0, -1}; // 동-남-서-북
    public static final int[] dy = new int[]{1, 0, -1, 0};
    
    public static int[][] board = new int[MAX_N][MAX_N];

    public static int x = 0, y = 0, moveDir = 1;
    public static int n, m;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board[x][y] = 1;

        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[moveDir];
            int ny = y + dy[moveDir];

            if(!inRange(nx, ny) || board[nx][ny] != 0) {
                // 이동 방향 반시계 방향으로 90' 회전
                moveDir = (moveDir + 3) % 4;
                nx = x + dx[moveDir];
                ny = y + dy[moveDir]; 
            }

            x = nx;
            y = ny;
            board[x][y] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}