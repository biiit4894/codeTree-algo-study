import java.util.Scanner;


public class Main {
    static int answer;

    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();

        int answer;

        if(o.equals("+")) {
            answer = add(a, c);
            System.out.println(a + " + " + c + " = " + answer);
        } else if(o.equals("-")) {
            answer = subtract(a, c);
            System.out.println(a + " - " + c + " = " + answer);
        } else if(o.equals("*")) {
            answer = multiply(a, c);
            System.out.println(a + " * " + c + " = " + answer);
        } else if(o.equals("/")) {
            answer = divide(a, c);
            System.out.println(a + " / " + c + " = " + answer);

        } else {
            System.out.println("False");
        }

    }
}