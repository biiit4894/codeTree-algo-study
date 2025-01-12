import java.util.Scanner;
// 첫 풀이
public class Main {
    public static final int SIDE_NUM = 4;
    public static final int MAX_N = 1000;

    // 거울 튕김 확인을 위한 격자
    public static int[][] map = new int[MAX_N + 1][MAX_N + 1];
    
    // k에 대한 행, 열 번호 파악을 위한 격자
    public static int[][] board = new int[MAX_N + 1][MAX_N + 1];

    // 격자 동,남,서,북
    public static final int[] dx = new int[]{0, 1, 0, -1};
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static int n, k;
    public static int x = 1, y = 1, dirNum = 0;

    public static boolean isRange(int x, int y) {
        return (1 <= x && x <= n && 1 <= y && y <= n);
    }

    public static int getGroupNum(int k) {
        if(k <= n) {
            return 1;
        } else if(k <= 2 * n) {
            return 2;
        } else if(k <= 3 * n) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '/') {
                    map[i][j] = 1;
                } else if(c == '\\') {
                    map[i][j] = 2;
                }
            }                
        }

        k = sc.nextInt();

        board[1][1] = 1;

        // 시계방향으로 돌면서 위치 표시..를 하려고 했던 것
        // ex) n = 3, k = 8
        // 1 2 4
        // 0 0 5
        // 0 8 7
        // 그리고 k가 위치한 행, 열을 찾아서 그 다음 스텝을 진행하려했음...

        for(int i = 2; i <= k; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            // 격자 범위 밖이거나 이미 방문한 경우 시계방향 90' 회전
            if(!isRange(nx, ny) || board[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
                board[x][y] = i;
            } 
            x = nx;
            y = ny;
            board[nx][ny] = i;
        }

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}