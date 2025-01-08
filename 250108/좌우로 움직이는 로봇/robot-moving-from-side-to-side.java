import java.util.Scanner;

public class Main {
    public static final int MAX_POS = 1000000;
    public static int[] pos_A = new int[MAX_POS + 1];
    public static int[] pos_B = new int[MAX_POS + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int time_A = 1;
        for(int i = 0; i < n; i++) {
            
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            if(d == 'L') {
                for(int j = t; j > 0; j--) {
                    pos_A[time_A] = pos_A[time_A - 1] - 1;
                    time_A++;
                }
            } else if(d == 'R') {
                for(int j = t; j > 0; j--) {
                    pos_A[time_A] = pos_A[time_A - 1] + 1;
                    time_A++;
                }
            }
        }

        

        int time_B = 1;
        for(int i = 0; i < m; i++) {
            
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L') {
                for(int j = t; j > 0; j--) {
                    pos_B[time_B] = pos_B[time_B - 1] - 1;
                    time_B++;
                }

            } else if(d == 'R') {    
                for(int j = t; j > 0; j--) {
                    pos_B[time_B] = pos_B[time_B - 1] + 1;
                    time_B++;
                }

            }
        }

        if(time_A < time_B) {
            for(int i = time_A; i < time_B; i++) {
                pos_A[i] = pos_A[i - 1];
            }
        } else if(time_A > time_B) {
            for(int i = time_B; i < time_A; i++) {
                pos_B[i] = pos_B[i - 1];
            }
        }


        int max_time = 0;
        if(time_A > time_B) {
            max_time = time_A;
        } else {
            max_time = time_B;
        }

        int answer = 0;
        for(int i = 1; i < max_time; i++) {
            if(pos_A[i] == pos_B[i] && pos_A[i - 1] != pos_B[i - 1]) {
                answer++;
            }
        }

        System.out.print(answer);

    }
}