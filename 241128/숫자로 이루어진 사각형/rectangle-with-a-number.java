import java.util.Scanner;

public class Main {
    public static void printRect(int n) {
        int idx = 1;
        for(int i = 0; i <= n * n / 9; i++) {
            
            for(int j = 1; j <= 9; j++) {
                if(idx > n * n) {
                    break;
                }
                System.out.print(j + " ");
                if(idx % 4 == 0) {
                    System.out.println();
                }
                idx++;
            }
        }   
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRect(n);
        
    }
}