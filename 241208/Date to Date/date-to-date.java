import java.util.Scanner;
// while문 풀이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

        int m1, d1, m2, d2;
        int elapsedDays = 0;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();   

        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }
            elapsedDays++;
            d1++;

            if(d1 > days[m1]) {
                d1 = 0;
                m1++;
            }
        }

        System.out.println(elapsedDays);
    }
}