import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int DIR_NUM = 4;

    public static final int[] dx = new int[]{0, -1, 0, 1}; // 동-북-서-남
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static int n;
    public static int x = 0, y = 0, moveDir = 0;
    public static int[][] board = new int[MAX_N][MAX_N];

    public static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static boolean isTimeToTurn(int x, int y) {
        int emptySpaceNum = 0;

        // 현재 위치 x, y에서 4방향으로 회전했을 때 빈 칸이 3개인지 ㅕ부 판단
        for(int i = 0; i < DIR_NUM; i++) {
           moveDir = (moveDir + 1) % 4;
           int nx = x + dx[moveDir];
           int ny = y + dy[moveDir];
           // nx, ny가 격자 범위 내부인지를 판단해야 ArrayIndexOutOfBounds(-1) 예외가 발생하지 않음
           if(isRange(nx, ny) && board[nx][ny] == 0) {
            emptySpaceNum++;
           } 
        }
        if(emptySpaceNum == 3) {
            return true;
        } 
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = n / 2;
        y = n / 2;
        board[x][y] = 1;
        for(int i = 2; i <= n * n; i++) {
            int nx = x + dx[moveDir];
            int ny = y + dy[moveDir];
            // 2번은 회전 없이 1번의 동쪽에 입력
            if(i != 2) {
                // nx, ny가 격자 범위 밖이거나 
                // x, y가 반시계방향 90' 회전해야하는 위치인 경우
                // moveDir 1 증가시키기(3일 경우 0으로 넘기기) -> x, y 입장에서는 반시계방향 90' 회전
                if(!isRange(nx, ny) || isTimeToTurn(x, y)) {
                    moveDir = (moveDir + 1) % 4; 
                    nx = x + dx[moveDir];
                    ny = y + dy[moveDir];
                }
            }
            x = nx;
            y = ny;
            board[nx][ny] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}