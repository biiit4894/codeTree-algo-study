import java.util.Scanner; 

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void modify(IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();

        IntWrapper n = new IntWrapper(a);
        IntWrapper m = new IntWrapper(b);

        modify(n, m); 
        a = n.value;
        b = m.value;

        System.out.println(a + " " + b);
    }
}