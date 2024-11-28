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
            
            int dirNum;
            if(dir.equals("E")) {
                dirNum = 0;
            } else if(dir.equals("S")) {
                dirNum = 1;
            } else if(dir.equals("W")) {
                dirNum = 2;
            } else {
                dirNum = 3;
            }

            nx += dx[dirNum] * dis;
            ny += dy[dirNum] * dis;
        }

        System.out.println(nx + " " + ny);
    }
}