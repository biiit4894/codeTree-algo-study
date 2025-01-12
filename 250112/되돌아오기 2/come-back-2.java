import java.util.Scanner;

public class Main {
    public static int x, y;
    public static final int answer = -1;
    public static int elapsedTime;
    public static String str;

    // 북, 동, 남, 서
    public static final int[] dx = new int[]{0, 1, 0, -1};
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        int dirNum = 0;
        for(int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if(dir == 'L') {
                dirNum = (dirNum + 3) % 4;
            } else if(dir == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                x += dx[dirNum];
                y += dy[dirNum];
            }
            elapsedTime++;

            if(x == 0 && y == 0) {
                System.out.println(elapsedTime);
                return;
            }
        }

        System.out.println(answer);
    }
}