import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_N = 100; 
    public static final int MAX_M = 100;
    public static int[][] board = new int[MAX_N][MAX_M];

    public static final int[] dx = new int[]{0, 1, 0, -1};
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static int x = 0, y = 0;
    public static int dirNum = 0;

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
            } 

            x += dx[dirNum];
            y += dy[dirNum];
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