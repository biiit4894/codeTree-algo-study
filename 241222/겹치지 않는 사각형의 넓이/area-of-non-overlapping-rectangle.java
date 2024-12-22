import java.util.Scanner;

public class Main {
    public static final int MAX_R = 1000;
    public static final int OFFSET = 1000;
    public static final int[][] checked = new int[2 * MAX_R + 1][2 * MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int j = x1 + OFFSET; j < x2 + OFFSET; j++) {
                for(int k = y1 + OFFSET; k < y2 + OFFSET; k++) {
                    if(i == 2) {
                        checked[j][k] = 2;
                    } else {
                        checked[j][k] = 1;
                    }
                }
            }
        }
        int sum = 0;
        for(int i = 0; i <= 2 * MAX_R; i++) {
            for(int j = 0; j <= 2 * MAX_R; j++) {
                if(checked[i][j] == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);

        
    }
}