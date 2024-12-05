import java.util.Scanner;

class Bomb {
    String removeCode;
    char stringColor;
    int second;

    public Bomb(String removeCode, char stringColor, int second) {
        this.removeCode = removeCode;
        this.stringColor = stringColor;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();
        Bomb bomb = new Bomb(code, color, second);

        System.out.println("code : " + bomb.removeCode);
        System.out.println("color : " + bomb.stringColor);
        System.out.println("second : " + bomb.second);

    }
}