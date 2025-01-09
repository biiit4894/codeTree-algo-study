import java.util.Scanner;

public class Main {
    public static int nx, ny = 0;

    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();
            
            if(dir == 'E') {
                nx += dx[0] * dis;
                ny += dy[0] * dis;
            } else if(dir == 'S') {
                nx += dx[1] * dis;
                ny += dy[1] * dis;
            } else if(dir == 'W') {
                nx += dx[2] * dis;
                ny += dy[2] * dis;
            } else if(dir == 'N') {
                nx += dx[3] * dis;
                ny += dy[3] * dis;
            }
        }

        System.out.print(nx + " " + ny);
    }
}