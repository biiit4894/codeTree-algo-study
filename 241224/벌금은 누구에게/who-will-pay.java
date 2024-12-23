import java.util.Scanner;

public class Main {
    public static int n, m, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[m]; // 벌칙을 받은 학생들의 번호
        int[] nums = new int[n + 1]; // 학생 번호별로 벌칙을 받은 횟수

        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
            nums[arr[i]]++;
        }

        boolean flag = false; // 벌금을 내는 학생이 존재하는지 여부
        for(int i = 1; i <= n; i++) {
            if(nums[i] >= k) {
                flag = true;
                System.out.println(i);
                break;
            }
        }
        if(!flag) {
            System.out.println(-1);
        }
    }
}