import java.util.Scanner;

public class Main {
    public static String m, n;
    
    public static int getStartIndex() {
        for(int i = 0; i < m.length(); i++) {
            if(m.substring(i).startsWith(n)) {
                return i;
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