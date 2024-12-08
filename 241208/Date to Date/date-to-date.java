import java.util.Scanner;
// 간단한 풀이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

        int m1, d1, m2, d2;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();   

        int endDate = 0, startDate = 0;

        if(m1 == m2 && d1 == d2) {
            System.out.println(1);
        } else {
            for(int i = 1; i <= m2; i++) {
                endDate += num_of_days[i];
            }
            endDate += d2;

            for(int i = 1; i <= m1; i++) {
                startDate += num_of_days[i];
            }
            startDate += d1;

            System.out.println(endDate - startDate);
        }
      
    }
}