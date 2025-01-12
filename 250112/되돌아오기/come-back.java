import java.util.Scanner;

public class Main {
    public static int n;

    public static final int[] dx = new int[]{0, 1, 0, -1};
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static final int MAX_WIDTH = 2001;
    public static final int OFFSET = 1000;

    public static int[][] board = new int[MAX_WIDTH][MAX_WIDTH];

    public static int x = OFFSET, y = OFFSET;

    public static int getDirNum(char c) {
        int dirNum;
        if(c == 'E') {
            dirNum = 0;
        } else if(c == 'S') {
            dirNum = 1;
        } else if(c == 'W') {
            dirNum = 2;
        } else {
            dirNum = 3;
        }
        return dirNum;
    }

    public static boolean isRange(int x, int y) {
        return (x >= 0 && x < MAX_WIDTH && y >= 0 && y < MAX_WIDTH);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board[x][y] = 0;
        int time = 0;
        for(int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();

            int dirNum = getDirNum(dir);

            for(int j = 0; j < dis; j++) {
                x += dx[dirNum];
                y += dy[dirNum];
                time++;
                
                if(isRange(x, y)) {
                    board[x][y] = i + 1;
                }   

                if(x == OFFSET && y == OFFSET) {
                    System.out.println(time);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}