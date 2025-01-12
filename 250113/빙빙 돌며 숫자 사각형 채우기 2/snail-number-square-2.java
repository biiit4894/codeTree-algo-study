import java.util.Scanner;

public class Main {
    public static int n, m, dirNum = 0;

    public static final int MAX_N = 100;
    public static final int[] dx = new int[]{1, 0, -1, 0}; // 남, 동, 북, 서
    public static final int[] dy = new int[]{0, 1, 0, -1};

    public static int[][] board = new int[MAX_N][MAX_N];
    
    public static int x = 0, y = 0;

    public static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board[x][y] = 1;

        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if(!isRange(nx, ny) || board[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
                nx = x + dx[dirNum]; // 방향 전환을 nx, ny에 반영해야 한다. 그렇지 않으면 격자를 벗어난 nx ny 좌표에 숫자를 적게 된다.
                ny = y + dy[dirNum];
            }
            board[nx][ny] = i;
            x = nx;
            y = ny;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}