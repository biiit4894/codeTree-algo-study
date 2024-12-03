import java.util.Scanner;

public class Main {
    public static String m, n;
    
    public static int getStartIndex() {
        for(int i = 0; i < n.length() - 1; i++) {
            for(int j = 0; j < m.length() - 1; j++) {
                if(n.charAt(i) == m.charAt(j) && n.charAt(i + 1) == m.charAt(j + 1)) {
                    return j;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.next();
        n = sc.next();
        System.out.println(getStartIndex());
    }
}