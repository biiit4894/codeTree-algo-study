import java.util.Scanner;

public class Main {    
    public static final int MAX_N = 100;
    
    public static int[] arr = new int[MAX_N + 1];
    public static int cnt;
    
    // 문제에서 구하고자 하는 값을 반환합니다.
    public static int getAnswer() {
        int returnValue = 0;
        while(cnt >= 1) {
            returnValue += arr[cnt];
            
            if(cnt % 2 == 0)
                cnt /= 2;
            else
                cnt--;
        }
    
        return returnValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        cnt = m;
        
        System.out.print(getAnswer());
    }
}