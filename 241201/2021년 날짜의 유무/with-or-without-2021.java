import java.util.Scanner;

public class Main {
    public static int[] months31 = {1, 3, 5, 7, 8, 10, 12};
    public static int[] months30 = {4, 6, 9, 11}; 

    public static boolean ismonths31(int m) {
        for(int i : months31) {
            if(i == m) {
                return true;
            }
        }
        return false;
    }

    public static boolean ismonths30(int m) {
        for(int i : months30) {
            if(i == m) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExistDate(int m, int d) {
        if(m == 2) {
            if(d <= 28) {
                return true; 
            }
            return false;
        } else if(ismonths31(m)) {
            if(d <= 31) {
                return true;
            }
            return false;
        } else if(ismonths30(m)) {
            if(d <= 30) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(isExistDate(m, d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}