import java.util.Scanner;
// 해설
public class Main {
    
    public static final int MAX_N = 100;
    public static final int MAX_R = 2000;
    public static final int OFFSET = 1000;

    public static int[] x1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];

    public static int[] checked = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cur = 0;

        for(int i = 0; i < n; i++) {
            int dis = sc.nextInt();
            String dir = sc.next();
            
            // 오른쪽 이동
            if(dir.equals("R")) {
                x1[i] = cur;
                x2[i] = cur + dis;
                cur += dis;
            } else { // 왼쪽 이동
                x1[i] = cur - dis;
                x2[i] = cur;
                cur -= dis; 
            }

            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }

        for(int i = 0; i < n; i++) {
            for(int j = x1[i]; j < x2[i]; j++) {
                checked[j]++;
            }
        }

        int answer = 0;
        for(int i = 0; i <= MAX_R; i++) {
            if(checked[i] >= 2) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}