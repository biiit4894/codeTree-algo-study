import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static int[] arr_a = new int[MAX_N * MAX_N + 1];   
    public static int[] arr_b = new int[MAX_N * MAX_N + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        int a_loc = 0;
        int a_time = 0;
        for(int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            if(d == 'L') {
                for(int j = 0; j < t; j++) {
                    arr_a[a_time] = a_loc;
                    a_time++;
                    a_loc--;
                }
            } else {
                for(int j = 0; j < t; j++) {
                    arr_a[a_time] = a_loc;
                    a_time++;
                    a_loc++;
                }
            }
        }

        int b_loc = 0;
        int b_time = 0;
        for(int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            if(d == 'L') {
                for(int j = 0; j < t; j++) {
                    arr_b[b_time] = b_loc;
                    b_time++;
                    b_loc--;
            
                }
            } else {
                for(int j = 0; j < t; j++) {
                    arr_b[b_time] = b_loc;
                    b_time++;
                    b_loc++;
                }
            }
        }

        boolean isSameLoc = false;
        for(int i = 1; i < a_time; i++) {
            if(arr_a[i] == arr_b[i]) {
                isSameLoc = true;
                System.out.println(i);
                break;
            }
        }
        if(!isSameLoc) {
            System.out.println(-1);
        }
    }
}