import java.util.Scanner;

public class Main {
    public static final int OFFSET = 100, MAX_RANGE = 1001;
    public static int pos = 0;
    public static int[] check = new int[MAX_RANGE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("R")) {
                for(int j = pos + OFFSET; j < pos + x + OFFSET; j++) {
                    check[j]++;
                }
                pos += x;
            } else if(dir.equals("L")) {
                for(int j = pos + OFFSET - 1; j >= pos - x + OFFSET; j--) {
                    check[j]++;
                }
                pos -= x;
            }
        }

        int answer = 0;
        for(int i = 0; i < MAX_RANGE; i++) {
            if(check[i] >= 2) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}