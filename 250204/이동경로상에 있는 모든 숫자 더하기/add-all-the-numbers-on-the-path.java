import java.util.Scanner;

public class Main {
    public static final int MAX_N = 99;
    // 0 -> 3
    // 1 -> 0
    // 2 -> 1
    // 3 -> 2

    public static final int[] dx = new int[]{0, 1, 0, -1}; // 동-남-서-북
    public static final int[] dy = new int[]{1, 0, -1, 0};
    
    public static int[][] grid = new int[MAX_N][MAX_N];

    public static int n, t;
    public static String str;

    public static int currX, currY, moveDir = 3, ans;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        str = sc.next();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        currX = n / 2;
        currY = n / 2;
        ans = grid[currX][currY];

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'L') {
                moveDir = (moveDir + 3) % 4;
            } else if(str.charAt(i) == 'R') {
                moveDir = (moveDir + 1) % 4;
            } else if(str.charAt(i) == 'F') {
                int nextX = currX + dx[moveDir];
                int nextY = currY + dy[moveDir];
                if(inRange(nextX, nextY)) {
                    ans += grid[nextX][nextY];
                    currX = currX + dx[moveDir];
                    currY = currY + dy[moveDir];
                }
            }
        }

        System.out.println(ans);

    }
}