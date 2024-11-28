public class Main {
    public void print10Stars() {
        for(int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main T = new Main();
        for(int i = 0; i < 5; i++) {
            
            T.print10Stars();
        }
    }
}