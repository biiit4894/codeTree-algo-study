import java.util.Scanner;

public class Main {
    public static final int MAX_INT = 201, OFFSET = 100;
    public static int[] arr = new int[MAX_INT];
    public static int[] check = new int[1000];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int position = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("L")) {
                for(int j = position + OFFSET; j > position - x + OFFSET; j--) {
                    check[j]++;
                }
                position -= x;
            } else if(dir.equals("R")) {
                for(int j = position + OFFSET; j < position + x + OFFSET; j++) {
                    check[j]++;
                }
                position += x;
            }
        }

        int answer = 0;
        for(int i = 0; i < 1000; i++) {
            if(check[i] >= 2) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}