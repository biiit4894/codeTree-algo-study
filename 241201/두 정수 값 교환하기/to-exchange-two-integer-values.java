import java.util.Scanner; 

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    
    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        IntWrapper n = new IntWrapper(kb.nextInt());
        IntWrapper m = new IntWrapper(kb.nextInt());
        swap(n, m);
        System.out.println(n.value + " " + m.value);
    }
}