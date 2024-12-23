import java.util.Scanner;

public class Main {
    public static int n, m, k;

    public static int getPunishStudentNo(int[] nums) {
        for(int i = 1; i <= n; i++) {
            if(nums[i] >= k) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[m]; // 벌칙을 받은 학생들의 번호
        int[] nums = new int[n + 1]; // 학생 번호별로 벌칙을 받은 횟수

        boolean flag = false; // 벌칙을 받는 학생이 존재하는지 여부
        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
            nums[arr[i]]++;
            if(getPunishStudentNo(nums) != 0) {
                flag = true;
                System.out.println(getPunishStudentNo(nums));
                break;
            }
        }
        if(!flag) {
            System.out.println(-1);
        }
    }
}