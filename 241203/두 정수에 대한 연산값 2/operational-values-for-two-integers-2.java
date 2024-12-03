import java.util.Scanner;

class IntWrapper {
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void modify(IntWrapper wrapper1, IntWrapper wrapper2) {
        if(wrapper1.value > wrapper2.value) {
            wrapper2.value += 10;
            wrapper1.value *= 2;
        } else {
            wrapper1.value += 10;
            wrapper2.value *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper wrapper1 = new IntWrapper(a);
        IntWrapper wrapper2 = new IntWrapper(b);
        modify(wrapper1, wrapper2);

        a = wrapper1.value;
        b = wrapper2.value;

        System.out.println(a + " " + b);
    }
}