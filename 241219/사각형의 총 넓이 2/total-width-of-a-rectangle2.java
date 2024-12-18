import java.util.Scanner;

public class Main {
    
    public static final int OFFSET = 100;
    public static final int[][] rect = new int[2 * OFFSET + 1][2 * OFFSET + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    rect[j][k] = 1;
                }    
            }
        }

        int sum = 0;
        for(int i = 0; i <= 2 * OFFSET; i++) {
            for(int j = 0; j <= 2 * OFFSET; j++)  {
                if(rect[i][j] == 1) {
                    sum++;
                }
            }
            
        }

        System.out.print(sum);
        
    }
}