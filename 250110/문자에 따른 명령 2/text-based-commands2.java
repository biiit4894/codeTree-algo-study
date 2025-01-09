import java.util.Scanner;

public class Main {
    public static final int[] dx = {0, 1, 0, -1};
    public static final int[] dy = {1, 0, -1, 0};

    public static final char LEFT_90 = 'L';
    public static final char RIGHT_90 = 'R';
    public static final char FORWARD = 'F';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int nx = 0;
        int ny = 0;

        int dirNum = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == LEFT_90) {
                dirNum = (dirNum - 1 + 4) % 4;
            } else if(c == RIGHT_90) {
                dirNum = (dirNum + 1) % 4;
            } else {
                nx += dx[dirNum];
                ny += dy[dirNum];
            }
        }

        System.out.print(nx + " " + ny);
        

    }
}