import java.util.Scanner;


public class Main {

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
            System.out.println(a + " + " + c + " = " + add(a, c));
        } else if(o.equals("-")) {
            System.out.println(a + " - " + c + " = " + subtract(a, c));
        } else if(o.equals("*")) {
            System.out.println(a + " * " + c + " = " + multiply(a, c));
        } else if(o.equals("/")) {
            System.out.println(a + " / " + c + " = " + divide(a, c));

        } else {
            System.out.println("False");
        }

    }
}