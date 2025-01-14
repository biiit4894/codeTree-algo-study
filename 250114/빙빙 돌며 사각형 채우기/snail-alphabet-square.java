import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static final int[] dx = new int[]{0, 1, 0, -1}; // 동 - 남 - 서- 북
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static char[][] board = new char[MAX_N][MAX_N];

    public static int n, m;
    public static int x = 0, y = 0, moveDir = 0;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < MAX_N; i++) {
            for (int j = 0; j < MAX_N; j++) {
                board[i][j] = ' ';
            }
        }

        board[x][y] = 'A';


        for(int i = 1; i < n * m; i++) {
            int nx = x + dx[moveDir];
            int ny = y + dy[moveDir];
            
            if(!inRange(nx, ny) || board[nx][ny] != ' ') {
                moveDir = (moveDir + 1) % 4;
                nx = x + dx[moveDir];
                ny = y + dy[moveDir];
            }

            x = nx;
            y = ny;

            board[nx][ny] = (char)((i % 26) + 'A');
        }

        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(board[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        } 
    }
}
