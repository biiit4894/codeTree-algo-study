import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int[] x1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];

    public static int[] checked = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }

        for(int i = 0; i < n; i++) {
            for(int j = x1[i]; j <= x2[i]; j++) {
                checked[j]++;
            }
        }

        int max = 0;
        for(int i = 0; i <= MAX_R; i++) {
            if(checked[i] > max) {
                max = checked[i];
            }
        }

        System.out.print(max);
    }
}

