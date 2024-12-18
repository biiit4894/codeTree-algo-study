import java.util.Scanner;

public class Main {
    public static int MAX_K = 100000;

    public static int[] checked = new int[2 * MAX_K + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int dis = sc.nextInt();
            char dir = sc.next().charAt(0);

            if(dir == 'L') {
                while(dis > 0) {
                    checked[dis] = 1;
                    dis--;
                }

            } else {
                while(dis > 0) {
                    checked[dis] = 2;
                    dis--;
                }
            }
        }
        
        int white = 0;
        int black = 0;
        for(int i = 0; i <= 2 * MAX_K; i++) {
            if(checked[i] == 1) {
                white++;
            } else if(checked[i] == 2) {
                black++;
            }
        }

        System.out.print(white + " " + black);
    }
}