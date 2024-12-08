import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        int elapsedTime = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        while(true) {
            if(a == c && b == d) {
                break;
            }

            elapsedTime++;
            b++;

            if(b == 60) {
                a++;
                b = 0;
            }
        }

        System.out.println(elapsedTime);

    }
}