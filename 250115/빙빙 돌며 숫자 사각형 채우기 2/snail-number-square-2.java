import java.util.Scanner;
// 해설 풀이
public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_N = 100;

    public static int n, m;
    public static int[][] board = new int[MAX_N][MAX_N];

    public static final int[] dx = new int[]{0, 1, 0, -1}; // 동-남-서-북
    public static final int[] dy = new int[]{1, 0, -1, 0};
    

    public static int x, y;         // 시작은 (0, 0)
    public static int moveDir = 1; // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: 위쪽

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        m = sc.nextInt();

        // 처음 시작 위치에 초기값을 적는다.
        board[x][y] = 1;

        // n*m개의 숫자를 적어야 한다.
        for(int i = 2; i <= n * m; i++) { // 숫자 i를 어디에 적을지 결정한다.
            
            // 나아갈 수 있을 때 까지 방향을 바꿔가며 확인한다.
            while(true) {
                // 현재 방향 moveDir을 기준으로 그 다음 위치 값을 계산한다.
                int nx = x + dx[moveDir];
                int ny = y + dy[moveDir];

                // 그 위치로 나아갈 수 있는지 확인한다.
                if(inRange(nx, ny) && board[nx][ny] == 0) {

                    // 나아갈 수 있다면 위치를 갱신해주고 배열에 올바른 값을 채워넣는다.
                    x = nx;
                    y = ny;
                    board[x][y] = i;
                    break;
                } else {
                    // 나아갈 수 없다면 반시계방향으로 90'를 회전하여
                    // 그 다음 방향을 확인한다.
                    moveDir = (moveDir + 3) % 4;
                }
            }
        }

        // 출력
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}
