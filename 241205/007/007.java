import java.util.Scanner;

class Project {
    String secretCode;
    char meetingPoint;
    int time;

    public Project(String code, char point, int t) {
        this.secretCode = code;
        this.meetingPoint = point;
        this.time = t;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char point = sc.next().charAt(0);
        int t = sc.nextInt();

        Project project = new Project(code, point, t);

        System.out.println("secret code : " + project.secretCode);
        System.out.println("meeting point : " + project.meetingPoint);
        System.out.println("time : " + project.time);
    }
}