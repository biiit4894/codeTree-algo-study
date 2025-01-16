import java.util.Scanner;
// 해설 풀이
public class Main {
    public static final int MAX_N = 100;
    public static final int DIR_NUM = 4;

    // 전역 변수 선언
    public static int n;

    public static int currX, currY;
    public static int moveDir, moveNum;

    public static int[][] grid = new int[MAX_N][MAX_N];

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    // 한 칸 움직인다.
    public static void move() {
        // 문제에서 원하는 진행 순서대로
        // 오른쪽-위-왼쪽-아래 방향이 되도록 정의한다.
        int[] dx = dx = new int[]{0, -1, 0, 1};
        int[] dy = new int[]{1, 0, -1, 0};

        currX += dx[moveDir];
        currY += dy[moveDir];
    }

    public static boolean end() {
        return !inRange(currX, currY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        
        // 시작 위치와 방향, 해당 방향으로 이동할 횟수를 설정한다.
        currX = n / 2;
        currY = n / 2;
        moveDir = 0;
        moveNum = 1;

        int cnt = 1;

        while(!end()) {
            // moveNum 만큼 이동한다.
            for(int i = 0; i < moveNum; i++) {
                grid[currX][currY] = cnt++;
                move();

                // 이동하는 도중 격자를 벗어나게 되면,
                // 움직이는 것을 종료한다.
                if(end()) {
                    break;
                }
            }

            // 방향을 바꾼다.
            moveDir = (moveDir + 1) % 4;
            // 만약 현재 방향이 왼쪽 혹은 오른쪽이 된 경우에는
            // 특정 방향으로 움직여야 할 횟수를 1 증가시킨다.
            if(moveDir == 0 || moveDir == 2) {
                moveNum++;
            }
        }

        // 출력:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}