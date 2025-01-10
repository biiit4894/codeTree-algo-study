import java.util.Scanner;

public class Main {
    public static int n;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        int cnt = 0; // 숫자 1이 적힌 칸이 3개 이상인 곳의 개수
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int number1Cnt = 0; // 숫자 1이 적힌 칸의 개수
                int x = i;
                int y = j;
                for(int dirNum = 0; dirNum < 4; dirNum++) {
                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];
                    if(isRange(nx, ny) && arr[nx][ny] == 1) {
                        number1Cnt++;
                    }
                }
                
                if(number1Cnt >= 3) {
                    cnt++;
                }
            }
        } 

        System.out.print(cnt);

    }
}