import java.util.Scanner;
// 해설
public class Main {
    public static final int MAX_N = 100;
    public static final int DIR_NUM = 4;
    
    public static int n;
    public static int[][] arr = new int[MAX_N][MAX_N];

    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int adjaCentCnt(int x, int y) {
        int cnt = 0;
        for(int i = 0; i < DIR_NUM; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(inRange(nx, ny) && arr[nx][ny] == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 각 칸을 탐색
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(adjaCentCnt(i, j) >= 3) {
                    ans++;
                }
            }
        }

        System.out.print(ans);

    }
}