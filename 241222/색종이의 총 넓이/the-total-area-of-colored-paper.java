import java.util.Scanner;

public class Main {
    public static final int MAX_R = 200;
    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        for(int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();

            for(int j = x1[i]; j < x1[i] + 8; j++) {
                for(int k = y1[i]; k < y1[i] + 8; k++) {
                    checked[j][k] = i + 1;
                }
            }
        }

        int area = 0;
        for(int i = 0; i <= MAX_R; i++) {
            for(int j = 0; j <= MAX_R; j++) {
                if(checked[i][j] != 0) {
                    area++;
                }
            }
        }

        System.out.println(area);

    }
}