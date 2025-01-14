import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static final int[] dx = new int[]{1, 0, -1, 0}; // 남-서-북-동
    public static final int[] dy = new int[]{0, -1, 0, 1};

    public static int n, k;
    public static int x, y, moveDir;
    public static char[][] board = new char[MAX_N][MAX_N];

    // 주어진 숫자에 따라 시작 위치와 방향을 구한다.
    public static void initialize(int num) {
        if(num <= n) {
            x = 0;
            y = num - 1;
            moveDir = 0;
        } else if(num <= 2 * n) {
            x = num - n - 1;
            y = n - 1;
            moveDir = 1;
        } else if(num <= 3 * n) {
            x = n - 1;
            y = n - (num - 2 * n);
            moveDir = 2;
        } else {
            x = n - (num - 3 * n);
            y = 0;
            moveDir = 3;
        } 
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    // (x, y)에서 시작해 nextDir 방향으로 움직인 뒤의 위치를 구한다. 
    public static void move(int nextDir) {
        x += dx[nextDir];
        y += dy[nextDir];
        moveDir = nextDir;
    }

    
    public static int simulate() {
        int moveNum = 0;
        while(inRange(x, y)) {
            if(board[x][y] == '/') {
                move(moveDir ^ 1);
            } else {
                move(3 - moveDir);
            }
            moveNum++;
        }
        return moveNum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            for(int j = 0; j < n; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        k = sc.nextInt();
        initialize(k);

        int moveNum = simulate();
        System.out.println(moveNum);
    }
}