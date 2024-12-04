import java.util.Scanner;

class Level {
    String id;
    String level;

    public Level() {
        this.id = "codetree";
        this.level = "10";
    }

    public Level(String id, String level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String level = sc.next();

        Level level1 = new Level();
        Level level2 = new Level(id, level);

        System.out.println("user " + level1.id + " lv " + level1.level);
        System.out.println("user " + level2.id + " lv " + level2.level);
    }
}