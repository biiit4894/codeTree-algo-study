import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int nx = 0;
        int ny = 0;

        for(int i = 0; i < n; i++) {
            String dir = sc.next(); // E, S, W, N
            int dis = sc.nextInt();
            if(dir.equals("E")) {
                nx += dx[0] * dis;
                ny += dy[0];
            } else if(dir.equals("S")) {
                nx += dx[1];
                ny += dy[1] * dis;
            } else if(dir.equals("W")) {
                nx += dx[2] * dis;
                ny += dy[2];
            } else {
                nx += dx[3];
                ny += dy[3] * dis;
            }
        }

        System.out.println(nx + " " + ny);
    }
}