import java.util.Scanner;
// 해설
public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_M = 10000;
    
    public static int n, m, k;
    public static int[] penalizedPerson = new int[MAX_M];
    public static int[] penaltyNum = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }

        // 각 패널티 수를 세서, 최초로 K번 이상 벌칙을 받는 사람을 추적한다.
        int ans = -1;
        for(int i = 0; i < m; i++) {
            int target = penalizedPerson[i];
            penaltyNum[target]++;

            if(penaltyNum[target] >= k) {
                ans = target;
                break;
            }
        }

        System.out.print(ans);
    }
}