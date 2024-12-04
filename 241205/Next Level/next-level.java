import java.util.Scanner;

class Level {
    String id;
    int level;

    public Level() {
        this.id = "";
        this.level = 0;
    }

    public Level(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.next();

        Level level1 = new Level();
        level1.id = "codetree";
        level1.level = 10;

        Level level2 = new Level();
        level2.id = id;
        level2.level = level;

        System.out.println("user " + level1.id + " lv " + level1.level);
        System.out.println("user " + level2.id + " lv " + level2.level);
    }
}