import java.util.Scanner;
// 해설 풀이
public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_N = 1000;

    public static int n;
    public static char[][] arr = new char[MAX_N][MAX_N];

    public static int startNum;
    public static int x, y, moveDir;

    // 주어진 숫자에 따라
    // 시작 위치와 방향을 구한다.
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

    // (x, y)에서 시작하여 nextDir 방향으로 
    // 이동한 이후의 위치를 구한다.
    public static void move(int nextDir) {
        int[] dx = new int[]{1, 0, -1, 0}; // 남 - 서 - 북 - 동
        int[] dy = new int[]{0, -1, 0, 1};

        x += dx[nextDir];
        y += dy[nextDir];
        moveDir = nextDir;
    }

    // XOR 연산(^)은 두 비트가 다를 때 1, 같을 때 0을 반환한다.
    // decimal | binary
    // 0 ^ 1  =  001 (1 in decimal)
    // 1 ^ 1  =  000 (0 in decimal)
    // 2 ^ 1  =  011 (3 in decimal)
    // 3 ^ 1  =  010 (2 in decimal)
    public static int simulate() {
        int moveNum = 0;
        while(inRange(x, y)) {
            if(arr[x][y] == '/') {
                move(moveDir ^ 1);  // 0 <-> 1 / 2 <-> 3 
            } else {
                move(3 - moveDir);  // 0 <-> 3 / 1 <-> 2
            }
            moveNum += 1;
        }
        return moveNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            for(int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }                
        }

        startNum = sc.nextInt();

        // 시작 위치와 방향을 구한다
        initialize(startNum);
        // (x, y)에서 moveDir 방향으로 시작하여
        // 시뮬레이션을 진행한다.
        int moveNum = simulate();

        System.out.print(moveNum);
    }
}